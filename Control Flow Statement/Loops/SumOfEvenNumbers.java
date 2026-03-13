package com.loops;

public class SumOfEvenNumbers {
	public static void main(String[] args) {

		// for loop
		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println("The sum of even numbers from 1 to 100: " + sum);

		// while loop
//		int i = 1;
//		while (i <= 100) {
//			if (i % 2 == 0) {
//				sum += i;
//			}
//			i++;
//		}
//		System.out.println("The sum of even numbers from 1 to 100: " + sum);

		// do while loop
		int i = 1;
		do {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		} while (i <= 100);
		System.out.println("The sum of even numbers from 1 to 100: " + sum);
	}
}
