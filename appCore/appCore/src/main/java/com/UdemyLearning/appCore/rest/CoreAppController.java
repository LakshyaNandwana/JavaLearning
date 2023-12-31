package com.UdemyLearning.appCore.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreAppController {
	
	private Coach myCoach;
//	private Coach anotherCoach; //Prototype Scope implementation
	//CONSTRUCTOR METHOD
	@Autowired
	public CoreAppController
	(@Qualifier("swimCoach") Coach theCoach) {
//			@Qualifier("cricketCoach") Coach theAnotherCoach) {	//Defining multiple qualifiers //Without Qualifier by default takes primary coach defined.
		System.out.println("In constructor: " + getClass().getSimpleName());
		myCoach = theCoach;	
//		anotherCoach = theAnotherCoach;
	}
	
	//SETTER INJECTION METHOD
//	@Autowired
//	public void setCoach(Coach theCoach) {
//		myCoach = theCoach;
//	}
	
	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return myCoach.getDailyWorkout();
	}
	
//	@GetMapping("/check")
//	public String check() {
//		return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
//	}

}
