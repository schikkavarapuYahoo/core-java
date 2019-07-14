package com.siddu.controllers;

import com.siddu.service.GreetingServiceImpl;

public class SetterInjection {
	
	public GreetingServiceImpl greetingServiceImplObject;
	
	public String sayHello() {
		return greetingServiceImplObject.greeting();
	}
	
	public GreetingServiceImpl greetingServiceImpl() {
		return greetingServiceImplObject;
	}

}
