package com.mark.Interceptor;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyInterceptor implements HandlerInterceptor {
    /**
     * 在Handler方法执行前会被调用
     * @param request  当前请求对象
     * @param response 响应对象
     * @param handler  请求被处理的方法 handlerMethod ,相当于是真正能够处理请求的handler方法封装成的对象，对象中有这方法的相关信息
     * @return          返回值代表是否放行，如果为true则放行，如果为fasle则拦截，目标方法执行不到
     * @throws Exception
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle");
        //从session中获取用户名，判断是否存在
        HttpSession session = request.getSession();
        Object username = session.getAttribute("username");
        if (StringUtils.isEmpty(username))
        {
            //如果不存在则页面重定向到登录界面(使用sendRedirect可以自动将状态码设为302)
            String contextPath = request.getServletContext().getContextPath();
            response.sendRedirect(contextPath+"/static/login.html");
        }
        else
        {
            //如果存在则放行
            return true;
        }
        return false;
    }
}
