package com.controlFlow;

public class CheckGrade {
	public static void main(String[] args) {
		
		int marks = 81;
		
		if (marks >= 90 && marks <= 100) {
			System.out.println("You got O grade.");
		} else if (marks >= 75 && marks <= 89) {
			System.out.println("You got A+ grade.");
		} else if (marks >= 60 && marks <= 74) {
			System.out.println("You got A grade.");
		} else if (marks >= 50 && marks <= 59) {
			System.out.println("Yot got B+ grade.");
		} else if (marks >= 41 && marks <= 49) {
			System.out.println("You got B grade.");
		} else if (marks >= 35 && marks <= 40) {
			System.out.println("You are pass.");
		} else {
			System.out.println("You are fail");
		}
	}
}
