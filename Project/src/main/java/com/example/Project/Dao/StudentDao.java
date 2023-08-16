package com.example.Project.Dao;

import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Project.Entity.Student;

@Repository
public class StudentDao {
	@Autowired
	SessionFactory sf;
	public List<Student> getAllStudent()
	{
		Session session= sf.openSession();
		Criteria criteria=session.createCriteria(Student.class);
		List<Student> student=criteria.list();
		System.out.println(student);
		session.close();
		return student;
	}
	
	public boolean insertStudent( Student student)
	{
		Session session = sf.openSession();
		session.save(student);
		return true;

	}

	public Student updateStudent(Student student) {
		
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.update(student);
		tr.commit();
		session.close();
		return student;
	}

	public Student getStudentByPRN(int pRN) {
		Session session= sf.openSession();
		Student student=session.get(Student.class, pRN);
		
		return student;
	}
	public Student insertStudentt( Student st)
	{
		Session session = sf.openSession();
		Transaction tr=session.beginTransaction();
		session.update(st);
		tr.commit();
		session.close();
		System.out.println(st);
		return st;

	}

	public boolean deleteStudentByPRN(int PRN_No) 
	
	{
		Session session= sf.openSession();
		Transaction tr=session.beginTransaction();
		Student student =session.get(Student.class, PRN_No);
		session.delete(student);
		tr.commit();
		session.close();
		
		
		return true;
		}

}
