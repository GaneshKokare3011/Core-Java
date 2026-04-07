package com.abstraction;

public class SimpleCalculatorMainMethod {
	public static void main(String[] args) {
		Calculator c = new SimpleCalculator();

		System.out.println("Addition: " + c.add(10, 20));
		System.out.println("Subtraction: " + c.subtract(10, 20));
		System.out.println("Multiplication: " + c.multiply(10, 20));
		System.out.println("Division: " + c.divide(20, 10));
	}
}
