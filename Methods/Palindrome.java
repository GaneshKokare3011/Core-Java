package com.method;

public class Palindrome {

	public void checkPalindrome() {
		int num = 121, reverse = 0, original;

		original = num;
		while (num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}

		if (original == reverse) {
			System.out.println(reverse + " is a Palindrome number.");
		} else {
			System.out.println(reverse + " is not a Palindrome.");
		}
	}
}
