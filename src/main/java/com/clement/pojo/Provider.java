package com.clement.pojo;

import lombok.*;

import java.util.Date;

/**
 * @Author Qinghan Huang
 * @Date 2023/5/28 18:27
 * @Desc
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Provider {
    private long id;
    // 供应商编码
    private String proCode;
    // 供应商名称
    private String proName;
    // 供应商描述
    private String proDesc;
    // 供应商联系人
    private String proContact;
    // 供应商电话
    private String proPhone;
    // 供应商地址
    private String proAddress;
    // 供应商传真
    private String proFax;
    // 创建者
    private long createdBy;
    // 创建时间
    private Date creationDate;
    // 更新时间
    private Date modifyDate;
    // 更新者
    private long modifyBy;
}
