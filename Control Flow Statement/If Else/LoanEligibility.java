package com.controlFlow;

public class LoanEligibility {
	public static void main(String[] args) {
		int age = 21;
		double salary = 40000;
		
		if (age >= 18) {
			System.out.println("You are eligible to apply for a loan");
			
			if (salary >= 40000) {
				System.out.println("Loan Approved.");
			} else {
				System.out.println("Loan Not Approved");
			}
		} else {
			System.out.println("You are not eligible to apply for a loan");
		}
	}
}
