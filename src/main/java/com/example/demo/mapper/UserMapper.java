package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    /**
     * 根据用户名获取唯一的用户信息，在登录时使用
     * @param userName
     * @return
     */
    User getUserByName(String userName);
}
