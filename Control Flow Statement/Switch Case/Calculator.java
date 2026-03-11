package com.switchcase;

public class Calculator {
	public static void main(String[] args) {
		int choice = 3;
		int num1 = 10, num2 = 20;

		switch (choice) {
		case 1:
			System.out.println("Addition");
			System.out.println("Addition of " + num1 + " and " + num2 + " is = " + (num1 + num2));
			break;
		case 2:
			System.out.println("Subtraction");
			System.out.println("Subtraction of " + num1 + " and " + num2 + " is = " + (num1 - num2));
			break;
		case 3:
			System.out.println("Multiplication");
			System.out.println("Multiplication of " + num1 + " and " + num2 + " is = " + (num1 * num2));
			break;
		case 4:
			System.out.println("Division");
			System.out.println("Division of " + num1 + " and " + num2 + " is = " + (num1 / num2));
			break;
		default:
			System.out.println("Invalid input.");
		}
	}
}
