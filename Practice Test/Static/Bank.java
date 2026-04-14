package com.staticKeyword;

public class Bank {
	
	static float rateOfInterest = 7.5f;
	double balance;
	
	public Bank(double balance) {
		this.balance = balance;
	}
	
	public static void changeROI(float roi) {
		rateOfInterest = roi;
		System.out.println("ROI: " + rateOfInterest);
	}
	
	public void displayBalance() {
		System.out.println("Balance: " + balance + " ROI: " + rateOfInterest);
	}
}
