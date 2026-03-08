package com.controlFlow;

public class DivisibleBy3And5 {
	public static void main(String[] args) {
		int num = 15;
		
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println(num + " is divisible by 3 and 5.");
		} else {
			System.out.println(num + " is not divisible by 3 and 5.");
		}
	}
}
