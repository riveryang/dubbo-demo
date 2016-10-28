package org.dubbo.demo.service.impl;

import org.dubbo.demo.service.TestAutowireService;
import org.springframework.stereotype.Service;

@Service
public class TestAutowireServiceImpl implements TestAutowireService {

	@Override
	public String say(String who) {
		return "Hello, " + who;
	}

}
