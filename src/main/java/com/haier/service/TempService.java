package com.haier.service;

import com.haier.po.Temp;

import java.util.List;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/9/27 16:56
 */
public interface TempService {
    Integer insertOne(Temp temp);

    Temp selectOne(Integer id);

    Temp selectOne(String testingId, String tempKey);

    String getTempValue(String testingId, String tempKey);

    List<Temp> selectList(String testingId);
}
