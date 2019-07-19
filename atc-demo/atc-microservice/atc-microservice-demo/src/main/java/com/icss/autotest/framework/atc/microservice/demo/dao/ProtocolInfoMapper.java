package com.icss.autotest.framework.atc.microservice.demo.dao;

import com.icss.autotest.framework.atc.microservice.demo.entity.ProtocolInfo;
import com.icss.autotest.framework.atc.microservice.demo.entity.ProtocolInfoKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
@Mapper
public interface ProtocolInfoMapper {
    int deleteByPrimaryKey(ProtocolInfoKey key);

    int insert(ProtocolInfo record);

    int insertSelective(ProtocolInfo record);

    ProtocolInfo selectByPrimaryKey(ProtocolInfoKey key);

    int updateByPrimaryKeySelective(ProtocolInfo record);

    int updateByPrimaryKey(ProtocolInfo record);

    List<Map<String,Object>> getProtocolTypeList();

    List<ProtocolInfo> getProtocolList(@Param("applicationId") String applicationId, @Param("protocolType") String protocolType);
}