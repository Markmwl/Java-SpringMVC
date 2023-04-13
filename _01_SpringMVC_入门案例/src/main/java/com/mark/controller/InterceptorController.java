package com.mark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Interceptor")
public class InterceptorController {

    @RequestMapping("/testpreHandle")
    public String testpreHandle()
    {
        System.out.println("testpreHandle!");
        return "/JSPDemo1.jsp";
    }
}
