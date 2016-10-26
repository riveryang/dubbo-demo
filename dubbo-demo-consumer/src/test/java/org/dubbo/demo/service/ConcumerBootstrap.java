package org.dubbo.demo.service;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConcumerBootstrap {

	public static void main(String[] args) throws InterruptedException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/META-INF/dubbo-consumer.xml");
		context.start();
		final Executor service = Executors.newCachedThreadPool();
		for (int idx = 0; idx < 1; idx ++) {
			service.execute(new HelloWorldRunner(context, idx));
		}
		
		synchronized (ConcumerBootstrap.class) {
			ConcumerBootstrap.class.wait(60 * 60 * 1000);
		}
	}
}
