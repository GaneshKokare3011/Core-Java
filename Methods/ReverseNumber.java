package com.method;

public class ReverseNumber {
	
	public void DisplayReverse() {
		int num = 134, reverse = 0;

		while (num != 0) {
			int digit = num % 10; 
			reverse = reverse * 10 + digit; 
			num = num / 10;
		}
		System.out.println(reverse);
	}
}
