package com.switchcase;

public class NumberToDapartment {
	public static void main(String[] args) {
		int choice = 1;

		switch (choice) {
		case 1:
			System.out.println("Computer Science");
			break;
		case 2:
			System.out.println("Mechanical");
			break;
		case 3:
			System.out.println("Civil");
			break;
		case 4:
			System.out.println("Electrical");
			break;
		default:
			System.out.println("Invalid input.");
		}
	}
}
