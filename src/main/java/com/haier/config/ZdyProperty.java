package com.haier.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/10/30 15:11
 */
@Configuration
public class ZdyProperty {
    @Value("${zdy.debug}")
    private Boolean debug;

    @Value("${zdy.autoCodeDir}")
    private String autoCodeDir;

    @Value("${zdy.reportPath}")
    private String reportPath;

    @Value("${zdy.resourcePathPattern}")
    private String resourcePathPattern;

    public Boolean getDebug() {
        return debug;
    }

    public void setDebug(Boolean debug) {
        this.debug = debug;
    }

    public String getAutoCodeDir() {
        return autoCodeDir;
    }

    public void setAutoCodeDir(String autoCodeDir) {
        this.autoCodeDir = autoCodeDir;
    }

    public String getReportPath() {
        return reportPath;
    }

    public void setReportPath(String reportPath) {
        this.reportPath = reportPath;
    }

    public String getResourcePathPattern() {
        return resourcePathPattern;
    }

    public void setResourcePathPattern(String resourcePathPattern) {
        this.resourcePathPattern = resourcePathPattern;
    }
}
