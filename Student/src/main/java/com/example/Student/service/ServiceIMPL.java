package com.example.Student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Student.model.Student;
import com.example.Student.repo.StudentRepository;

@Service
public class ServiceIMPL implements StudentService {
	
	
	public StudentRepository sRepo;
	
	public ServiceIMPL(StudentRepository sRepo) {
		super();
		this.sRepo = sRepo;
	}

	@Override
	public Student saveStudent(Student student) {
		
		
		return sRepo.save(student);
	}

	@Override
	public List<Student> getStudentByRollNo(String RollNo) {
		// TODO Auto-generated method stub
		return sRepo.findByRollNumber(RollNo);
	}

	



}
