package com.scanner;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, mul, div;
		
		System.out.print("Enter first number: ");
		num1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		num2 = sc.nextInt();
		
		mul = num1 * num2;
		div = num1 / num2;
		
		System.out.println("Multiplication: " + mul + " Division: " + div);
		
		sc.close();
	}
}
