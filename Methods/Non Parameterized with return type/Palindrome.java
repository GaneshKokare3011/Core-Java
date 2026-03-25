package com.nonParameterWithReturnType;

public class Palindrome {
	
	public String checkPalindrome() {
		int num = 121, reverse = 0, original;

		original = num;
		while (num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}

		if (original == reverse) {
			return reverse + " is a Palindrome number.";
		} else {
			return reverse + " is not a Palindrome.";
		}
	}
}
