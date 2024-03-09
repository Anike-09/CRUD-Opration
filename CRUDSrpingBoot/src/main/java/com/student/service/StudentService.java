package com.student.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.entity.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao sd;
	
	public String insert(Student student)
	{
		System.out.println(student);
		return sd.insert(student);
		
	}
	public Student fetch()
	{
		Student record = sd.fetch();
		return record;
	}
	public Student fetchid(int id)
	{
		Student record = sd.fetchid(id);
		return record;
	}

	
	
	
	public List<Student> fetchall()
	{
		 List<Student> allrecord = sd.fetchall();
		  return allrecord;
	}

}
