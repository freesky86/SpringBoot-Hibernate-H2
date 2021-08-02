package com.example.listener;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class DemoSpringApplicationRunListener implements SpringApplicationRunListener {
	@Override
	public void started(ConfigurableApplicationContext context) {
		System.out.println("-------started-----");
	}

	@Override
	public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext,
			ConfigurableEnvironment environment) {
		System.out.println("-------environmentPrepared-----");
	}

	@Override
	public void contextPrepared(ConfigurableApplicationContext context) {
		System.out.println("-------contextPrepared-----");
	}

	@Override
	public void contextLoaded(ConfigurableApplicationContext context) {
		System.out.println("-------contextLoaded-----");
	}
}
