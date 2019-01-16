package com.haier.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haier.enums.SortEnum;
import com.haier.enums.StatusEnum;
import com.haier.mapper.TiCustomMapper;
import com.haier.mapper.TiMapper;
import com.haier.po.Tcase;
import com.haier.po.Ti;
import com.haier.po.TiCustom;
import com.haier.po.TiExample;
import com.haier.service.TcaseService;
import com.haier.service.TiService;
import com.haier.util.ReflectUtil;
import com.haier.vo.TiWithCaseVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/5/9 16:21
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Slf4j
@Service
public class TiServiceImpl implements TiService {
    @Autowired
    TiMapper tiMapper;
    @Autowired
    TiCustomMapper tiCustomMapper;
    @Autowired
    TcaseService tcaseService;

    @Override
    public Integer insertOne(Ti ti) {
        //插入接口
        tiMapper.insertSelective(ti);
        return ti.getId();
    }

    @Override
    public Integer updateOne(Ti ti) {
        return tiMapper.updateByPrimaryKeySelective(ti);
    }

    /**
     * @description: 删除tservice表记录时, 会同时删除ti表的记录, 所以一定要谨慎
     */
    @Override
    public Integer deleteOne(Integer id) {
        return this.setStatus(id, StatusEnum._ONE);
    }

    @Override
    public Integer invalidInterface(Integer id) {
        return this.setStatus(id, StatusEnum._TWO);
    }

    public Integer setStatus(Integer iId, StatusEnum statusEnum) {
        Tcase tcase = new Tcase();
        tcase.setIid(iId);
        tcaseService.deleteByCondition(tcase);
        Ti ti = new Ti();
        ti.setId(iId);
        ti.setIstatus(statusEnum.getId());
        return tiMapper.updateByPrimaryKeySelective(ti);
    }

    @Override
    public Integer deleteByCondition(Ti ti) {
        if (!ObjectUtils.allNotNull(ti, ti.getServiceid())) {
            return null;
        }
        //先删除tcase表中的记录
        Tcase tcase = new Tcase();
        tcase.setServiceid(ti.getServiceid());
        tcaseService.deleteByCondition(tcase);

        //再删除ti中的记录
        TiExample tiExample = new TiExample();
        tiExample.createCriteria()
                .andIstatusGreaterThan(0)
                .andServiceidEqualTo(ti.getServiceid());
        Ti i = new Ti();
        i.setIstatus(-1);
        return tiMapper.updateByExampleSelective(i, tiExample);
    }

    @Override
    public Ti selectOne(Integer id) {
        return tiMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<TiCustom> selectByCondition(TiCustom tiCustom, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize, SortEnum.UPDATETIME.getValue() + "," + SortEnum.ID.getValue());
        List<TiCustom> tiCustomList = tiCustomMapper.selectByCondition(tiCustom);
        PageInfo<TiCustom> pageInfo = new PageInfo<>(tiCustomList);
        return pageInfo;
    }

    @Override
    public List<Ti> selectByCondition(Ti ti) {
        return this.selectByCondition(ti, false);
    }

    @Override
    public List<Ti> selectByServiceId(Integer serviceId) {
        Ti condition = new Ti();
        condition.setServiceid(serviceId);
        return selectByCondition(condition);
    }

    @Override
    public List<Ti> selectByCondition(Ti ti, Boolean hasCase) {
        return this.selectByCondition(ti, hasCase, null);
    }

    @Override
    public List<Ti> selectAllStatusByCondition(Ti ti) {
        return this.selectByCondition(ti, null, true);
    }

    public List<Ti> selectByCondition(Ti ti, Boolean hasCase, Boolean selectAllStatus) {
        if (selectAllStatus == null) {
            selectAllStatus = false;
        }
        if (hasCase == null) {
            hasCase = false;
        }
        TiExample tiExample = new TiExample();
        TiExample.Criteria criteria = tiExample.createCriteria();
        if (!selectAllStatus) {
            criteria.andIstatusGreaterThan(0);
        }
        if (hasCase) {
            criteria.andCasecountGreaterThan(0);
        }
        if (ti != null) {
            if (ti.getId() != null) {
                criteria.andIdEqualTo(ti.getId());
            }
            if (ti.getServiceid() != null) {
                criteria.andServiceidEqualTo(ti.getServiceid());
            }
            if (StringUtils.isNotBlank(ti.getIuri())) {
                criteria.andIuriLike("%" + ti.getIuri() + "%");
            }
            if (StringUtils.isNotBlank(ti.getRemark())) {
                criteria.andRemarkLike("%" + ti.getRemark() + "%");
            }
            if (StringUtils.isNotBlank(ti.getIdev())) {
                criteria.andIdevEqualTo(ti.getIdev());
            }
        }
        return tiMapper.selectByExample(tiExample);
    }

    @Override
    public List<TiWithCaseVO> selectTiWithCaseVO(Ti ti) {
        List<TiWithCaseVO> list = new ArrayList<>();
        List<Ti> tis = this.selectByCondition(ti, true);
        Tcase condition = new Tcase();
        condition.setServiceid(ti.getServiceid());
        List<Tcase> tcases = tcaseService.selectByCondition(condition);

        //将tcases转成Map<iid,List<Tcase>>
        Map<Integer, List<Tcase>> map = new HashMap<>();
        for (Tcase tcase : tcases) {
            if (map.containsKey(tcase.getIid())) {
                map.get(tcase.getIid()).add(tcase);
            } else {
                ArrayList<Tcase> tcasesArray = new ArrayList<>();
                tcasesArray.add(tcase);
                map.put(tcase.getIid(), tcasesArray);
            }
        }

        for (Ti i : tis) {
            TiWithCaseVO vo = new TiWithCaseVO();
            ReflectUtil.cloneParentToChild(i, vo);//设置ti
            vo.setTcases(map.get(i.getId()));//设置List<Tcase>
            list.add(vo);
        }
        return list;
    }
}
