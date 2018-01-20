package com.itheima.springboot.demo.service.impl;

import com.itheima.springboot.demo.mapper.UserMapper;
import com.itheima.springboot.demo.pojo.User;
import com.itheima.springboot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getById(Integer id) {
        return userMapper.getById(id);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
