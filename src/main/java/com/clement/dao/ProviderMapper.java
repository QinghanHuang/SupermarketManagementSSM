package com.clement.dao;

import com.clement.pojo.Provider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProviderMapper {
    Provider findById(@Param("id") long id);

    List<Provider> findByCodeAndName(@Param("proCode") String proCode, @Param("proName") String proName);

    int insertProvider(Provider provider);

    int deleteById(long id);

    int updateProvider(Provider provider);

    List<Provider> findAll();
}
