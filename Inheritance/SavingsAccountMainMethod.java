package com.inheritance;

public class SavingsAccountMainMethod {
	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount();
		
		s.accountHolder = "Ganesh";
		s.balance = 10000;
		s.interestRate = 5;
		s.deposit(5000);
		s.withdraw(4000);
		
		s.addInterest();
	}
}	
