package com.exception;

public class CheckAge {
	
	public void checkAge(int age) {
		if (age < 0 || age > 120) {
			throw new InvalidAgeException("Invalid age.");
		} else {
			System.out.println("Valid age.");
		}
	}
}
