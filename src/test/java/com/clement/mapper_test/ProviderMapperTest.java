package com.clement.mapper_test;

import com.clement.dao.BillMapper;
import com.clement.dao.ProviderMapper;
import com.clement.pojo.Provider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author Qinghan Huang
 * @Date 2023/5/29 17:18
 * @Desc
 * @Version 1.0
 */

@Transactional(rollbackFor = Exception.class)
@Rollback(value = false)
@ContextConfiguration(locations="file:src/main/resources/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ProviderMapperTest {

    @Autowired
    ProviderMapper providerMapper;
    @Test
    public void test(){
        providerMapper.findById(1);
        providerMapper.findAll();
        providerMapper.findByCodeAndName("","");
    }
    @Test
    public void test1(){
        Provider provider = new Provider();
        provider.setProCode("Test1");
        provider.setId(16);
        providerMapper.updateProvider(provider);

    }
    @Test
    public void test2(){
        Provider provider = new Provider();
        provider.setProCode("Test");
        providerMapper.insertProvider(provider);

    }

    @Test
    public void test3(){
        providerMapper.deleteById(16);

    }
}
