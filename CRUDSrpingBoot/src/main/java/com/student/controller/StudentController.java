package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;
	
	@PostMapping("/insert{id}")
	public String insert(@RequestBody Student student)
	{
		return ss.insert(student);
		
	}
	
	//fetch single data
	@GetMapping("/fetch")
	public Student fetch()
	{
		Student record = ss.fetch();
		return record;
	}
	
	//fetch single data in conditions
	@GetMapping("/fetch/{id}")  
	public Student fetchid(@PathVariable int id)
	{
		Student record = ss.fetchid(id);
		return record;
	}
	
	// fetch all data
	
	@GetMapping("/fetchall")
	public List<Student> fetchall()
	{
		List<Student> s1 = ss.fetchall();
		return s1;
	}
}
