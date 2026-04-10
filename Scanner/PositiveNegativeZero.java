package com.scanner;
import java.util.Scanner;

public class PositiveNegativeZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Enter number: ");
		num = sc.nextInt();
		
		if (num == 0) {
			System.out.println("Number is zero.");
		} else if (num > 0) {
			System.out.println("Number is positive.");
		} else {
			System.out.println("Number is negative.");
		}
		
		sc.close();
	}
}
