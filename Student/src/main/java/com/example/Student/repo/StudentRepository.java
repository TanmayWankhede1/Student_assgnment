package com.example.Student.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Student.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	public List<Student> findByRollNumber(String RollNo);

}
