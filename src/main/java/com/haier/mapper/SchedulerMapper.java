package com.haier.mapper;

import com.haier.po.HryJob;
import com.haier.po.HryScheduler;

import java.util.List;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/12/24 14:06
 */
public interface SchedulerMapper {
    List<HryScheduler> selectAll(HryScheduler hryScheduler);

    List<HryScheduler> selectHryJob(HryJob hryJob);
}
