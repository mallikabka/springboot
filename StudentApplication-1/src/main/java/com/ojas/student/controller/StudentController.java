package com.ojas.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.student.entity.Student;
import com.ojas.student.service.StudentServiceImpl;

@RestController
public class StudentController {
	@Autowired
	private StudentServiceImpl impl;

	@PostMapping("/student/add")
	public Student createStudent(@RequestBody Student stu) {
		return impl.createStudent(stu);
	}

	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return impl.getAllStudents();
	}

	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable int id) {
		return impl.getStudentById(id);
	}

	@DeleteMapping("/student/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		String msg = impl.deleteStudentById(id);
		return msg;
	}

	@PutMapping("/student/update/{id}")
	public Student updateStudent(@RequestBody Student st,@PathVariable int id) {
		impl.updateStudent(st, id);
		return st;

	}
}
