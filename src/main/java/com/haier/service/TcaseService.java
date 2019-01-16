package com.haier.service;

import com.github.pagehelper.PageInfo;
import com.haier.po.Tcase;
import com.haier.po.TcaseCustom;

import java.util.List;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/5/23 10:33
 */
public interface TcaseService {

    //增
    Integer insertOne(Tcase tcase);

    //删
    Integer deleteOne(Integer tcaseId);

    //删-根据iId和envId删除case记录
    Integer deleteByCondition(Tcase tcase);

    //改
    Integer updateOne(Tcase tcase);

    //查-根据主键查询
    Tcase selectOne(Integer tcaseId);

    //查-根据条件查询Tcase
    List<Tcase> selectByCondition(Tcase tcase);

    //查-综合查询
    PageInfo<TcaseCustom> selectByContion(TcaseCustom tcaseCustom, Integer pageNum, Integer pageSize);

    //统计case,根据iid和serviceid
    Integer statisticCase(Tcase tcase);

    /**
     * 查询用例设计人员列表
     */
    List<String> selectCaseDesigners();

    /**
     * 运行单条Case
     */
    //RunOneResult runOne(Tcase tcase) throws HttpProcessException;

    //RunOneResult runOne(Integer id) throws HttpProcessException;

    String runOne(Tcase tcase, Integer userId);

    String runOne(Integer caseId, Integer userId);
}
