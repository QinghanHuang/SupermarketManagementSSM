package com.clement.service;

import com.clement.dao.UserMapper;
import com.clement.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Qinghan Huang
 * @Date 2023/5/29 22:26
 * @Desc
 * @Version 1.0
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User login(String username, String password){
        User byNameAndPassword = userMapper.findByNameAndPassword(username, password);
        if (byNameAndPassword == null){
            return null;
        }else {
            return byNameAndPassword;
        }
    }

    public boolean updatePasswordById(String password,long id){
        int i = userMapper.updatePasswordById(id, password);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }

    public int findUserCountByRoleIdAndUsername(long id,String username){
        return userMapper.findUserCountByRoleIdAndUsername(id,username);
    }

    public List<User> findUserByRoleIdAndUsernameAndPageLimit(long id, String username, int startIndex, int pageSize){
        return userMapper.findUserByRoleIdAndUsernameAndPageLimit(id,username,startIndex,pageSize);
    }

    public int insertUser(User user){
        return userMapper.insertUser(user);
    }

    public List<User> findAll(){
        return userMapper.findAll();
    }

    public int deleteById(long id){
        return userMapper.deleteById(id);
    }

    public User findById(long id){
        return userMapper.findById(id);
    }

    public int updateUser(User user){
        return userMapper.updateUser(user);
    }
}
