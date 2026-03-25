package com.nonParameterWithReturnType;

public class EvenOdd {
	
	public String checkEvenOdd() {
		int num = 10;
		
		if (num % 2 == 0) {
			return num + " is an even number.";
		} else {
			return num + " is an odd number.";
		}
	}
}
