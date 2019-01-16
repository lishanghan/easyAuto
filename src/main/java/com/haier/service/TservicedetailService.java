package com.haier.service;

import com.github.pagehelper.PageInfo;
import com.haier.po.Tservicedetail;
import com.haier.po.TservicedetailCustom;

import java.util.List;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/5/30 19:47
 */
public interface TservicedetailService {
    Integer insertOne(Tservicedetail tservicedetail);

    Integer deleteOne(Integer id);

    Integer deleteByCondition(Tservicedetail tservicedetail);

    Tservicedetail selectOne(Integer id);

    Tservicedetail selectOne(Integer serviceId,Integer envId);

    Integer updateOne(Tservicedetail tservicedetail);

    List<Tservicedetail> selectByCondition(Tservicedetail tservicedetail);

    List<TservicedetailCustom> selectByCondition(TservicedetailCustom tservicedetailCustom);

    PageInfo<TservicedetailCustom> selectByCondition(TservicedetailCustom tservicedetailCustom, Integer pageNum, Integer pageSize);
}
