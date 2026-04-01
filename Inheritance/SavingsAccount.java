package com.inheritance;

public class SavingsAccount extends BankAccount {
	float interestRate;
	
	public void addInterest() {
		System.out.println("Interest on Rs." + balance + " is: " + interestRate + "%" + "\nInterest on amount is: " + (balance * interestRate / 100));
	}
}
