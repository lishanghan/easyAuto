package com.haier.service.impl;

import com.haier.mapper.StatisticMapper;
import com.haier.po.AutoRateStatistic;
import com.haier.po.RealtimeStatistic;
import com.haier.po.Tservice;
import com.haier.service.StatisticService;
import com.haier.service.TserviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/6/9 13:24
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class StatisticServiceImpl implements StatisticService {
    @Autowired
    TserviceService tserviceService;

    @Autowired
    StatisticMapper statisticMapper;

    /**
     * 实时统计服务,接口,用例情况
     *
     * @return
     */
/*    @Override
    public List<RealtimeStatistic> statisticCurrentOld() {
        List<RealtimeStatistic> list = new ArrayList<>();

        List<Tservice> tservices = tserviceService.selectByCondition(null);

        for (Tservice tservice : tservices) {
            RealtimeStatistic realtimeStatistic = new RealtimeStatistic();
            realtimeStatistic.setServiceKey(tservice.getServicekey());
            realtimeStatistic.setServiceDesc(tservice.getServicename());
            //统计接口总数
            Integer iTotal = statisticMapper.statisticTiByServiceId(tservice.getId());

            //统计用例总数
            Integer cTotal = statisticMapper.statisticTcaseByServiceId(tservice.getId());

            //统计接口用例覆盖数
            Integer iTotalByCase = statisticMapper.statisticTcaseDistinctIidByServiceId(tservice.getId());

            Integer iTotalNoCase = iTotal - iTotalByCase;

            String iRate = String.format("%.2f", (float) iTotalByCase / iTotal * 100) + "%";

            String cFineness;
            if (cTotal == 0 || iTotalByCase == 0) {
                cFineness = "0.00";
            } else {
                cFineness = String.format("%.2f", (float) cTotal / iTotalByCase);
            }

            realtimeStatistic.setITotal(iTotal);
            realtimeStatistic.setCTotal(cTotal);
            realtimeStatistic.setITotalByCase(iTotalByCase);
            realtimeStatistic.setITotalNoCase(iTotalNoCase);
            realtimeStatistic.setIRate(iRate);
            realtimeStatistic.setCFineness(cFineness);
            list.add(realtimeStatistic);
        }
        return list;
    }*/

    @Override
    public List<RealtimeStatistic> statisticCurrent() {
        List<RealtimeStatistic> ret = new ArrayList<>();
        List<Tservice> tservices = tserviceService.selectByCondition(null);
        List<Map<String, Integer>> countTi = statisticMapper.statisticCountTi();
        List<Map<String, Integer>> countTcase = statisticMapper.statisticCountTcase();
        List<Map<String, Integer>> countTcaseDistinctIid = statisticMapper.statisticCountTcaseDistinctIid();

        for (Tservice service : tservices) {
            RealtimeStatistic rs = new RealtimeStatistic();
            rs.setServiceKey(service.getServicekey());
            rs.setServiceDesc(service.getServicename());

            Integer iTotal = 0;
            for (Map m : countTi) {
                if (m.get("serviceid").equals(service.getId())) {
                    iTotal = (Integer) m.get("count");
                }
            }

            Integer cTotal = 0;
            for (Map m : countTcase) {
                if (m.get("serviceid").equals(service.getId())) {
                    cTotal = (Integer) m.get("count");
                }
            }

            Integer iTotalByCase = 0;
            for (Map m : countTcaseDistinctIid) {
                if (m.get("serviceid").equals(service.getId())) {
                    iTotalByCase = (Integer) m.get("count");
                }
            }

            Integer iTotalNoCase = iTotal - iTotalByCase;

            String iRate = "0.00%";
            if (iTotalByCase.intValue() != 0 && iTotal.intValue() != 0) {
                iRate = String.format("%.2f", (float) iTotalByCase / iTotal * 100) + "%";
            }

            String cFineness = "0.00";
            if (cTotal.intValue() != 0 && iTotalByCase.intValue() != 0) {
                cFineness = String.format("%.2f", (float) cTotal / iTotalByCase);
            }

            rs.setITotal(iTotal);
            rs.setITotalByCase(iTotalByCase);
            rs.setITotalNoCase(iTotalNoCase);
            rs.setIRate(iRate);
            rs.setCTotal(cTotal);
            rs.setCFineness(cFineness);

            ret.add(rs);
        }
        return ret;
    }

    @Override
    public List<AutoRateStatistic> statisticCustomRate() {
        List<AutoRateStatistic> ret = new ArrayList<>();
        List<Tservice> tservices = tserviceService.selectByCondition(null);
        List<Map<String, Integer>> countTi = statisticMapper.statisticCountTi();
        List<Map<String, Integer>> countCustomDetail = statisticMapper.statisticCountCustomdetailDistinctClientID();
        Map<Integer, Integer> s_countTi = countTi.stream().collect(Collectors.toMap(map -> map.get("serviceid"), map -> map.get("count")));
        Map<Integer, Integer> s_countCustomDetail = countCustomDetail.stream().collect(Collectors.toMap(a -> a.get("serviceid"), a -> a.get("count")));

        for (Tservice s : tservices) {
            Integer cTi = s_countTi.get(s.getId());
            if (cTi.equals(0)) {
                continue;
            }
            AutoRateStatistic auto = new AutoRateStatistic();
            auto.setServiceKey(s.getServicekey());
            auto.setServiceName(s.getServicename());
            auto.setITotal(cTi);
            auto.setCustomTotal(s_countCustomDetail.get(s.getId()) == null ? 0 : s_countCustomDetail.get(s.getId()));
            auto.setRate(String.format("%.4f", auto.getCustomTotal().doubleValue() / auto.getITotal()));
            ret.add(auto);
        }
        return ret;
    }
}
