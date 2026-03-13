package com.loops;

public class PrintOddNumbers {
	public static void main(String[] args) {

		// for loop
//		for (int i = 1; i <= 50; i++) {
//			if (i % 2 != 0) {
//				System.out.println(i);
//			}
//		}

		// while loop
//		int i = 1;
//		while (i <= 50) {
//			if (i % 2 != 0) {
//				System.out.println(i);
//			}
//			i ++;
//		}

		// do while
		int i = 1;
		do {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i ++;
		} while (i <= 50);
	}
}
