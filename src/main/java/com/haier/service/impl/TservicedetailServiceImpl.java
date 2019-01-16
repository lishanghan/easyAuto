package com.haier.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haier.enums.SortEnum;
import com.haier.mapper.TservicedetailCustomMapper;
import com.haier.mapper.TservicedetailMapper;
import com.haier.po.Tservicedetail;
import com.haier.po.TservicedetailCustom;
import com.haier.po.TservicedetailExample;
import com.haier.service.TservicedetailService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/5/30 19:55
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Slf4j
@Service
public class TservicedetailServiceImpl implements TservicedetailService {
    @Autowired
    TservicedetailMapper tservicedetailMapper;

    @Autowired
    TservicedetailCustomMapper tservicedetailCustomMapper;

    @Override
    public Integer insertOne(Tservicedetail tservicedetail) {
        tservicedetailMapper.insertSelective(tservicedetail);
        return tservicedetail.getId();
    }

    @Override
    public Integer deleteOne(Integer id) {
        Tservicedetail tservicedetail = new Tservicedetail();
        tservicedetail.setId(id);
        tservicedetail.setStatus(-1);
        return this.updateOne(tservicedetail);
    }

    /**
     * 根据条件删除tservicedetail记录,现在支持的条件 有serviceid和envid
     *
     * @param tservicedetail
     * @return
     */
    @Override
    public Integer deleteByCondition(Tservicedetail tservicedetail) {
        if (tservicedetail == null || !ObjectUtils.anyNotNull(tservicedetail.getServiceid(), tservicedetail.getEnvid())) {
            return null;
        }
        TservicedetailExample example = new TservicedetailExample();
        TservicedetailExample.Criteria criteria = example.createCriteria();
        criteria.andStatusGreaterThan(0);
        if (tservicedetail.getServiceid() != null)
            criteria.andServiceidEqualTo(tservicedetail.getServiceid());
        if (tservicedetail.getEnvid() != null)
            criteria.andEnvidEqualTo(tservicedetail.getEnvid());
        Tservicedetail t = new Tservicedetail();
        t.setStatus(-1);
        return tservicedetailMapper.updateByExampleSelective(t, example);
    }

    @Override
    public Tservicedetail selectOne(Integer id) {
        return tservicedetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public Tservicedetail selectOne(Integer serviceId, Integer envId) {
        Tservicedetail tservicedetail = new Tservicedetail();
        tservicedetail.setServiceid(serviceId);
        tservicedetail.setEnvid(envId);
        List<Tservicedetail> tservicedetails = this.selectByCondition(tservicedetail);
        if (tservicedetails != null && tservicedetails.size() > 0) {
            return tservicedetails.get(0);
        }
        return null;
    }

    @Override
    public Integer updateOne(Tservicedetail tservicedetail) {
        return tservicedetailMapper.updateByPrimaryKeySelective(tservicedetail);
    }

    @Override
    public List<Tservicedetail> selectByCondition(Tservicedetail tservicedetail) {
        TservicedetailExample example = new TservicedetailExample();
        TservicedetailExample.Criteria criteria = example.createCriteria();
        criteria.andStatusGreaterThan(0);
        if (tservicedetail != null) {
            if (tservicedetail.getId() != null)
                criteria.andIdEqualTo(tservicedetail.getId());
            if (tservicedetail.getServiceid() != null)
                criteria.andServiceidEqualTo(tservicedetail.getServiceid());
            if (tservicedetail.getEnvid() != null)
                criteria.andEnvidEqualTo(tservicedetail.getEnvid());
            if (StringUtils.isNotBlank(tservicedetail.getHostinfo()))
                criteria.andHostinfoLike("%" + tservicedetail.getHostinfo() + "%");
            if (StringUtils.isNotBlank(tservicedetail.getDbinfo()))
                criteria.andDbinfoLike("%" + tservicedetail.getDbinfo() + "%");
            if (StringUtils.isNotBlank(tservicedetail.getSwaggerurl()))
                criteria.andSwaggerurlLike("%" + tservicedetail.getSwaggerurl() + "%");
        }
        List<Tservicedetail> tservicedetailList = tservicedetailMapper.selectByExample(example);
        return tservicedetailList;
    }

    @Override
    public List<TservicedetailCustom> selectByCondition(TservicedetailCustom tservicedetailCustom) {
        List<TservicedetailCustom> tservicedetailCustomList = tservicedetailCustomMapper.selectByCondition(tservicedetailCustom);
        return tservicedetailCustomList;
    }

    @Override
    public PageInfo<TservicedetailCustom> selectByCondition(TservicedetailCustom tservicedetailCustom, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize, SortEnum.ID.getValue());
        List<TservicedetailCustom> tservicedetailCustomList = this.selectByCondition(tservicedetailCustom);
        PageInfo<TservicedetailCustom> pageInfo = new PageInfo<>(tservicedetailCustomList);
        return pageInfo;
    }
}
