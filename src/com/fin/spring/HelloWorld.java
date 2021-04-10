package com.fin.spring;

public class HelloWorld {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public void init() {
		System.out.println("Initializing hello world");
	}
	
	
	public void destroy() {
		System.out.println("destroying hello world");
	}

}
