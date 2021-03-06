package org.dubbo.demo.service.impl;

import org.dubbo.demo.service.HelloWorldService;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "0.0.1", owner = "yanghe", group = "default", loadbalance = "random", timeout = 5, retries = 2, token = "true", weight = 100)
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String say(String who) {
		return "Hello, " + who;
	}

}
