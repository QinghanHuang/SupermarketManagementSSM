package com.clement.dao;

import com.clement.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface RoleMapper {
    Role findById(@Param("id") long id);
    List<Role> findAll();
}