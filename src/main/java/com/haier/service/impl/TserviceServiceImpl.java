package com.haier.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haier.anno.SKey;
import com.haier.enums.PackageEnum;
import com.haier.enums.SortEnum;
import com.haier.mapper.TserviceMapper;
import com.haier.po.Ti;
import com.haier.po.Tservice;
import com.haier.po.TserviceExample;
import com.haier.po.Tservicedetail;
import com.haier.service.TiService;
import com.haier.service.TserviceService;
import com.haier.service.TservicedetailService;
import com.haier.util.ClassUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/**
 * @Description: TserviceService实现类
 * @Author: luqiwei
 * @Date: 2018/5/18 14:11
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Slf4j
@Service
public class TserviceServiceImpl implements TserviceService {

    @Autowired
    TserviceMapper tserviceMapper;

    @Autowired
    TiService tiService;

    @Autowired
    TservicedetailService tservicedetailService;

    @Override
    public Tservice selectOne(Integer id) {
        return tserviceMapper.selectByPrimaryKey(id);
    }

    @Override
    public Tservice selectOne(String className) {
        List<Tservice> tservices = this.selectByCondition(null);
        for (Tservice tservice : tservices) {
            if (StringUtils.isNoneBlank(tservice.getClassname(), className) && tservice.getClassname().equals(className)) {
                return tservice;
            }
        }
        return null;
    }

    @Override
    public PageInfo<Tservice> selectByCondition(Tservice tservice, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize, SortEnum.UPDATETIME.getValue() + "," + SortEnum.ID.getValue());
        List<Tservice> tservices = this.selectByCondition(tservice);
        PageInfo<Tservice> pageInfo = new PageInfo<>(tservices);
        return pageInfo;
    }

    @Override
    public List<Tservice> selectByCondition(Tservice tservice) {
        TserviceExample tserviceExample = new TserviceExample();
        TserviceExample.Criteria criteria = tserviceExample.createCriteria();
        criteria.andIsdelNotEqualTo(1);
        if (tservice != null) {
            if (tservice.getId() != null)
                criteria.andIdEqualTo(tservice.getId());
            if (StringUtils.isNotBlank(tservice.getServicekey())) {
                criteria.andServicekeyLike("%" + tservice.getServicekey() + "%");
                //构建一个criteria查询servicename
                TserviceExample.Criteria criteriaServicename = tserviceExample.createCriteria();
                criteriaServicename.andIsdelNotEqualTo(1);
                criteriaServicename.andServicenameLike("%" + tservice.getServicekey() + "%");
                if (tservice.getId() != null)
                    criteriaServicename.andIdEqualTo(tservice.getId());
                if (StringUtils.isNotBlank(tservice.getServicename()))
                    criteriaServicename.andServicenameLike("%" + tservice.getServicename() + "%");
                if (StringUtils.isNotBlank(tservice.getEditor()))
                    criteriaServicename.andEditorLike("%" + tservice.getEditor() + "%");
                if (StringUtils.isNotBlank(tservice.getClassname()))
                    criteriaServicename.andClassnameEqualTo(tservice.getClassname());
                tserviceExample.or(criteriaServicename);
            }
            if (StringUtils.isNotBlank(tservice.getServicename()))
                criteria.andServicenameLike("%" + tservice.getServicename() + "%");
            if (StringUtils.isNotBlank(tservice.getEditor()))
                criteria.andEditorLike("%" + tservice.getEditor() + "%");
            if (StringUtils.isNotBlank(tservice.getClassname()))
                criteria.andClassnameEqualTo(tservice.getClassname());
        }
        return tserviceMapper.selectByExample(tserviceExample);
    }

    @Override
    public Integer updateOne(Tservice tservice) {
        tservice.setClassname(tservice.getServicekey() + "DefaultTest");
        return tserviceMapper.updateByPrimaryKeySelective(tservice);
    }

    @Override
    public Integer insertOne(Tservice tservice) {
        tservice.setClassname(tservice.getServicekey() + "DefaultTest");
        tserviceMapper.insertSelective(tservice);
        return tservice.getId();
    }

    @Override
    public Integer deleteOne(Integer id) {
        if (id == null) {
            return null;
        }
        //删除ti表中的记录
        Ti ti = new Ti();
        ti.setServiceid(id);
        tiService.deleteByCondition(ti);
        //删除tservicedetail表中的记录
        Tservicedetail tservicedetail = new Tservicedetail();
        tservicedetail.setServiceid(id);
        tservicedetailService.deleteByCondition(tservicedetail);

        //删除tservice表中的记录
        Tservice tservice = new Tservice();
        tservice.setId(id);
        tservice.setIsdel(1);
        return this.updateOne(tservice);
    }

    @Override
    public Map<String, List<String>> getTestClasses() {
        Map<String, List<String>> ret = new HashMap<>();
        List<String> baseClassNames = ClassUtil.getClassName(PackageEnum.BASE.getPackageName());
        List<String> testClassNames = ClassUtil.getClassName(PackageEnum.TEST.getPackageName());

        Consumer<String> consumer = className -> {
            try {
                Class<?> clazz = Class.forName(className);
                String value = clazz.getAnnotation(SKey.class).value();
                String simpleClassName = clazz.getSimpleName();
                if (StringUtils.isBlank(value)) {
                    return;
                }
                if (ret.containsKey(value)) {
                    ret.get(value).add(simpleClassName);
                } else {
                    List<String> l = new ArrayList<>();
                    l.add(simpleClassName);
                    ret.put(value, l);
                }
            } catch (ClassNotFoundException e) {
            } catch (NullPointerException e) {
            }
        };
        baseClassNames.stream().forEach(consumer);
        testClassNames.stream().forEach(consumer);

        return ret;
    }

    @Override
    public List<String> getTestClasses(String sKey) {
        Map<String, List<String>> testClasses = this.getTestClasses();
        List<String> strings = testClasses.get(sKey);
        return strings == null ? new ArrayList<>() : strings;
    }

    @Override
    public List<String> getTestClasses(Integer sId) {
        return this.getTestClasses(this.selectOne(sId).getServicekey());

    }


}
