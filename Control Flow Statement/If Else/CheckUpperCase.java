package com.controlFlow;

public class CheckUpperCase {
	public static void main(String[] args) {
		char ch = 'G';

		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("The character is in uppercase.");
		} else {
			System.out.println("The character is not in uppercase.");
		}
	}
}
