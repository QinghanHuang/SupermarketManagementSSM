package com.clement.mapper_test;

import com.clement.dao.UserMapper;
import com.clement.pojo.User;
import com.clement.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author Qinghan Huang
 * @Date 2023/5/28 22:30
 * @Desc
 * @Version 1.0
 */

@Transactional
@Rollback(value = false)
@ContextConfiguration(locations="file:src/main/resources/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserMapperTest {
    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userServiceImpl;

    @Test
    public void selectTest(){
        userMapper.findById(1);
        userMapper.findAll();
        userMapper.findByNameAndPassword("qqq","123");
    }

    @Test
    public void updateTest(){
//        userMapper.updatePasswordById();

    }
    @Test
    public void insertTest(){
        User user = new User();
        user.setUserName("Test");
        userMapper.insertUser(user);

    }
    @Test
    public void deleteTest(){
        userMapper.deleteById(20);
        userMapper.deleteById(22);

    }
    @Test
    public void test(){
        userServiceImpl.insertUser(new User());

    }

}
