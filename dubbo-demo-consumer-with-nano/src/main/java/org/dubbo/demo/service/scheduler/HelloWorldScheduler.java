package org.dubbo.demo.service.scheduler;

import org.dubbo.demo.service.HelloWorldService;
import org.nanoframework.commons.support.logging.Logger;
import org.nanoframework.commons.support.logging.LoggerFactory;
import org.nanoframework.concurrent.scheduler.BaseScheduler;
import org.nanoframework.concurrent.scheduler.Scheduler;

import com.alibaba.dubbo.config.annotation.Reference;

@Scheduler(parallel = 1, cron = "* * * * * ?", beforeAfterOnly = true)
public class HelloWorldScheduler extends BaseScheduler {
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldScheduler.class);
	
	private HelloWorldService service;
	
	@Reference(version = "0.0.1", group = "default", check = false, timeout = 3000)
	public HelloWorldService getService() {
		return service;
	}
	
	public void setService(HelloWorldService service) {
		this.service = service;
	}
	
	@Override
	public void before() {

	}

	@Override
	public void execute() {
		LOGGER.debug(getService().say(String.valueOf(Math.random())));
	}

	@Override
	public void after() {

	}

	@Override
	public void destroy() {

	}

}
