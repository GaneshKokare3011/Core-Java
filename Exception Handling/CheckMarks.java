package com.exception;

public class CheckMarks {
	
	public void checkMarks(float marks) {
		if (marks < 0 || marks > 100) {
			throw new InvalidMarksException("Marks are out of range.");
		} else {
			System.out.println("Marks are within range.");
		}
	}
}
