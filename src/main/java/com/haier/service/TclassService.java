package com.haier.service;

import com.github.pagehelper.PageInfo;
import com.haier.po.Tclass;

import java.util.List;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/8/3 11:18
 */
public interface TclassService {
    Integer insertOne(Tclass tclass);

    Integer updateOne(Tclass tclass);

    Integer deleteOne(Integer id);

    Integer deleteByCondition(Tclass tclass);

    Tclass selectOne(Integer id);

    List<Tclass> selectByCondition(Tclass tclass);

    PageInfo<Tclass> selectByCondition(Tclass tclass, Integer pageNum, Integer pageSize);
}
