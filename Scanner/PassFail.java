package com.scanner;
import java.util.Scanner;

public class PassFail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float marks;
		
		System.out.print("Enter marks: ");
		marks = sc.nextFloat();
		
		if (marks >= 35) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		sc.close();
	}
}
