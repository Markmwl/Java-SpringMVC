package com.mark.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        return true;
    }

    /**
     * 在Handler方法执行后会被调用
     * @param request  当前请求对象
     * @param response 响应对象
     * @param handler  请求被处理的方法 handlerMethod ,相当于是真正能够处理请求的handler方法封装成的对象，对象中有这方法的相关信息
     * @param modelAndView  handler方法执行后的modelAndView对象，我们可以修改其中要跳转的路径或者是域中的参数
     * @throws Exception
     */
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");
    }

    /**
     * afterCompletion**方法会在最后执行
     * @param request   当前请求对象
     * @param response  响应对象
     * @param handler   请求被处理的方法 handlerMethod ,相当于是真正能够处理请求的handler方法封装成的对象，对象中有这方法的相关信息
     * @param ex         异常对象
     * @throws Exception
     */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion");
    }
}
