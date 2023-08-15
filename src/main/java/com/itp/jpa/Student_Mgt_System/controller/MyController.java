package com.itp.jpa.Student_Mgt_System.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itp.jpa.Student_Mgt_System.entity.Student;
import com.itp.jpa.Student_Mgt_System.service.IStudentService;

@RestController
public class MyController {
	@Autowired
	IStudentService iStudentService;
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "welcome to Student Database Management System";
	}
	@GetMapping("/students")
	public List<Student> getAllStudents()
	{
		return iStudentService.getAllStudents();
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student)
	{
		return iStudentService.createStudent(student);
	}
	
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student)
	{
		return iStudentService.updateStudent(student);
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable Long id)
	{
		return iStudentService.findById(id);
	}
	
}
