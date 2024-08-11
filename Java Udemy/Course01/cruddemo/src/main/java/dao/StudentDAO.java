package dao;

import java.util.List;

import entity.Student;

public interface StudentDAO {
	
	void save(Student theStudent);
	
	
	Student findById(Integer id);
	
	List<Student> findAll();
	
	List<Student> findByLastName(String theLastName);
	
	void update(Student theStudent);

}
