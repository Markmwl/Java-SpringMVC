package com.mark.Resolver;

import com.mark.Models.Result;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
@Component
public class MyControllerAdvice {

    //如果Handler中出现了异常，就会调用到该方法。我们可以在本方法中进行统一的异常处理
    //@ExceptionHandler({NullPointerException.class,ArrayIndexOutOfBoundsException.class,ArithmeticException.class})
//    @ExceptionHandler({Exception.class})
//    public ModelAndView handlerException(Exception ex) {
//        //获取异常信息，把异常信息放入域对象中
//        String msg = ex.getMessage();
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("msg",msg);
//        //跳转到error.jsp页面
//        modelAndView.setViewName("/WEB-INF/page/error.jsp");
//        return modelAndView;
//    }

    @ExceptionHandler({Exception.class})
    @ResponseBody
    public Result resultException(Exception ex) {
        Result result = new Result();
        result.setCode(500);
        result.setMessage(ex.getMessage());
        return result;
    }
}
