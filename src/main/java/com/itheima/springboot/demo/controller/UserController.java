package com.itheima.springboot.demo.controller;

import com.github.pagehelper.PageHelper;
import com.itheima.springboot.demo.pojo.User;
import com.itheima.springboot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @RequestMapping("/user")
    public String getUser() {
     /*  PageHelper.startPage(1,3);
       List<User> users = userService.findAll();
        redisTemplate.boundValueOps("key1").set("aaa");
        String value = redisTemplate.boundValueOps("key1").get();*/

        return "hello";

    }
}