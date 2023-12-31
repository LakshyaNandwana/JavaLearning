package com.UdemyLearning.appCore.rest;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
//@Primary
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //Defining Prototype Scope By default Java uses singleton Scope
public class CricketCoach implements Coach{
	
	public CricketCoach() {
		System.out.println("In constructor: " + getClass().getSimpleName());
	}
	
	
	//Defining init method for bean lifecycle
//	@PostConstruct
//	public void doMyStartupStuff() {
//		System.out.println("In doMyStartupStuff():" + getClass().getSimpleName());
//	}
//	
//	//Defining destroy method for bean
//	@PreDestroy
//	public void doMyCleanupStuff() {
//		System.out.println("In doMyCleanupStuff():" + getClass().getSimpleName());
//	}

	
	@Override
	public String getDailyWorkout() {
		return "Practice cricket ";
	}
}
