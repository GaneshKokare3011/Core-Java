package com.nonParameterWithReturnType;

public class LargestNumber {
	
	public String checkLargest() {
		int num1 = 10, num2 = 20;
		
		if (num1 > num2) {
			return num1 + " is " + "greater than " + num2;
		} else {
			return num2 + " is " + "greater than " + num1;
		}
	}
}
