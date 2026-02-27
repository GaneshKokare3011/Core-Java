package com.operator;

public class LogicalOperator {
	public static void main(String[] args) {

		System.out.println("Truth Table For AND");
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false

		System.out.println("----------");

		System.out.println("Truth Table For OR");
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false

		System.out.println("----------");

		System.out.println("Excercise");
		System.out.println(20 < 3 && (1 >= 0 || 2 == 5) && 22 != 90); // false
		System.out.println((0 < 3) && (1 >= 0 || 2 <= 5) && 22 >= 90); // false
		System.out.println((10 == 9) || (1 >= 0 && 100 > 5) && 2 > 0); // true
		System.out.println((30 >= 29) && (20 > 19) || (1 >= 0 || 2 <= 5) && 22 >= 90); // false

		System.out.println("----------");

		System.out.println("Homework");
		boolean check = true;

		System.out.println(10 > 45 && 20 < 9 || check && true); // true
		System.out.println((true) || 0 < 9 || check || 0 > 0); // true
		System.out.println(1 > 5 || 2 < 9 || false && 0 == 0); // true
		System.out.println(check && (20 < 9) || 45 != 0 && true); // true
	}
}
