package com.staticKeyword;

public class Student {
	
	static String collegeName = "RJSPM";
	int id;
	String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println("Student Information");
		System.out.println("College name: " + collegeName);
		System.out.println("Student Id: " + id);
		System.out.println("Student Name: " + name);
	}
}
