package org.dubbo.demo.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderBootstrap {
	public static void main(String[] args) throws InterruptedException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/META-INF/dubbo-provider.xml");
		context.start();
		synchronized (ProviderBootstrap.class) {
			ProviderBootstrap.class.wait(60 * 60 * 1000);
		}
		
	}
}
