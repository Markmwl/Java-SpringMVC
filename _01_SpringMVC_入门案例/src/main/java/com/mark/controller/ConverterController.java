package com.mark.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
@RequestMapping("/convert")
public class ConverterController {

    @GetMapping("/testConvert")
    public String testConvert(@RequestParam("sucess") Boolean sucess)
    {
        System.out.println("testConvert");
        System.out.println(sucess);
        return "/JSPDemo1.jsp";
    }

    @GetMapping("/testConvertDate")
    public String testConvertDate(@RequestParam("brithday") Date brithday)
    {
        System.out.println("testConvertDate");
        System.out.println(brithday);
        return "/JSPDemo1.jsp";
    }

    @GetMapping("/testDateTimeFormat")
    public String testDateTimeFormat(@RequestParam("brithday")@DateTimeFormat(pattern = "yyyy-MM-dd") Date brithday)
    {
        System.out.println("testDateTimeFormat");
        System.out.println(brithday);
        return "/JSPDemo1.jsp";
    }
}
