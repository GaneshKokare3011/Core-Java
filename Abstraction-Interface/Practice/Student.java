package com.abstractClass;

public class Student extends Person implements Attendable {

	public void markAttendance() {
		System.out.println("Present");
	}

	public void getDetails() {
		System.out.println("Student details");
	}

	
}
