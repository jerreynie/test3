package com.itheima.springboot.demo.mapper;

import com.itheima.springboot.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user where id = #{id}")
    User getById(Integer id);
    @Select("select * from user ")
    List<User> findAll();
}
