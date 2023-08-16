package com.example.Project.Service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Project.Dao.StudentDao;
import com.example.Project.Entity.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao dao;

	public List<Student> getAllStudent() {
		return dao.getAllStudent();
	}

	public boolean insertStudent(Student student) {
		return dao.insertStudent(student);
	}

	public Student updateStudent(Student student) {

		return dao.updateStudent(student);
	}

	public Student getStudentByPRN(int pRN) {

		return dao.getStudentByPRN(pRN);
	}

	@Autowired
	SessionFactory sf;

	public Student updateStudentByPRN(Student student, int prn) {

		Session session = sf.openSession();
		Student st = session.get(Student.class, prn);
		System.out.println(st);

		st.setRoll_No(student.getRoll_No());

		st.setName(student.getName());
		st.setStandard(student.getStandard());
		System.err.println(st);
		return dao.insertStudentt(st);
	}

	public boolean deleteStudentByPRN(int PRN_No) {
		return dao.deleteStudentByPRN(PRN_No);
	}

}
