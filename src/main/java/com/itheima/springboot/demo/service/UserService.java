package com.itheima.springboot.demo.service;

import com.itheima.springboot.demo.pojo.User;

import java.util.List;

public interface UserService {
    public User getById(Integer id);
    List<User> findAll();
}
