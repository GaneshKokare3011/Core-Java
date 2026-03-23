package com.controlFlow;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 134, reverse = 0;

		while (num != 0) {
			int digit = num % 10; //get last number
			reverse = reverse * 10 + digit; //add digit to reversed number
			num = num / 10;
		}
		System.out.println(reverse);
	}
}
