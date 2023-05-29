package com.clement.dao;

import com.clement.pojo.Provider;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProviderMapper {

    @Select("select* from smbms_provider where id=#{id} ")
    Provider findById(@Param("id") long id);

    @Select("select * from smbms_provider " +
            "where proName like concat('%',#{proName},'%') " +
            "and proCode like concat('%',#{proCode},'%')")
    List<Provider> findByCodeAndName(@Param("proCode") String proCode, @Param("proName") String proName);

    @Insert("insert into smbms_provider(id,proCode,proName,proDesc,proContact,proPhone,proAddress,proFax,createdBy,creationDate)\n" +
            "        values(null,#{proCode},#{proName},#{proDesc},#{proContact},#{proPhone},#{proAddress},#{proFax},#{createdBy},#{creationDate});")
    int insertProvider(Provider provider);

    @Delete("delete from smbms_provider where id=#{id} ")
    int deleteById(long id);

    @Update("update smbms_provider set proCode=#{proCode},proName =#{proName},proDesc=#{proDesc},proContact=#{proContact},\n" +
            "                                proPhone=#{proPhone},proAddress = #{proAddress},proFax=#{proFax},modifyDate=#{modifyDate},\n" +
            "                                modifyBy=#{modifyBy}\n" +
            "        where id = #{id};")
    int updateProvider(Provider provider);

    @Select("select * from smbms_provider")
    List<Provider> findAll();
}
