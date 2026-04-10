package com.scanner;
import java.util.Scanner;

public class CheckVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String c;
		
		System.out.print("Enter a character: ");
		c = sc.next();
		
		if (c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u")) {
			System.out.println(c + " is an vowel.");
		} else {
			System.out.println(c + " is a consonant.");
		}
		
		sc.close();
	}
}
