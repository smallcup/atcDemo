package com.icss.autotest.framework.atc.microservice.demo.ucenter.manager;


import org.springframework.stereotype.Component;

import com.icss.autotest.framework.atc.microservice.demo.dao.UserMapper;
import com.icss.autotest.framework.atc.microservice.demo.entity.User;

import javax.annotation.Resource;

@Component
public class UserManager {

    @Resource
    private UserMapper userMapper;

    public User getUserByUserId(Long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

}
