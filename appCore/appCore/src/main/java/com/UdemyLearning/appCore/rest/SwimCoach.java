package com.UdemyLearning.appCore.rest;

public class SwimCoach implements Coach {

	public SwimCoach() {
		System.out.println("In constructor :" + getClass().getSimpleName());
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim and get warmed up";
	}
	

}
