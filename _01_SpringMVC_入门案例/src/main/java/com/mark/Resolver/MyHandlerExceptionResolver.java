package com.mark.Resolver;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@Component
public class MyHandlerExceptionResolver implements HandlerExceptionResolver {

    //如果Handler中出现了异常，就会调用到该方法。我们可以在本方法中进行统一的异常处理
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception ex) {
        //获取异常信息，把异常信息放入域对象中
        String msg = ex.getMessage();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg",msg);
        //跳转到error.jsp页面
        modelAndView.setViewName("/WEB-INF/page/error.jsp");
        return modelAndView;
    }
}
