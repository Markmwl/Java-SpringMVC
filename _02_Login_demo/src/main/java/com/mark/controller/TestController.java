package com.mark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String test()
    {
        System.out.println("test!");
        return "/WEB-INF/page/test.jsp";
    }
}
