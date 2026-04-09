package com.abstractClass;

public class CurrentAccount extends BankAccount {
	
	public double calculateInterest() {
		return 0.07 * balance;
	}
	
	public void displayBalance() {
		System.out.println("Current Balance: " + balance);
	}
}
