package com.abstraction;

public class SBI implements Bank {
	
	double balance;
	
	public SBI(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Balance after deposit of Rs." + amount + " is Rs." + balance);
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Balance after withdraw of Rs." + amount + " is Rs." + balance);
	}
	
	public double checkBalance() {
		return balance;
	}
}
