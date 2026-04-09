package com.abstractClass;

public abstract class BankAccount {
	double balance = 10000;
	
	public abstract double calculateInterest();
	
	public void displayBalance() {
		System.out.println("Balance: " + balance);
	}
}
