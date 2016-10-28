package org.dubbo.demo.service.impl;

import org.dubbo.demo.service.HelloWorldService;
import org.dubbo.demo.service.TestAutowireService;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "0.0.1", owner = "yanghe", group = "default", loadbalance = "random", timeout = 5, retries = 2, token = "true", weight = 100)
public class HelloWorldServiceImpl implements HelloWorldService {

	@Autowired
	private TestAutowireService testAutowireService;
	
	@Override
	public String say(String who) {
		return testAutowireService.say(who);
	}

}
