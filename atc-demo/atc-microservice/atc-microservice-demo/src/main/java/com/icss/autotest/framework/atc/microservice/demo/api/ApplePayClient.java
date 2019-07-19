package com.icss.autotest.framework.atc.microservice.demo.api;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.icss.autotest.framework.atc.microservice.demo.dto.BaseResult;


@FeignClient(name = "cloudE-pay-provider")
public interface ApplePayClient {

    @RequestMapping(value = "apple/recharge", method = RequestMethod.POST)
    BaseResult<Boolean> recharge(@RequestParam("userId") Long userId, @RequestParam("amount") Double amount);

}
