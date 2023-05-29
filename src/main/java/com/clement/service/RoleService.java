package com.clement.service;

import com.clement.dao.RoleMapper;
import com.clement.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Qinghan Huang
 * @Date 2023/5/29 22:29
 * @Desc
 * @Version 1.0
 */
@Service
public class RoleService {

    @Autowired
    private RoleMapper roleMapper;

    public List<Role> findAll(){
        return roleMapper.findAll();
    }
}
