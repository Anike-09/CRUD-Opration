package com.student.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;

@Repository
public class StudentDao {

	
	@Autowired
	SessionFactory sf;
	
	public String insert(Student student)
	{
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(student);
		System.out.println(student);
		tr.commit();
		 return " Data inserted...!! ";
	}
	
	//fetch single data
	public Student fetch()
	{
		Session session=sf.openSession();
		Student record = session.get(Student.class,2);
		session.close();
		return record;	
	}
	//fetch single data with condition from Frontend
	public Student fetchid(int id)
	{
		Session session=sf.openSession();
		Student record = session.get(Student.class,id);
		session.close();
		return record;	
	}
    //fetch multiple data
	public List<Student> fetchall()
	{
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Student.class);
		List<Student> list = criteria.list();
		System.out.println(list);
		session.close();
		return list;	
	}
}
