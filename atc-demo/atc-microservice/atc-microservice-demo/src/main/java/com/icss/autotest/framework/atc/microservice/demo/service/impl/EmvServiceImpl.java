package com.icss.autotest.framework.atc.microservice.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icss.autotest.framework.atc.microservice.demo.dao.TbEnvironmentInfoMapper;
import com.icss.autotest.framework.atc.microservice.demo.entity.TbEnvironmentInfo;
import com.icss.autotest.framework.atc.microservice.demo.entity.TbEnvironmentInfoExample;
import com.icss.autotest.framework.atc.microservice.demo.service.EmvService;

@Service
public class EmvServiceImpl implements EmvService{

	@Autowired
	private TbEnvironmentInfoMapper tbEnvironmentInfoMapper;

	@Override
	public List<TbEnvironmentInfo> getAllEmv() {
		// TODO Auto-generated method stub
		TbEnvironmentInfoExample example = new TbEnvironmentInfoExample();
		List<TbEnvironmentInfo> tbEnvironmentInfos = null;
		try{
			tbEnvironmentInfos = tbEnvironmentInfoMapper.selectByExample(example);
			
		}catch(Throwable e){
			e.printStackTrace();
			System.out.println(e);
		}
		
		return tbEnvironmentInfos;
	}
	
	
	
}
