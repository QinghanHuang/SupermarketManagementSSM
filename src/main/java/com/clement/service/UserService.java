package com.clement.service;

import com.clement.pojo.User;



import java.util.List;

public interface UserService {


    User findById( int id);
    int insertUser(User user);
}
