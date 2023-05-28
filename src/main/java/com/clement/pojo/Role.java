package com.clement.pojo;

import lombok.*;

import java.util.Date;

/**
 * @Author Qinghan Huang
 * @Date 2023/5/28 18:25
 * @Desc
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    // ID
    private long id;
    // 角色编码
    private String roleCode;
    // 角色名称
    private String roleName;
    // 创建者
    private long createdBy;
    // 创建时间
    private Date creationDate;
    // 更新者
    private long modifyBy;
    // 更新时间
    private Date modifyDate;
}
