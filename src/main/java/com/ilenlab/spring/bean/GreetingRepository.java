package com.ilenlab.spring.bean;

import java.util.Date;

import org.springframework.stereotype.Repository;
@Repository
public class GreetingRepository {
	
	public String getAppName() {
		return "Hello Spring App";
	}
	
	public Date getSystemDateTime() {
		return new Date();
	}
}
