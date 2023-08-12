package com.springbootandreact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootandreact.repository.Student;
import com.springbootandreact.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("add")
	public String add(@RequestBody Student student)
	{
		studentService.saveStudent(student);
		return "new Student is added";
	}
	
	@GetMapping("getAll")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
}
