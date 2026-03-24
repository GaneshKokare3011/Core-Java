package com.method;

public class StarPattern {
	
	public void displayPattern() {
		
		//1st
		for (int i = 1; i <= 5; i ++) {
			for (int j = 1; j <= i; j ++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		//2nd
		for (int i = 1; i <= 5; i ++) {
			for (int j = 1; j <= 6 - i; j ++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
