package com.learningJava.springboot.demo.appfirst;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerFisrt {
	
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World";
	} 
	
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach" + coachName + ", Team name:" + teamName;
	}

}
