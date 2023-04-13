package com.mark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String UserIndex()
    {
        System.out.println("index!");
        return "/WEB-INF/page/sucess.jsp";
    }
}
