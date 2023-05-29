package com.clement.dao;

import com.clement.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    @Select("select * from smbms_user where id=#{id}")
    User findById(@Param("id") long id);
    @Select("select * from smbms_user where userName=#{userName} and userPassword=#{userPassword}")
    User findByNameAndPassword(@Param("userName") String userName,@Param("userPassword") String userPassword);

    @Select("select * from smbms_user")
    List<User> findAll();


    int findUserCountByRoleIdAndUsername(@Param("id") long id,@Param("username") String username);


    List<User> findUserByRoleIdAndUsernameAndPageLimit(@Param("id") long id, @Param("username") String username, @Param("startIndex") int startIndex, @Param("pageSize") int pageSize);

    @Insert("insert into smbms_user(id,userCode,userName,userPassword,gender,birthday,phone,address,userRole,createdBy,creationDate) values(null ,#{userCode},#{userName},#{userPassword},#{gender},#{birthday},#{phone},#{address},#{userRole},#{createdBy},#{creationDate}); ")
    int insertUser(User user);


    @Update("update smbms_user set userPassword = #{password} where id = #{id}")
    int updatePasswordById(@Param("id") long id,@Param("password") String password);


    @Update("update smbms_user set userName = #{userName} ,gender = #{gender},birthday = #{birthday},phone=#{phone},address=#{address},userRole = #{userRole},modifyBy=#{modifyBy},modifyDate=#{modifyDate}  where id = #{id};")
    int updateUser(User user);

    @Delete("delete from smbms_user where id=#{id}")
    int deleteById(@Param("id") long id);
}