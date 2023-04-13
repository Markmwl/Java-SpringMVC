package com.mark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pagejump")
public class PageJumpController {

    @RequestMapping("/testJump")
    public String testJump()
    {
        System.out.println("testJump");
        return "/JSPDemo1.jsp";
    }

    @RequestMapping("/testForward")
    public String testForward()
    {
        System.out.println("testForward");
        return "forward:/JSPDemo1.jsp";
    }

    @RequestMapping("/testRedirect")
    public String testRedirect()
    {
        System.out.println("testRedirect");
        return "redirect:/JSPDemo1.jsp";
}

    @RequestMapping("/testPage")
    public String testPage()
    {
        System.out.println("testPage");
        return "/WEB-INF/page/test.jsp";
        //return "test"; //使用test进行跳转需要开启spring-mvc下的 配置视图解析器
    }
}
