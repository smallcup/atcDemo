package com.icss.autotest.framework.atc.microservice.demo.controller;

import com.icss.autotest.framework.atc.microservice.demo.dto.BaseResult;
import com.icss.autotest.framework.atc.microservice.demo.entity.ProtocolInfo;
import com.icss.autotest.framework.atc.microservice.demo.service.ProtocolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通信配置控制器
 *
 * @author JawnWu
 */
@RestController
public class ProtocolController {

    @Autowired
    private ProtocolService protocolService;

    /**
     * 查询通信类型列表
     *
     * @return
     */
    @RequestMapping(value = "/protocolTypes", method = RequestMethod.GET)
    public BaseResult getProtocolTypeList() {
        BaseResult result = new BaseResult(true, protocolService.getProtocolTypeList(), "SUCCESS", "SUCCESS");
        return result;
    }

    /**
     * 查询通信类型列表
     *
     * @return
     */
    @RequestMapping(value = "/protocols", method = RequestMethod.GET)
    public BaseResult getProtocol(String applicationId, String protocolType) {
        BaseResult result = new BaseResult(true, protocolService.getProtocolList(applicationId, protocolType), "SUCCESS", "SUCCESS");
        return result;
    }

    /**
     * 新增/修改通信类型列表
     *
     * @return
     */
    @RequestMapping(value = "/protocol", method = RequestMethod.POST)
    public BaseResult saveProtocol(ProtocolInfo protocolInfo) {
        protocolService.saveProtocol(protocolInfo);
        return new BaseResult(true, "SUCCESS");
    }
}
