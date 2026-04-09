package com.abstractClass;

public class SavingsAccount extends BankAccount {
	
	public double calculateInterest() {
		return 0.05 * balance;
	}
	
	public void displayBalance() {
		System.out.println("Current Balance: " + balance);
	}
}
