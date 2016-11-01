package org.dubbo.demo.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderBootstrap {
	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) throws InterruptedException {
		context = new ClassPathXmlApplicationContext("classpath:/META-INF/dubbo-provider.xml");
		context.start();
		synchronized (ProviderBootstrap.class) {
			ProviderBootstrap.class.wait(60 * 60 * 1000);
		}
		
	}
}
