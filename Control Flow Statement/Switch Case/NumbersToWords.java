package com.switchcase;

public class NumbersToWords {
	public static void main(String[] args) {
		int choice = 1;

		switch (choice) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Invalid input.");
		}
	}
}
