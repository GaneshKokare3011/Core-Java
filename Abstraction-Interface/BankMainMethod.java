package com.abstraction;

public class BankMainMethod {
	public static void main(String[] args) {
		Bank sbi = new SBI(10000);
		Bank hdfc = new HDFC(5000);

		System.out.println("SBI");
		System.out.println("Current Balance: Rs." + sbi.checkBalance());
		sbi.deposit(2000);
		sbi.withdraw(4000);
		System.out.println("Current Balance: Rs." + sbi.checkBalance());

		System.out.println("----------");

		System.out.println("HDFC");
		System.out.println("Current Balance: Rs." + hdfc.checkBalance());
		hdfc.deposit(5000);
		hdfc.withdraw(3000);
		System.out.println("Current Balance: Rs." + hdfc.checkBalance());
	}
}
