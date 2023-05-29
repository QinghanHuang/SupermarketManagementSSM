package com.clement.service;

import com.clement.dao.ProviderMapper;
import com.clement.pojo.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Qinghan Huang
 * @Date 2023/5/29 22:31
 * @Desc
 * @Version 1.0
 */
@Service
public class ProviderService {
    @Autowired
    private ProviderMapper providerMapper;

    public Provider findById(long id){
        return providerMapper.findById(id);
    }

    public List<Provider> findByCodeAndName(String proCode, String proName){
        return providerMapper.findByCodeAndName(proCode,proName);
    }

    public int insertProvider(Provider provider){
        return providerMapper.insertProvider(provider);
    }

    public int deleteById(long id){
        return providerMapper.deleteById(id);
    }

    public int updateProvider(Provider provider){
        return providerMapper.updateProvider(provider);
    }

    public List<Provider> findAll(){
        return providerMapper.findAll();
    }

}