package com.clement.mapper_test;

import com.clement.dao.RoleMapper;
import com.clement.pojo.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author Qinghan Huang
 * @Date 2023/5/29 16:43
 * @Desc
 * @Version 1.0
 */
@Transactional(rollbackFor = Exception.class)
@Rollback(value = false)
@ContextConfiguration(locations="file:src/main/resources/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class RoleMapperTest {
    @Autowired
    RoleMapper roleMapper;
    @Test
    public void test(){
        Role role = roleMapper.findById(1);
        roleMapper.findAll();


    }

}
