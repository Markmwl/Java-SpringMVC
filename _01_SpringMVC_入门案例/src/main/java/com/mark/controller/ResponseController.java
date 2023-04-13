package com.mark.controller;

import com.mark.Models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

@RestController // 等同于 @Controller + @ResponseBody
@RequestMapping("/response")
public class ResponseController {

    @GetMapping("/user/{id}")
    //@ResponseBody //将方法的返回值放入响应体中
    public User findUserById(@PathVariable Integer id)
    {
        User user = new User(id,"张三",18,null);
        return user;//因为已经做过配置，所以会自动把返回值转为json
    }

    @GetMapping("/user")
    //@ResponseBody
    public List<User> findUser()
    {
        List<User> lisUser = new ArrayList<User>(){
            {
                add(new User(1, "张三", 18, null));
                add(new User(2, "李四", 22, null));
                add(new User(3, "王五", 25, new String[]{"唱","跳","Rap","篮球"}));
            }
        };
        return lisUser;
    }
}
