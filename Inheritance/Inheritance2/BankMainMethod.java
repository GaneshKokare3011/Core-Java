package com.inheritance2;

public class BankMainMethod {
	public static void main(String[] args) {
		SavingAccount s = new SavingAccount();
		s.bankInfo();
		s.interest();
		
		System.out.println("----------");
		
		currentAccount c = new currentAccount();
		c.bankInfo();
		c.overdraft();
	}
}
