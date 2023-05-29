package com.clement.dao;

import com.clement.pojo.Role;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RoleMapper {

    @Select("select * from smbms_role where id=#{id}")
    Role findById(@Param("id") long id);


    @Select("select * from smbms_role")
    List<Role> findAll();
}