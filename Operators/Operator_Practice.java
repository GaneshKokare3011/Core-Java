package com.operator;

public class Operator_Practice {
	public static void main(String[] args) {

		int i = 8;
		i--; // 7
		i++; // 8
		System.out.println(i--); // 8 7
		i++; // 8
		System.out.println(i * 4); // 32 
		++i; // 9
		System.out.println(i -= 5); // Same (print as well as updated) 4 4
		i++; // 5
		int b = i + 8; // 13
		System.out.println(i--); // 5 4
		++i; // 5
		i /= 4; // 1
		System.out.println(i--); // 1 0
		++i; // 1
		System.out.println(i - 4); // -3
		System.out.println("---------");
		System.out.println(i); // 1
	}
}
