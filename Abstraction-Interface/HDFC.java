package com.abstraction;

public class HDFC implements Bank {

	double balance;

	public HDFC(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Balance after deposit: " + balance);
	}

	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Balance after withdraw: " + balance);
	}

	public double checkBalance() {
		return balance;
	}
}
