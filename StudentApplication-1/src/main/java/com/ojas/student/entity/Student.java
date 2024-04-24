package com.ojas.student.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
	@Table(name = "STUDENT")
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public class Student {
		public Student(String name, String branch) {
		super();
		this.name = name;
		this.branch = branch;
	}
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		@Column
		private String name;
		@Column
		private String branch;
	}


