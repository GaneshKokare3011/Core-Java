package com.switchcase;

public class ArithmeticOperator {
	public static void main(String[] args) {
		char operator = '*';
		int num1 = 10, num2 = 20;

		switch (operator) {
		case '+':
			System.out.println("Addition");
			System.out.println("Addition of " + num1 + " and " + num2 + " is = " + (num1 + num2));
			break;
		case '-':
			System.out.println("Subtraction");
			System.out.println("Subtraction of " + num1 + " and " + num2 + " is = " + (num1 - num2));
			break;
		case '*':
			System.out.println("Multiplication");
			System.out.println("Multiplication of " + num1 + " and " + num2 + " is = " + (num1 * num2));
			break;
		case '/':
			System.out.println("Division");
			System.out.println("Division of " + num1 + " and " + num2 + " is = " + (num1 / num2));
			break;
		}
	}
}
