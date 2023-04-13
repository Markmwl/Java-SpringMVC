package com.mark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Attribute;

@Controller
@RequestMapping("/Jsp")
@SessionAttributes({"sessionname","sessionage"})
public class JspController {

    @RequestMapping("/testRequestModel")
    public String testRequestModel(Model model, HttpServletRequest request)
    {
        System.out.println("testRequestModel");
        //往请求缓存数据
        model.addAttribute("name","马文磊");
        model.addAttribute("age",25);
        return "/WEB-INF/page/testScope.jsp";
    }

    @RequestMapping("/testRequestModelAndView")
    public ModelAndView testRequestModelAndView(ModelAndView modelview, HttpServletRequest request)
    {
        System.out.println("testRequestModelAndView");
        //往域中添加数据
        modelview.addObject("name","马文磊");
        modelview.addObject("age",25);
        //页面跳转
        modelview.setViewName("/WEB-INF/page/testScope.jsp");
        return modelview;
    }

    @RequestMapping("/testRequestAttribute")
    public String testRequestAttribute(@RequestAttribute("org.springframework.web.servlet.HandlerMapping.bestMatchingPattern") String Attribute, HttpServletRequest request)
    {
        System.out.println("testRequestAttribute");
        System.out.println(Attribute);
        return "/WEB-INF/page/testScope.jsp";
    }

    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model,HttpServletRequest request)
    {
        System.out.println("testSessionAttributes");
        //往请求缓存数据
        model.addAttribute("name","马文磊");
        model.addAttribute("age",25);
        model.addAttribute("sessionname","Mark");
        model.addAttribute("sessionage",26);
        return "/WEB-INF/page/testScope.jsp";
    }

    @RequestMapping("/testSessionAttribute")
    public String testSessionAttribute(@SessionAttribute(value = "sessionname",required = false) String name,@SessionAttribute(value = "sessionage",required = false) String age, HttpSession httpSession)
    {
        System.out.println("testSessionAttribute");
        System.out.println(name + age);
        return "/WEB-INF/page/testScope.jsp";
    }

}
