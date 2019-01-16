package com.haier.service;

import com.github.pagehelper.PageInfo;
import com.haier.po.HryJob;
import com.haier.po.HryScheduler;
import org.quartz.JobDataMap;
import org.quartz.SchedulerException;

import java.util.List;

/**
 * @Description: 封装对任务的控制
 * @Author: luqiwei
 * @Date: 2018/12/18 13:26
 */
public interface SchedulerService {
    void addJob(String triggerName, String triggerGroup, String desc, JobDataMap jobDataMap, String cronExp) throws SchedulerException;

    void pauseJob(String triggerName, String triggerGroup) throws SchedulerException;

    void resumeJob(String triggerName, String triggerGroup) throws SchedulerException;

    void deleteJob(String triggerName, String triggerGroup) throws SchedulerException;

    void updateJob(String triggerName, String triggerGroup, String desc, String cronExp) throws SchedulerException;

    Boolean checkExists(String triggerName, String triggerGroup) throws SchedulerException;

    List<HryScheduler> selectByCondition(HryScheduler hryScheduler);

    PageInfo<HryScheduler> pageInfo(HryScheduler hryScheduler, Integer pageNum, Integer pageSize);

    HryScheduler selectJob(HryJob hryJob);
}
