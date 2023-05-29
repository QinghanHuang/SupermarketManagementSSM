package com.clement.service;

import com.clement.dao.BillMapper;
import com.clement.dao.ProviderMapper;
import com.clement.pojo.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Qinghan Huang
 * @Date 2023/5/29 22:32
 * @Desc
 * @Version 1.0
 */
@Service
public class BillService {

    @Autowired
    private BillMapper billMapper;

    @Autowired
    private ProviderMapper providerMapper;

    public Bill findById(long id){
        Bill bill = billMapper.findById(id);
        bill.setProviderName(providerMapper.findById(bill.getProviderId()).getProName());
        return bill;
    }

    public List<Bill> findByProductNameAndProviderIdAndIsPayment(String productName, long providerId, int isPayment){
        List<Bill> billList = billMapper.findByProductNameAndProviderIdAndIsPayment(productName, providerId, isPayment);
        for (Bill bill : billList) {
            bill.setProviderName(providerMapper.findById(bill.getProviderId()).getProName());
        }
        return billList;
    }

    public int insertBill(Bill bill){
        return billMapper.insertBill(bill);
    }

    public int deleteBill(long id){
        return billMapper.deleteBill(id);
    }

    public int updateBill(Bill bill){
        return billMapper.updateBill(bill);
    }

}
