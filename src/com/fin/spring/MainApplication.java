package com.fin.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.fin.spring.config.AppConfig;

public class MainApplication {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		HelloWorld hello = context.getBean(HelloWorld.class);
		hello.setMessage("Hey this is the message hope you hack it ;)");
		System.out.println("::::::::::::::" + hello.getMessage() + "\n\n");
		
		HelloWorld hello1 = context.getBean(HelloWorld.class);
		
		System.out.println("::::::::::::::" + hello1.getMessage() + "\n\n");

		TextEditor text = context.getBean(TextEditor.class);
		text.checkSpelling();
		
	

	}

}
