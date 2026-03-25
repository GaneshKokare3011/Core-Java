package com.nonParameterWithReturnType;

public class ReverseNumber {
	
	public String DisplayReverse() {
		int num = 134, reverse = 0;

		while (num != 0) {
			int digit = num % 10; 
			reverse = reverse * 10 + digit; 
			num = num / 10;
		}
		return "The revers number is " + reverse;
	}
}
