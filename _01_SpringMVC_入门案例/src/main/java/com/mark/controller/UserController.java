package com.mark.controller;

import com.mark.Models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping(value = "/{id}")
    public String finduserByID(@PathVariable("id") Integer id)
    {
        System.out.println("finduserByID!");
        System.out.println(id);
        return "/JSPDemo1.jsp";
    }

    @GetMapping(value = "/{id}/{name}")
    public String finduserByIDName(@PathVariable("id") Integer id,@PathVariable("name")String Name)
    {
        System.out.println("finduserByIDName!");
        System.out.println(id + Name);
        return "/JSPDemo1.jsp";
    }

    @PostMapping()
    public String findUser(@RequestBody User user)
    {
        System.out.println("findUser");
        System.out.println(user);
        return "/JSPDemo1.jsp";
    }

    @PostMapping("/findMap")
    public String findMap(@RequestBody Map map)
    {
        System.out.println("findMap");
        System.out.println(map);
        return "/JSPDemo1.jsp";
    }

    @PostMapping("/findUserList")
    public String findUserList(@RequestBody List<User> users)
    {
        System.out.println("findUserList");
        System.out.println(users);
        return "/JSPDemo1.jsp";
    }
}
