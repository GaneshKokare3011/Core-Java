package com.operation;

public class Bank {
	public static void main(String[] args) {
		double totalBalance = 10000;
		double deposit = 3000;
		double widthraw = 1500;
		
		System.out.println("Total Balance: Rs." + totalBalance);
		totalBalance = totalBalance + deposit;
		System.out.println("Deposit of Rs." + deposit + " \nTotal Balance : Rs." + totalBalance);
		totalBalance = totalBalance - widthraw;
		System.out.println("Withraw of Rs." + widthraw + " \nTotal Balance: Rs." +  totalBalance);
	}
}
