package com.ilenlab.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ilenlab.spring.Language;
import com.ilenlab.spring.lang.impl.English;

@Configuration
@ComponentScan({"com.ilenlab.spring.bean"})
public class AppConfiguration {
	@Bean(name = "language")
	public Language getLanguage() {
		return new English();
	}
}
