package com.example.Student.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Student.model.Student;
import com.example.Student.repo.StudentRepository;
import com.example.Student.service.StudentService;


@Controller
public class StudentController {
	@Autowired
	StudentRepository repo;

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/")
	public String getPage() {
		return "create";
	}
	@PostMapping("/Save")
	public ResponseEntity<?> createStudentForm(@RequestBody Student student  ) {
		
		
		//studentService.saveStudent(student);
//		model.addAttribute("student", s);
		return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.CREATED);
		

	}
	
	
	@GetMapping("/{Rollnumber}")
	public ResponseEntity<?> getProductById(@PathVariable Integer Rollnumber){
		
		return new ResponseEntity<>(studentService.getStudentByRollNo(Objects.toString(Rollnumber) ), HttpStatus.OK);
	}

}	
