package com.controlFlow;

public class CheckVowelOrConsonant {
	public static void main(String[] args) {
		char ch = '@';

		if (ch >= '0' && ch <= '9') {
			System.out.println(ch + " is a digit.");
		} else if (ch == '@' || ch == '#' || ch == '$' || ch == '%') {
			System.out.println(ch + " is a special symbol.");
		} else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("The character is an Vowel.");
		} else {
			System.out.println("The character is a Consonant.");
		}
	}
}
