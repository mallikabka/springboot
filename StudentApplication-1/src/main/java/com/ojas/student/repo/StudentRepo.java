package com.ojas.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.student.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
