package com.clement.dao;

import com.clement.pojo.Bill;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BillMapper {

    @Select("select * from smbms_bill where id=#{id}")
    Bill findById(@Param("id") long id);

    @Select("SELECT * FROM smbms_bill\n" +
            "WHERE\n" +
            "    isPayment = #{isPayment}\n" +
            "    AND productName LIKE CONCAT('%', #{productName}, '%')\n" +
            "    AND providerId = #{providerId}")
    List<Bill> findByProductNameAndProviderIdAndIsPayment(@Param("productName") String productName, @Param("providerId") long providerId, @Param("isPayment") int isPayment);

    @Insert("insert into smbms_bill(id,billCode,productName,productDesc,productUnit,productCount,totalPrice,isPayment,createdBy,creationDate,providerId) values(null ,#{billCode},#{productName},#{productDesc},#{productUnit},#{productCount},#{totalPrice},#{isPayment},#{createdBy},#{creationDate},#{providerId});")
    int insertBill(Bill bill);

    @Delete("delete from  smbms_bill where id=#{id}")
    int deleteBill(@Param("id") long id);

    @Update("update smbms_bill set billCode=#{billCode},productName=#{productName},productDesc=#{productDesc}, productUnit=#{productUnit},productCount=#{productCount}, totalPrice=#{totalPrice},isPayment=#{isPayment},modifyBy=#{modifyBy}, modifyDate=#{modifyDate},providerId=#{providerId} where id = #{id};")
    int updateBill(Bill bill);
}

