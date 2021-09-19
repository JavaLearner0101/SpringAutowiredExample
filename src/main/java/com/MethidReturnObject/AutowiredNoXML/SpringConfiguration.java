package com.MethidReturnObject.AutowiredNoXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

	@Bean
	public Student student() {
		return new Student();
	}
	
	@Bean
	public HashSetStudent hashSetStudent() {
		return new HashSetStudent();
	}
	
	
	
}
