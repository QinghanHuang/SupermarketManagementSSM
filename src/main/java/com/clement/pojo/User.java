package com.clement.pojo;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author Qinghan Huang
 * @Date 2023/5/25 22:29
 * @Desc
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long id; // 主键ID
    private String userCode;    // 用户编码
    private String userName;    // 用户名称
    private String userPassword;    // 用户密码
    private int gender; // 性别
    private Date birthday;  // 出生日期
    private String phone;   // 手机
    private String address; // 地址
    private long userRole;   // 用户角色
    private long createdBy;  // 创建者
    private Date creationDate;  // 创建时间
    private long modifyBy;   // 更新者
    private Date modifyDate;    // 更新时间

    private int age; //年龄
    private String userRoleName; //用户角色名称

    public int getAge() {
        Date date = new Date();
        int age = date.getYear()-birthday.getYear();
        return age;
    }

    public String getUserRoleName(){
        if (userRole==1){
            return "System Admin";
        }else if (userRole==2){
            return "Manager";
        }else if (userRole==3){
            return "Employee";
        }
        return "";
    }
}
