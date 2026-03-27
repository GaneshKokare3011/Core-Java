package com.practice2;

public class Student {
	int studentId;
	String studentName;
	String studentCourse;
	float percentage;
	
	public Student(int studentId, String studentName, String studentCourse, float percentage) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCourse = studentCourse;
		this.percentage = percentage;
	}
	
	public void displayInfo() {
		System.out.println("Student Id: " + studentId);
		System.out.println("Student Name: " + studentName);
		System.out.println("Course: " + studentCourse);
		System.out.println("Percentage: " + percentage);
	}
}
