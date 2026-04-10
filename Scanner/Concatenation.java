package com.scanner;
import java.util.Scanner;

public class Concatenation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a, b;
		
		System.out.print("Enter first string: ");
		a = sc.nextLine();
		
		System.out.print("Enter second string: ");
		b = sc.nextLine();
		
		System.out.println("Concateneted: " + (a + b));
		
		sc.close();
	}
}
