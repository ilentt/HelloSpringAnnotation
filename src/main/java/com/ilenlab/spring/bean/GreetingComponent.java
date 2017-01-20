package com.ilenlab.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingComponent {
	@Autowired
	private GreetingRepository repository;
	public void showAppInfo() {
		System.out.println("Now is: " + repository.getSystemDateTime());
		System.out.println("App Name: " + repository.getAppName());
		
	}
}
