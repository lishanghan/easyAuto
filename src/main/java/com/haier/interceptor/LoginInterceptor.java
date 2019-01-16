package com.haier.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

/**
 * @Description: 登录拦截器
 * @Author: luqiwei
 * @Date: 2018/5/22 11:21
 */
@Slf4j
@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //为接口的调试开一个特例,如果请求中带参数debug,则放行
        if (request.getParameter("debug") != null) {
            return true;
        }
        HttpSession session = request.getSession();
        //校验session和cookie信息
        if (session.getAttribute("userSession") != null) {//服务端session信息存在
            //log.debug("userSession:" + session.getAttribute("userSession").toString());
            Cookie[] cookies = request.getCookies();

            //校验其中一个cookie
            for (Cookie cookie : cookies) {
                if ("identityCookie".equals(cookie.getName())) {//客户端有Cookie信息
                    return true;
                }
            }
        }

        //跳转登录页面
        //response.sendRedirect("/login.html");
        //return false;


        //专门针对登录嵌套在iframe里面的情况
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<script>");
        out.println("window.open('" + request.getContextPath() + "/login.html','_top')");
        out.println("</script>");
        out.println("</html>");
        return false;


    }

}
