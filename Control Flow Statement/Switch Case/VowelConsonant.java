package com.switchcase;

public class VowelConsonant {
	public static void main(String[] args) {
		char ch = 'a';

		switch (ch) {
//		case 'a':
//			System.out.println(ch + " is an vowel.");
//			break;
//		case 'e':
//			System.out.println(ch + " is an vowel.");
//			break;
//		case 'i':
//			System.out.println(ch + " is an vowel.");
//			break;
//		case 'o':
//			System.out.println(ch + " is an vowel.");
//			break;
//		case 'u':
//			System.out.println(ch + " is an vowel.");
//			break;
		
		case 'a', 'e', 'i', 'o', 'u':
			System.out.println(ch + " is an vowel.");
			break;
		default:
			System.out.println(ch + " is a consonant.");
		}
	}
}
