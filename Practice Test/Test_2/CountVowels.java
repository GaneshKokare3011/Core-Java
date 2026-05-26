package com.practice1;

public class CountVowels {
	public static void main(String[] args) {
		String input = "Programming";
		int vowels = 0;
		
		for (int i = 0; i < input.length(); i ++) {
			char ch = input.charAt(i);
			ch = Character.toLowerCase(ch);
			
			if (Character.isLetter(ch)) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels ++;
				}
			}
		}
		System.out.println("Vowels count: " + vowels);
	}
}
