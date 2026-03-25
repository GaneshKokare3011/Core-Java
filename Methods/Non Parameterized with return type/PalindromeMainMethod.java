package com.nonParameterWithReturnType;

public class PalindromeMainMethod {
	public static void main(String[] args) {
		
		Palindrome p = new Palindrome();
		
		String result = p.checkPalindrome();
		
		System.out.println(result);
	}
}
