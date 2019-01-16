package com.haier.config;

import com.haier.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description: 登录拦截器配置
 * @Author: luqiwei
 * @Date: 2018/5/22 13:30
 */
@Configuration
public class LoginConfig implements WebMvcConfigurer {
    @Autowired
    LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(loginInterceptor);
        //拦截配置
        interceptorRegistration.addPathPatterns("/**");
        //排除配置
        interceptorRegistration.excludePathPatterns("/login.html");
        interceptorRegistration.excludePathPatterns("/user/login");
        interceptorRegistration.excludePathPatterns("/static/**");
        interceptorRegistration.excludePathPatterns("/lib/**");
        interceptorRegistration.excludePathPatterns("/temp/**");
        interceptorRegistration.excludePathPatterns("/404.html");
        interceptorRegistration.excludePathPatterns("/welcome.html");
        interceptorRegistration.excludePathPatterns("/test-output/**");//测试报告可以不用登录就能访问
        interceptorRegistration.excludePathPatterns("/report-loading.html");
        interceptorRegistration.excludePathPatterns("/report/getStatus");
        interceptorRegistration.excludePathPatterns("/help.html");
    }
}
