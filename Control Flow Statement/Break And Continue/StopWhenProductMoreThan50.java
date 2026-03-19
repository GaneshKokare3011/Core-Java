package com.breakContinue;

public class StopWhenProductMoreThan50 {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i ++) {
			int product = 9 * i;
			if (product > 50) {
				break;
			}
			System.out.println(product);
		}
	}
}	
