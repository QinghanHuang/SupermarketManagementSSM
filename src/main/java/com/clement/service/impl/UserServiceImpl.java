package com.clement.service.impl;

import com.clement.dao.UserMapper;
import com.clement.pojo.User;
import com.clement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Qinghan Huang
 * @Date 2023/5/25 23:54
 * @Desc
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(int id) {

        return userMapper.findById(id) ;
    }

    @Override
    public int insertUser(User user) {
        User user1 = new User();
        user.setUserName("Test");
        return  userMapper.insertUser(user);

    }
}
