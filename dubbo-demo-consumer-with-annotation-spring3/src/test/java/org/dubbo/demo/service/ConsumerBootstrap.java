package org.dubbo.demo.service;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerBootstrap {

	public static void main(String[] args) throws InterruptedException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/META-INF/dubbo-consumer.xml");
		context.start();
		final Executor service = Executors.newCachedThreadPool();
		for (int idx = 0; idx < 1; idx ++) {
			service.execute(new HelloWorldRunner(context, idx));
		}
		
		synchronized (ConsumerBootstrap.class) {
			ConsumerBootstrap.class.wait(60 * 60 * 1000);
		}
	}
}
