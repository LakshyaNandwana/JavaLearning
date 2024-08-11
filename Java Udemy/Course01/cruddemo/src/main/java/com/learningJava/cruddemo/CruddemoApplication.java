package com.learningJava.cruddemo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import entity.Student;

import dao.StudentDAO;
import entity.Student;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
		
		
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		
		return runner -> {
//			createStudent(studentDAO);
//			readStudent(studentDAO);
//			queryForStudents(studentDAO);
			queryForStudentsByLastName(studentDAO);
		};
		
	}
	
	
	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findByLastName("Duck");
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> theStudent = studentDAO.findAll();
		
		for(Student tempStudent: theStudent) {
			System.out.println(tempStudent);
		}
		
	}

	private void readStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student");
		Student tempStudent = new Student("Daffy", "Duck", "daffy@duck.com");
		
		studentDAO.save(tempStudent);
		
		
		int theId = tempStudent.getId();
		
		System.out.println("Retriving student with id: "+ theId);
		Student myStudent = studentDAO.findById(theId);
		
		System.out.println("Found the student: "+ myStudent);
		
	}

	private void createStudent(StudentDAO studentDAO) {
		
		System.out.println("Creating new student object");
		Student tempStudent = new Student("ABC", "XYZ", "ABCXYZ@lmn.com");
		
		System.out.println("Saving the student");
		studentDAO.save(tempStudent);
		
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
		
		
		
		
	}

}
