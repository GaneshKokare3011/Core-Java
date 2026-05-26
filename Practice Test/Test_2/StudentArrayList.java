package com.practice1;

import java.util.ArrayList;

class Student {
	int id;
	String name;
	int marks;
	
	Student (int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}

public class StudentArrayList {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student(1, "Rahul", 80));
		list.add(new Student(2, "Amit", 65));
		list.add(new Student(3, "Sneha", 90));
		
		System.out.println("Students scoring above 75:");
		
		for (Student s : list) {
			if (s.marks > 75) {
				System.out.println(s.id + " " + s.name + " " + s.marks);
			}
		}
	}
}
