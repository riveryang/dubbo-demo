package org.dubbo.demo.service.impl;

import org.dubbo.demo.service.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String say(String who) {
		return "Hello, " + who;
	}

}
