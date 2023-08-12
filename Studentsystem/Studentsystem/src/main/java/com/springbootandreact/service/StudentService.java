package com.springbootandreact.service;

import java.util.List;

import com.springbootandreact.repository.Student;

public interface StudentService {

	public Student saveStudent(Student student);
	
	public List<Student> getAllStudents();
	
}
