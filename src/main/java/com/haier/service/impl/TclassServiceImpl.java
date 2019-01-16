package com.haier.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haier.enums.SortEnum;
import com.haier.mapper.TclassMapper;
import com.haier.po.Tclass;
import com.haier.po.TclassExample;
import com.haier.service.TclassService;
import com.haier.util.ReflectUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/8/3 11:24
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class TclassServiceImpl implements TclassService {
    @Autowired
    TclassMapper mapper;

    @Override
    public Integer insertOne(Tclass tclass) {

        mapper.insertSelective(tclass);

        return tclass.getId();
    }

    @Override
    public Integer updateOne(Tclass tclass) {
        return mapper.updateByPrimaryKeySelective(tclass);
    }

    @Override
    public Integer deleteOne(Integer id) {
        Tclass tclass = new Tclass();
        tclass.setId(id);
        tclass.setStatus(-1);
        return this.updateOne(tclass);
    }

    @Override
    public Integer deleteByCondition(Tclass tclass) {
        TclassExample example = new TclassExample();
        TclassExample.Criteria criteria = example.createCriteria();
        criteria.andStatusGreaterThan(0);
        if (tclass != null && tclass.getSid() != null) {

            criteria.andSidEqualTo(tclass.getSid());
        } else {
            return 0;
        }
        Tclass record = new Tclass();
        record.setStatus(-1);

        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public Tclass selectOne(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Tclass> selectByCondition(Tclass tclass) {
        ReflectUtil.setFieldAddPercentAndCleanZero(tclass, false);
        TclassExample example = new TclassExample();
        TclassExample.Criteria criteria = example.createCriteria();
        criteria.andStatusGreaterThan(0);
        if (tclass != null) {
            if (tclass.getClassname() != null) {
                criteria.andClassnameEqualTo(tclass.getClassname().replaceAll("%", ""));
            }
            if (tclass.getAuthor() != null) {
                criteria.andAuthorLike(tclass.getAuthor());
            }
            if (tclass.getRemark() != null) {
                criteria.andRemarkLike(tclass.getRemark());
            }
            if (tclass.getSid() != null) {
                criteria.andSidEqualTo(tclass.getSid());
            }
            if (tclass.getSkey() != null) {
                criteria.andSkeyLike(tclass.getSkey());
            }
        }
        return mapper.selectByExample(example);
    }

    @Override
    public PageInfo<Tclass> selectByCondition(Tclass tclass, Integer pageNum, Integer pageSize) {
        if (pageNum == null || pageSize == null) {
            pageNum = 1;
            pageSize = 10;
        }
        PageHelper.startPage(pageNum, pageSize, SortEnum.UPDATETIME.getValue());
        List<Tclass> tclasses = this.selectByCondition(tclass);
        PageInfo<Tclass> pageInfo = new PageInfo<>(tclasses);
        return pageInfo;
    }
}
