package com.haier.job;

import com.haier.config.SpringContextHolder;
import com.haier.enums.JobDataMapKey;
import com.haier.po.User;
import com.haier.service.TcustomService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.TriggerKey;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @Description: 执行定制测试, 具体执行哪个定制, 由JobDataMap传CustomId决定
 * @Author: luqiwei
 * @Date: 2018/12/12 13:22
 */

@Slf4j
public class RunCustomJob extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext context) {

        JobDataMap jobDataMap = context.getMergedJobDataMap();

        Integer customId = Integer.valueOf(jobDataMap.getString(JobDataMapKey.CUSTOM_ID.getKey()));//定制ID
        Integer executeUserId = Integer.valueOf(jobDataMap.getString(JobDataMapKey.EXECUTE_USER_ID.getKey()));//执行用户ID
        String executeUserName = jobDataMap.getString(JobDataMapKey.EXECUTE_USER_NAME.getKey());//执行用户RealName
        TriggerKey triggerKey = context.getTrigger().getKey();
        if (!ObjectUtils.allNotNull(customId, executeUserId, executeUserName)) {
            log.error("triggerName=" + triggerKey + ",triggerGroup=" + triggerKey.getGroup());
            log.error("JobDataMap入参有误,需要customId,executeUserId,executeUserName缺一不可");
            return;
        }
        User executeUser = new User();
        executeUser.setId(executeUserId);
        executeUser.setRealname(executeUserName);

        TcustomService tcustomService = SpringContextHolder.getBean(TcustomService.class);
        tcustomService.run(customId, executeUser, true);
        log.info("triggerName=" + triggerKey.getName() + ",triggerGroup="
                + triggerKey.getGroup() + ",成功触发了定制Id=" + customId + "的执行");
    }
}
