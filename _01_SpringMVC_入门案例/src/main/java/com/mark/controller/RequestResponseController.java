package com.mark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/ReqAndRsp")
public class RequestResponseController {

    @RequestMapping("/getReqAndRsp")
    public String getReqAndRsp(HttpServletRequest request, HttpServletResponse response, HttpSession session)
    {
        System.out.println("getReqAndRsp");
        System.out.println();
        return "/JSPDemo1.jsp";
    }

    @RequestMapping("/getHeader")
    public String getHeader(@RequestHeader(value = "device-type",required = false,defaultValue = "android") String deviceType)
    {
        System.out.println("getHeader");
        System.out.println(deviceType);
        return "/JSPDemo1.jsp";
    }

    @RequestMapping("/getCookie")
    public String getCookie(@CookieValue(value = "MARKID") String sessionid)
    {
        System.out.println("getCookie");
        System.out.println(sessionid);
        return "/JSPDemo1.jsp";
    }
}
