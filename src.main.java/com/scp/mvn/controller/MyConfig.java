package com.scp.mvn.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.scp.mvn.*")
public class MyConfig {

	
	
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setSuffix(".jsp");
		resolver.setPrefix("");
		return resolver;
	}
	
}
