package com.icss.autotest.framework.atc.microservice.demo.controller;


import com.alibaba.fastjson.JSON;
import com.icss.autotest.framework.atc.microservice.demo.api.ApplePayClient;
import com.icss.autotest.framework.atc.microservice.demo.dto.BaseResult;
import com.icss.autotest.framework.atc.microservice.demo.entity.TbEnvironmentInfo;
import com.icss.autotest.framework.atc.microservice.demo.entity.User;
import com.icss.autotest.framework.atc.microservice.demo.service.EmvService;
import com.icss.autotest.framework.atc.microservice.demo.ucenter.manager.UserManager;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.annotation.Resource;

/**
 * @author vangao1989
 * @date 2017年7月26日
 */
@RestController
public class EmvProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmvProvider.class);

    @Resource
    private EmvService emvService;
    
    @HystrixCommand(fallbackMethod = "rechargeFallback")
    @RequestMapping(value = "/user/Emv", method = RequestMethod.GET)
    public BaseResult<Boolean> recharge() {
    	 LOGGER.info("emvService.getAllEmv");
    	List<TbEnvironmentInfo> tbEnvironmentInfos = emvService.getAllEmv();
       
        LOGGER.info("user {} recharge  res:{}",JSON.toJSONString(tbEnvironmentInfos));
        
        BaseResult<Boolean> baseResult = new BaseResult(true,tbEnvironmentInfos,"SUCCESS","SUCCESS");
        return baseResult;

    }

   /* @HystrixCommand(fallbackMethod = "rechargeFallback")
    @RequestMapping(value = "/user/recharge", method = RequestMethod.POST)
    public String recharge(@RequestParam(value = "userId") Long userId,
                                        @RequestParam(value = "amount") Double amount,
                                        @RequestParam(value = "type") String type) {
        User user = userService.getUserByUserId(userId);
        LOGGER.info("user {} recharge {},type:{}", user.getUsername(), amount, type);
        LOGGER.info("user {} recharge  res:{}", user.getUsername(), JSON.toJSONString(baseResult));
        return "";

    }
*/
    private BaseResult<Boolean> rechargeFallback( Throwable throwable) {
       // LOGGER.error("user:{} recharge,amount:{},type:{}, fail:{}", useId, amount, type, throwable.getMessage(), throwable);
        return new BaseResult<>(false, throwable.getMessage());
    }


}
