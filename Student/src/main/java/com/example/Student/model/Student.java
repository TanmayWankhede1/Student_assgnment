package com.example.Student.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(nullable=false)
	private int studentID;
	@Column(nullable=false)
	private String studentName;
	@Column(nullable=false)
	private String studentAddress;
	@Column()
	private String rollNumber;

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Student(String studentName, String studentAddress,String rollNo) {
		super();
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.rollNumber = rollNo;
	}

	
	
	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	

}
