package org.dubbo.demo.service.impl;

import java.util.Enumeration;
import java.util.concurrent.CountDownLatch;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

import org.nanoframework.core.plugins.defaults.DefaultPluginLoader;

public class ProviderBootstrap {
	public static void main(String[] args) throws Throwable {
		new DefaultPluginLoader().init(new ServletConfig() {
			
			@Override
			public String getServletName() {
				return null;
			}
			
			@Override
			public ServletContext getServletContext() {
				return null;
			}
			
			@Override
			public Enumeration<String> getInitParameterNames() {
				return null;
			}
			
			@Override
			public String getInitParameter(String name) {
				return null;
			}
		});
		
		new CountDownLatch(1).await();
	}
}
