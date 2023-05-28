package com.clement.pojo;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author Qinghan Huang
 * @Date 2023/5/28 18:28
 * @Desc
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bill {
    private long id;
    // 账单编码
    private String billCode;
    // 商品名称
    private String productName;
    // 商品描述
    private String productDesc;
    // 商品单位
    private String productUnit;
    // 商品数量
    private BigDecimal productCount;
    // 总金额
    private BigDecimal totalPrice;
    // 是否支付
    private int isPayment;
    // 创建者
    private long createdBy;
    // 创建时间
    private Date creationDate;
    // 更新者
    private long modifyBy;
    // 更新时间
    private Date modifyDate;
    // 供应商ID
    private long providerId;
    // 提供者的姓名
    private String providerName;
}
