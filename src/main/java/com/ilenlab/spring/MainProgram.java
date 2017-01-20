package com.ilenlab.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ilenlab.spring.bean.GreetingComponent;
import com.ilenlab.spring.bean.GreetingService;
import com.ilenlab.spring.config.AppConfiguration;

public class MainProgram {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		Language language = (Language) context.getBean("language");
		System.out.println("Bean language: " + language);
		System.out.println("Call languae goodbye: " + language.getGoodBye());
		
		GreetingService service = (GreetingService) context.getBean("greetingService");
		service.sayGreeting();
		
		GreetingComponent component = (GreetingComponent) context.getBean("greetingComponent");
		component.showAppInfo();
		
		((AnnotationConfigApplicationContext)context).close();
	}
}
