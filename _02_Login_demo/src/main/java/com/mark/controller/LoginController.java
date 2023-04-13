package com.mark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

//    @PostMapping("/login")
//    public String UserLogin(String username,String password, HttpSession session)
//    {
//        System.out.println("UserLogin!");
//        System.out.println(username + password);
//        session.setAttribute("username",username);
//        return "/WEB-INF/page/sucess.jsp";
//    }

    @GetMapping("/userlogin")
    public String UserLogin()
    {
        return "/static/login.html";
    }

    @PostMapping("/login")
    public String Login(String username,String password, HttpSession session)
    {
        System.out.println("UserLogin!");
        System.out.println(username + password);
        session.setAttribute("username",username);
        return "redirect:/index";
    }
}
