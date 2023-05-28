package com.clement;

import com.clement.dao.UserMapper;
import com.clement.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;

/**
 * @Author Qinghan Huang
 * @Date 2023/5/28 18:02
 * @Desc
 * @Version 1.0
 */
public class MainTest {
    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper= applicationContext.getBean(UserMapper.class);
//        System.out.println(mapper.getUserList());
        User bean = applicationContext.getBean(User.class);
        System.out.println(bean);
    }
    @Test
    public void test1(){
        Date date = new Date(123123131);
        System.out.println(date);

    }
}
