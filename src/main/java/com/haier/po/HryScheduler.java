package com.haier.po;

import lombok.Data;

import java.math.BigInteger;

/**
 * @Description: 任务实体描述
 * @Author: luqiwei
 * @Date: 2018/12/24 13:45
 */
@Data
public class HryScheduler {
    String sched_name;
    String trigger_name;
    String trigger_group;
    String description;
    BigInteger next_fire_time;
    BigInteger prev_fire_time;
    String trigger_state;
    String cron_expression;
    String time_zone_id;
    String job_name;
    String job_group;
    String is_durable;
    String is_nonconcurrent;
    String is_update_data;
    String job_class_name;
}
