package com.siddu.service;

public class GreetingServiceImpl implements GreetingService{

	public static final String GREETING_MESSAGE = "Hello siddu";
	
	public GreetingService greetingService;
	
	public String greeting() {
		return GREETING_MESSAGE;
	}
}
