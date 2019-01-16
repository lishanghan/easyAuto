package com.haier.service;

import com.haier.po.AutoRateStatistic;
import com.haier.po.RealtimeStatistic;

import java.util.List;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/6/9 13:21
 */
public interface StatisticService {
    /*List<RealtimeStatistic> statisticCurrentOld();*/

    List<RealtimeStatistic> statisticCurrent();

    List<AutoRateStatistic> statisticCustomRate();
}
