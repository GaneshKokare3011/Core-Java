package com.scanner;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double principal, rate, time, si;
		
		System.out.print("Enter Principal: ");
		principal = sc.nextDouble();

		System.out.print("Enter Rate of Interest: ");
		rate = sc.nextDouble();

		System.out.print("Enter Time (in years): ");
		time = sc.nextDouble();

		si = (principal * rate * time) / 100;

		System.out.println("Simple Interest: " + si);

		sc.close();
	}
}
