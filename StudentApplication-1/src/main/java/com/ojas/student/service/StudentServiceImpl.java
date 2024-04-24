package com.ojas.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.student.entity.Student;
import com.ojas.student.exceptions.StudentNotFoundException;
import com.ojas.student.repo.StudentRepo;

@Service
public class StudentServiceImpl {
	@Autowired
	private StudentRepo repo;

	public List<Student> getAllStudents() {
		return repo.findAll();

	}

	public Student getStudentById(int id) {
		return repo.findById(id).get();

	}

	public Student createStudent(Student stu) {

		return repo.save(stu);

	}

	public String deleteStudentById(int id) {
		// Check if student exists and throw exception if not
		Student stu = repo.findById(id)
				.orElseThrow(() -> new StudentNotFoundException("Student with ID " + id + " not found"));

		// If the student is found, delete and return a success message
		repo.deleteById(id);
		return "deleted";
	}

	public Student updateStudent(Student stu, int id) {
		repo.findById(id).orElseThrow(() -> new StudentNotFoundException("Student Not Found with this id"));
		Student st = new Student();
		BeanUtils.copyProperties(stu, st);
		repo.save(st);
		return st;
	}
}
