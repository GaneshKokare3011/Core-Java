package com.practice;

public class Palindrome {
	public static void main(String[] args) {
		int num = 121, reverse = 0, original;
		
		original = num;
		while (num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		
		if (original == reverse) {
			System.out.println("It is a Palindrome number." + reverse);
		} else {
			System.out.println("It is not a Palindrome." + reverse);
		}
	}
}
