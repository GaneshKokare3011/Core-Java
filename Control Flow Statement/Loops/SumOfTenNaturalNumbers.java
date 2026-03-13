package com.loops;

public class SumOfTenNaturalNumbers {
	public static void main(String[] args) {

		// for loop
		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.println("Sum of first 10 natural numbers: " + sum);

		// while loop
//		int i = 1;
//		while (i <= 10) {
//			sum += i;
//			i++;
//		}
//		System.out.println("Sum of first 10 natural numbers: " + sum);

		// do while loop
		int i = 1;
		do {
			sum += i;
			i++;
		} while (i <= 10);
		System.out.println("Sum of first 10 natural numbers: " + sum);
	}
}
