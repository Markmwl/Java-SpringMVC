package com.mark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExceptionController {

    @RequestMapping("/testException")
    public String testException()
    {
        System.out.println(1/0);
        return "/WEB-INF/page/test.jsp";
    }
}
