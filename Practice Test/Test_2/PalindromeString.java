package com.practice1;

public class PalindromeString {
	public static void main(String[] args) {
		String input = "madam";
		String reverse = "";
		
		for (int i = input.length() - 1; i >= 0; i --) {
			char ch = input.charAt(i);
			
			reverse += ch;
		}
		
		if (input.equals(reverse)) {
			System.out.println("String is palindrome.");
		} else {
			System.out.println("String is not palindrome.");
		}
	}
}
