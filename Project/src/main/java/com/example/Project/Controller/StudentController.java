package com.example.Project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project.Entity.Student;
import com.example.Project.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;

	// Get All student
	@GetMapping("gellall")
	public List<Student> getAllStudent() {
		return service.getAllStudent();

	}

	// Get student by PRN
	@GetMapping("get/{PRN}")
	public Student getStudentByPRN(@PathVariable int PRN) {
		return service.getStudentByPRN(PRN);
	}

	// Insert student
	@PostMapping("insert")
	public boolean insertStudent(@RequestBody Student student) {
		return service.insertStudent(student);
	}

	// Update student
	@PutMapping("update")
	public Student updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}

	// Update student by PRN
	@PutMapping("updateByPrn/{prn}")
	public Student updateStudentByPRN(@RequestBody Student student, @PathVariable int prn) {
		return service.updateStudentByPRN(student, prn);
	}

	// Delete student by PRN
	@DeleteMapping("delete/{PRN_No}")
	public boolean deleteStudentByPRN(@PathVariable int PRN_No) {
		return service.deleteStudentByPRN(PRN_No);
	}
}
