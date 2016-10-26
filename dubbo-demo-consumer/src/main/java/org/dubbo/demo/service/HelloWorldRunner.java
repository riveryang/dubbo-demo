package org.dubbo.demo.service;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.context.ApplicationContext;

public class HelloWorldRunner implements Runnable {
	
	private ApplicationContext context;
	
	private int num;
	
	public HelloWorldRunner(final ApplicationContext context, final int num) {
		this.context = context;
		this.num = num;
	}
	
	@Override
	public void run() {
		final AtomicInteger count = new AtomicInteger(0);
		final HelloWorldService service = (HelloWorldService) context.getBean("helloWorldService");
		if (service == null) {
			throw new IllegalArgumentException("Not found service: helloWorldService");
		}
		
		for(;;) {
			try {
				System.out.println(num + ": " + service.say(String.valueOf(count.incrementAndGet())));
			} catch (final Throwable e) {
				System.out.println(e.getMessage());
			} finally {
				try {Thread.sleep(1000); } catch (final Throwable ex) {}
			}
		}
		
	}

}
