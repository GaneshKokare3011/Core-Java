package com.abstractClass;

public class Teacher extends Person implements Attendable {

	public void markAttendance() {
		System.out.println("Present");
	}

	public void getDetails() {
		System.out.println("Teacher Details");
	}

	
}
