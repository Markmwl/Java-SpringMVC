package com.mark.controller;

import com.mark.Models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Controller
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping("/hello")
    public String hello(String name,String age)
    {
        System.out.println("hello!");
        System.out.println(name+age);
        return "/JSPDemo1.jsp";
    }

    @RequestMapping("/testPath")
    public String testPath()
    {
        System.out.println("testPath!");
        return "/JSPDemo1.jsp";
    }

    @PostMapping(value = "/testMethod")
    public String testMethod()
    {
        System.out.println("testMethod!");
        return "/JSPDemo1.jsp";
    }

    @GetMapping(value = "/testParams",params = {"code!=mwl","!name"})
    public String testParams()
    {
        System.out.println("testParams!");
        return "/JSPDemo1.jsp";
    }

    @GetMapping(value = "/testHeaders",headers = "deviceType=ios")
    public String testHeaders()
    {
        System.out.println("testHeaders!");
        return "/JSPDemo1.jsp";
    }

    @PostMapping(value = "/testConsumes",consumes = "multipart/from-data")
    public String testConsumes()
    {
        System.out.println("testConsumes!");
        return "/JSPDemo1.jsp";
    }

    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam("id") Integer id,@RequestParam("name")String name,@RequestParam("likes")String[] likes)
    {
        System.out.println("testRequestParam!");
        System.out.println(id+name+":"+Arrays.toString(likes));
        return "/JSPDemo1.jsp";
    }

    @RequestMapping("/testRequestParamUser")
    public String testRequestParamUser(User user)
    {
        System.out.println("testRequestParamUser!");
        System.out.println(user);
        return "/JSPDemo1.jsp";
    }

    @RequestMapping("/testRequestrequired")
    public String testRequestrequired(@RequestParam(value = "id",required = false) Integer id,@RequestParam("name")String name,@RequestParam("likes")String[] likes)
    {
        System.out.println("testRequestrequired!");
        System.out.println(id+name+":"+Arrays.toString(likes));
        return "/JSPDemo1.jsp";
    }

    @RequestMapping("/testRequestdefaultValue")
    public String testRequestdefaultValue(@RequestParam(value = "id",required = false,defaultValue = "777") Integer id,@RequestParam("name")String name,@RequestParam("likes")String[] likes)
    {
        System.out.println("testRequestdefaultValue!");
        System.out.println(id+name+":"+Arrays.toString(likes));
        return "/JSPDemo1.jsp";
    }
}
