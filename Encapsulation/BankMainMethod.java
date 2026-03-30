package com.encapsulation;

public class BankMainMethod {
	public static void main(String[] args) {

		Bank b = new Bank();

		b.setBalance(10000);
		b.setDeposit(5000);
		b.setWithdraw(4000);

		System.out.println("The current balance is: " + b.getBalance());
		System.out.println("The current balance after deposit is: " + b.getDeposit());
		System.out.println("The current balance after withdraw is: " + b.getWithdraw());
	}
}
