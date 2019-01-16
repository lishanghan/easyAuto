package com.haier.service;

import com.github.pagehelper.PageInfo;
import com.haier.po.Tservice;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/5/9 16:01
 */
public interface TserviceService {
    Tservice selectOne(Integer id);

    Tservice selectOne(String className);//根据classname字段精确筛选Tservice

    PageInfo<Tservice> selectByCondition(Tservice tservice, Integer pageNum, Integer pageSize);

    List<Tservice> selectByCondition(Tservice tservice);

    Integer updateOne(Tservice tservice);

    //返回主键
    Integer insertOne(Tservice tservice);

    Integer deleteOne(Integer id);//id为主键

    Map<String,List<String>>  getTestClasses();

    List<String> getTestClasses(String sKey);

    List<String> getTestClasses(Integer sId);
}
