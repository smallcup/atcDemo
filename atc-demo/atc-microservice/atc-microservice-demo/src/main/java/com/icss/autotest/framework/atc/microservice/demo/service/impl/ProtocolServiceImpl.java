package com.icss.autotest.framework.atc.microservice.demo.service.impl;

import com.icss.autotest.framework.atc.microservice.demo.dao.ProtocolInfoMapper;
import com.icss.autotest.framework.atc.microservice.demo.entity.ProtocolInfo;
import com.icss.autotest.framework.atc.microservice.demo.service.ProtocolService;

import tk.mybatis.mapper.util.StringUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author JawnWu
 */
@Service
public class ProtocolServiceImpl implements ProtocolService {

    @Autowired
    private ProtocolInfoMapper protocolInfoMapper;
    @Override
    public List<Map<String, Object>> getProtocolTypeList() {
        return protocolInfoMapper.getProtocolTypeList();
    }

    @Override
    public List<ProtocolInfo> getProtocolList(String applicationId,String protocolType) {

        return protocolInfoMapper.getProtocolList(applicationId,protocolType);
    }

    @Override
    public void saveProtocol(ProtocolInfo protocolInfo) {
        if(StringUtil.isEmpty(protocolInfo.getId())){
            protocolInfoMapper.insertSelective(protocolInfo);
        }else{
            protocolInfoMapper.updateByPrimaryKey(protocolInfo);
        }
    }
}
