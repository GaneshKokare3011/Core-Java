package com.practice2;

public class MyPortfolio {
	String firstName;
	String lastName;
	int age;
	String birthDate;
	String city;
	
	public MyPortfolio(String firstName, String lastName, int age, String birthDate, String city) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.birthDate = birthDate;
		this.city = city;
	}
	
	public void displayInfo() {
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Age: " + age);
		System.out.println("Birth Date:" + birthDate);
		System.out.println("City: " + city);
	}
}
