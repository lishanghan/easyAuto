package com.haier.mapper;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/6/9 14:08
 */
public interface StatisticMapper {
    /*    *//**
     * 根据serviceId统计ti数量
     * @param serviceId
     * @return
     *//*
    Integer statisticTiByServiceId(Integer serviceId);*/

    /*    *//**
     * 根据serviceId统计tcase数量
     * @param serviceId
     * @return
     *//*
    Integer statisticTcaseByServiceId(Integer serviceId);*/

    /*    */

    /**
     * 根据serviceId统计tcase数量-去重iId,即接口用例覆盖数
     *
     * @param serviceId
     * @return
     *//*
    Integer statisticTcaseDistinctIidByServiceId(Integer serviceId);*/

    List<Map<String, Integer>> statisticCountTi();

    List<Map<String, Integer>> statisticCountTcase();

    List<Map<String, Integer>> statisticCountTcaseDistinctIid();

    List<Map<String, Integer>> statisticCountCustomdetailDistinctClientID();

}
