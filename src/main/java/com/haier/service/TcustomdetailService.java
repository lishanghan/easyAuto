package com.haier.service;

import com.haier.po.Tcustomdetail;

import java.util.List;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/7/11 15:03
 */
public interface TcustomdetailService {

    Integer insertOne(Tcustomdetail tcustomdetail);

    Integer insertBatch(List<Tcustomdetail> tcustomdetails);

    Integer updateOne(Tcustomdetail tcustomDetail);

    Integer deleteOne(Integer id);

    Integer physicalDeleteOne(Integer id);

    Integer deleteByCondition(Tcustomdetail tcustomdetail);

    Integer physicalDeleteByCondition(Tcustomdetail tcustomdetail);

    List<Tcustomdetail> selectByCondition(Tcustomdetail tcustomdetail);

    List<Tcustomdetail> selectByCondition(Integer customId);

    List<Tcustomdetail> selectByCondition(Integer customId, Integer clientLevel);

    List<Tcustomdetail> selectByCustomIds(List<Integer> ids);
}
