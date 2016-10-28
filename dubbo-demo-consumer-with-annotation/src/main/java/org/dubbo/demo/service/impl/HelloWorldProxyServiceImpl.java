package org.dubbo.demo.service.impl;

import org.dubbo.demo.service.HelloWorldProxyService;
import org.dubbo.demo.service.HelloWorldService;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;

@Service
public class HelloWorldProxyServiceImpl implements HelloWorldProxyService {

	@Reference(version = "0.0.1", group = "default")
	private HelloWorldService helloWorldService;
	
	@Override
	public String say(String who) {
		return "proxy: " + helloWorldService.say(who);
	}

}
