package com.breakContinue;

public class StopWhenFirstOddNumber {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i ++) {
			if (i % 2 != 0) {
				System.out.println("First Odd number: " + i);
				break;
			}
			System.out.println(i);
		}
	}
}
