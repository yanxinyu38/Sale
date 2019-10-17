package com.example.demo.service.impl;

import com.example.demo.common.exception.CustomException;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String userName, String password) {
        User user = userMapper.getUserByName(userName);
        if(user != null && user.getPassword().equals(password)) {
            return user;
        }
        throw new CustomException("用户名或密码错误");
    }
}
