package com.operation;

public class Calculator {
	public static void main(String[] args) {
		// Addition
		int a = 10;
		int b = 20;
		int addition = a + b;
		System.out.println("The addition of " + a + " + " + b + " is: " + addition);

		// Subtraction
		int subtraction = b - a;
		System.out.println("The subtraction of " + b + " - " + a + " is: " + subtraction);

		// Multiplication
		int multiplication = a * b;
		System.out.println("The multiplication of " + a + " * " + b + " is: " + multiplication);

		// Division (/ gives quotient)
		double division = a / b;
		System.out.println("The division of " + a + " / " + b + " is: " + division);

		// Division (% gives remainder)
		int remainder = a % b;
		System.out.println("The division of " + a + " % " + b + " is: " + remainder);
	}
}
