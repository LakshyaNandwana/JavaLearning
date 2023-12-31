package com.UdemyLearning.appCore.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.UdemyLearning.appCore.rest.Coach;
import com.UdemyLearning.appCore.rest.SwimCoach;

@Configuration
public class SportConfig {
	
	@Bean("aquatic")//custom bean id can be used in @Qualifier("beanID")
	public Coach swimCoach() {
		return new SwimCoach();
	}

}
