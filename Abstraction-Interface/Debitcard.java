package com.abstraction;

public class Debitcard implements Payment {
	
	public void pay(double amount) {
		System.out.println("Paid using Debit Card: Rs." + amount);
	}
}
