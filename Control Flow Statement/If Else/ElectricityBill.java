package com.controlFlow;

public class ElectricityBill {
	public static void main(String[] args) {
		int units = 123;
		
		if (units >= 0 && units <= 100) {
			System.out.println("Rs.5 per unit, Your Electricity Bill: " + (units * 5));
		} else if (units >= 101 && units <= 200) {
			System.out.println("Rs.7 per unit, Your Electricity Bill: " + (units * 7));
		} else if (units > 200) {
			System.out.println("Rs.10 per unit, Your Electricity Bill: " + (units * 10));
		}
	}
}
