package com.icss.autotest.framework.atc.microservice.demo.dao;

import com.icss.autotest.framework.atc.microservice.demo.entity.TbEnvironmentInfo;
import com.icss.autotest.framework.atc.microservice.demo.entity.TbEnvironmentInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TbEnvironmentInfoMapper {
    long countByExample(TbEnvironmentInfoExample example);

    int deleteByExample(TbEnvironmentInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbEnvironmentInfo record);

    int insertSelective(TbEnvironmentInfo record);

    List<TbEnvironmentInfo> selectByExample(TbEnvironmentInfoExample example);

    TbEnvironmentInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbEnvironmentInfo record, @Param("example") TbEnvironmentInfoExample example);

    int updateByExample(@Param("record") TbEnvironmentInfo record, @Param("example") TbEnvironmentInfoExample example);

    int updateByPrimaryKeySelective(TbEnvironmentInfo record);

    int updateByPrimaryKey(TbEnvironmentInfo record);
}