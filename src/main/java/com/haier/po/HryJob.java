package com.haier.po;

import lombok.Data;
import org.quartz.JobDataMap;

import javax.validation.constraints.NotBlank;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/12/21 8:55
 */
@Data
public class HryJob {

    @NotBlank(message = "任务名称必须")
    private String jobName;

    @NotBlank(message = "任务组名必须")
    private String jobGroup;

    private String desc;

    private String cronExp;

    private JobDataMap jobDataMap;
}
