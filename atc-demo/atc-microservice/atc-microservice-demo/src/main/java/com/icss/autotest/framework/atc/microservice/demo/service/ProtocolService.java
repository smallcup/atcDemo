package com.icss.autotest.framework.atc.microservice.demo.service;

import com.icss.autotest.framework.atc.microservice.demo.entity.ProtocolInfo;

import java.util.List;
import java.util.Map;

/**
 * @author JawnWu
 */
public interface ProtocolService {
    /**
     * 查询通信类型列表
     *
     * @return
     */
    List<Map<String, Object>> getProtocolTypeList();

    /**
     *
     * @param applicationId
     * @param protocolType
     * @return
     */
    List<ProtocolInfo> getProtocolList(String applicationId,String protocolType);

    /**
     * 新增/更新通信配置
     * @param protocolInfo
     */
    void saveProtocol(ProtocolInfo protocolInfo);
}
