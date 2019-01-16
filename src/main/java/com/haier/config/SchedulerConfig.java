package com.haier.config;

import com.haier.job.RunCustomJob;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;


/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/12/12 11:08
 */
@Configuration
public class SchedulerConfig {
    @Bean
    public JobDetailFactoryBean jobDetailFactoryBean() {
        JobDetailFactoryBean jobDetailFactoryBean = new JobDetailFactoryBean();
        jobDetailFactoryBean.setName("defaultJobName");
        jobDetailFactoryBean.setGroup("defaultJobGroup");
        jobDetailFactoryBean.setJobClass(RunCustomJob.class);
        jobDetailFactoryBean.setDescription("Job-运行定制");
        jobDetailFactoryBean.setDurability(true);
        return jobDetailFactoryBean;
    }
}
