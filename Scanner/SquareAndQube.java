package com.scanner;
import java.util.Scanner;

public class SquareAndQube {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Enter number: ");
		num = sc.nextInt();
		
		
		System.out.println("Square: " + (num * num) + " Cube: " + (num * num * num));
		
		sc.close();
	}
}
