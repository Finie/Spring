package com.fin.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.fin.spring.HelloWorld;

@Configuration
@Import(TextEditConfig.class)
public class AppConfig {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	@Scope("prototype")
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}

}
