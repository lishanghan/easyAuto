package com.haier.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Description: 访问项目外部的静态页面, reportPath中将存放测试报告
 * @Author: luqiwei
 * @Date: 2018/7/3 17:20
 */
@Configuration
public class HryWebMvcConfiguration extends WebMvcConfigurerAdapter {
    @Autowired
    ZdyProperty zdyProperty;
    /*    @Value("${zdy.reportPath}")
    String reportPath;

    @Value("${zdy.resourcePathPattern}")
    String resourcePathPattern;*/

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /**
         * /test-output/**
         */
        registry.addResourceHandler(zdyProperty.getResourcePathPattern() + "**").addResourceLocations("file:" + zdyProperty.getReportPath());
        super.addResourceHandlers(registry);
    }

}
