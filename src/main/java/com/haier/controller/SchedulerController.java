package com.haier.controller;

import com.haier.dto.HrySchedulerQueryDto;
import com.haier.enums.JobDataMapKey;
import com.haier.enums.StatusCodeEnum;
import com.haier.exception.HryException;
import com.haier.po.HryJob;
import com.haier.po.HryScheduler;
import com.haier.response.Result;
import com.haier.service.SchedulerService;
import com.haier.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.quartz.CronExpression;
import org.quartz.JobDataMap;
import org.quartz.SchedulerException;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/12/17 16:26
 */
@RestController
@RequestMapping("/scheduler")
@Slf4j
public class SchedulerController {

    @Resource
    SchedulerService schedulerService;

    /**
     * @param hryJob jobName:约定传入定制ID
     *               jobGroup:约定传入操作人姓名
     *               desc:约定传入"(定制ID_定制人_运行环境)定制名称"
     *               JobDataMap-customId:定制ID
     *               JobDataMap-executeUserID:操作人ID
     *               JobDataMap-executeUserName:操作人Name
     *               cronExp:运行策略
     * @return
     * @throws SchedulerException
     */
    @PostMapping("/addJob")
    public Result addJob(@RequestBody @Validated HryJob hryJob) throws SchedulerException {
        String jobName = hryJob.getJobName();
        String jobGroup = hryJob.getJobGroup();
        String desc = hryJob.getDesc();
        JobDataMap jobDataMap = hryJob.getJobDataMap();
        Integer customId = jobDataMap.getInt(JobDataMapKey.CUSTOM_ID.getKey());//定制ID
        Integer executeUserId = jobDataMap.getInt(JobDataMapKey.EXECUTE_USER_ID.getKey());//执行用户ID
        String executeUserName = jobDataMap.getString(JobDataMapKey.EXECUTE_USER_NAME.getKey());//执行用户RealName

        if (!ObjectUtils.allNotNull(customId, executeUserId, executeUserName)) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "新增任务时,customId,executeUserId,executeUserName必填");
        }
        if (!CronExpression.isValidExpression(hryJob.getCronExp())) {
            throw new HryException(StatusCodeEnum.CRON_ERROR);
        }
        if (schedulerService.checkExists(jobName, jobGroup)) {
            throw new HryException(StatusCodeEnum.EXIST_RECORD, "不可添加重复的任务");
        }
        if (StringUtils.isBlank(desc)) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "任务描述必须,建议传入定制名称+环境组合");
        }

        schedulerService.addJob(jobName, jobGroup, desc, jobDataMap, hryJob.getCronExp());
        return ResultUtil.success("success");
    }

    @PostMapping("/pauseJob")
    public Result pauseJob(@RequestBody @Validated HryJob hryJob) throws SchedulerException {
        schedulerService.pauseJob(hryJob.getJobName(), hryJob.getJobGroup());
        return ResultUtil.success("success");
    }

    @PostMapping("/resumeJob")
    public Result resumeJob(@RequestBody @Validated HryJob hryJob) throws SchedulerException {
        schedulerService.resumeJob(hryJob.getJobName(), hryJob.getJobGroup());
        return ResultUtil.success("success");
    }

    @PostMapping("/updateJob")
    public Result updateJob(@RequestBody @Validated HryJob hryJob) throws SchedulerException {
        String jobName = hryJob.getJobName();
        String jobGroup = hryJob.getJobGroup();
        String desc = hryJob.getDesc();
        JobDataMap jobDataMap = hryJob.getJobDataMap();
        Integer customId = jobDataMap.getInt(JobDataMapKey.CUSTOM_ID.getKey());//定制ID
        Integer executeUserId = jobDataMap.getInt(JobDataMapKey.EXECUTE_USER_ID.getKey());//执行用户ID
        String executeUserName = jobDataMap.getString(JobDataMapKey.EXECUTE_USER_NAME.getKey());//执行用户RealName

        if (!ObjectUtils.allNotNull(customId, executeUserId, executeUserName)) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "更新任务时,customId,executeUserId,executeUserName必填");
        }
        if (!CronExpression.isValidExpression(hryJob.getCronExp())) {
            throw new HryException(StatusCodeEnum.CRON_ERROR);
        }
        if (StringUtils.isBlank(desc)) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "任务描述必须");
        }

        schedulerService.updateJob(jobName, jobGroup, desc, hryJob.getCronExp());
        return ResultUtil.success("success");
    }

    @PostMapping("/deleteJob")
    public Result deleteJob(@RequestBody @Validated HryJob hryJob) throws SchedulerException {
        schedulerService.deleteJob(hryJob.getJobName(), hryJob.getJobGroup());
        return ResultUtil.success("success");
    }

    @PostMapping("/selectList")
    public Result selectList(@RequestBody HryScheduler hryScheduler) {
        return ResultUtil.success(schedulerService.selectByCondition(hryScheduler));
    }

    @PostMapping("/selectPageInfo")
    public Result selectPageInfo(@RequestBody HrySchedulerQueryDto hrySchedulerQueryDto) {
        Integer pageNum = 1, pageSize = 10;
        if (hrySchedulerQueryDto != null) {
            if (hrySchedulerQueryDto.getPageNum() != null) {
                pageNum = hrySchedulerQueryDto.getPageNum();
            }
            if (hrySchedulerQueryDto.getPageSize() != null) {
                pageSize = hrySchedulerQueryDto.getPageSize();
            }
        }
        return ResultUtil.success(schedulerService.pageInfo(hrySchedulerQueryDto.getHryScheduler(), pageNum, pageSize));
    }

    @PostMapping("/selectOneJob")
    public Result selectOneJob(@RequestBody @Validated HryJob hryJob) {
        HryScheduler hryScheduler = schedulerService.selectJob(hryJob);
        if (hryScheduler == null) {
            throw new HryException(StatusCodeEnum.NOT_FOUND, "JobName=" + hryJob.getJobName() + ",JobGroup=" + hryJob.getJobGroup());
        }
        return ResultUtil.success(hryScheduler);
    }
}
