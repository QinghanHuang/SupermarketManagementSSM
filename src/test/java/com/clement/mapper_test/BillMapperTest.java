package com.clement.mapper_test;

import com.clement.dao.BillMapper;
import com.clement.dao.RoleMapper;
import com.clement.pojo.Bill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author Qinghan Huang
 * @Date 2023/5/29 16:52
 * @Desc
 * @Version 1.0
 */
@Transactional(rollbackFor = Exception.class)
@Rollback(value = false)
@ContextConfiguration(locations="file:src/main/resources/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class BillMapperTest {
    @Autowired
    BillMapper billMapper;
    @Test
    public void test(){
        Bill bill = new Bill();
        bill.setBillCode("Test");

        billMapper.insertBill(bill);



    }
    @Test
    public void test1(){
        Bill bill = new Bill();
        bill.setId(19);
        bill.setBillCode("Test1");
        billMapper.updateBill(bill);
    }
    @Test
    public void test2(){
        billMapper.findById(19);
    }
    @Test
    public void test3(){
        billMapper.findByProductNameAndProviderIdAndIsPayment("大豆油", 6, 2);
    }

    @Test
    public void test4(){
        billMapper.deleteBill(20);
        billMapper.deleteBill(21);
        billMapper.deleteBill(22);

    }

}
