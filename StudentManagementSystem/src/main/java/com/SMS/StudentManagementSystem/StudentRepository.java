package com.SMS.StudentManagementSystem;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	 List<Student> findByCourse(String course);
	 List<Student> findByNameContaining(String name);
}