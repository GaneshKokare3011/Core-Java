package com.loops;

public class PrintSumOfOddNumbers {
	public static void main(String[] args) {

		// for loop
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 != 0) {
//				sum += i;
//			}
//		}
//		System.out.println("The sum of odd numbers from 1 to 100: " + sum);

		// while loop
//		int i = 1, sum = 0;
//		while (i <= 100) {
//			if (i % 2 != 0) {
//				sum += i;
//			}
//			i ++;
//		}
//		System.out.println("The sum of odd numbers from 1 to 100: " + sum);

		// do while
		int i = 1, sum = 0;
		do {
			if (i % 2 != 0) {
				sum += i;
			}
			i++;
		} while (i <= 100);

		System.out.println("The sum of odd numbers from 1 to 100: " + sum);
	}
}
