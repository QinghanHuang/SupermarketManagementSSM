package com.clement.dao;

import com.clement.pojo.Bill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BillMapper {


    Bill findById(@Param("id") long id);

    List<Bill> findByProductNameAndProviderIdAndIsPayment(@Param("productName") String productName, @Param("providerId") long providerId, @Param("isPayment") int isPayment);

    int insertBill(Bill bill);

    int deleteBill(@Param("id") long id);

    int updateBill(Bill bill);
}

