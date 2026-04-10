package com.scanner;
import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float sub1, sub2, sub3, sub4, sub5, total, percentage;
		
		System.out.print("Enter marks of sub1: ");
		sub1 = sc.nextFloat();
		System.out.print("Enter marks of sub2: ");
		sub2 = sc.nextFloat();
		System.out.print("Enter marks of sub3: ");
		sub3 = sc.nextFloat();
		System.out.print("Enter marks of sub4: ");
		sub4 = sc.nextFloat();
		System.out.print("Enter marks of sub5: ");
		sub5 = sc.nextFloat();
		
		total = sub1 + sub2 + sub3 + sub4 + sub5;
		percentage = total / 500 * 100;
		
		System.out.println("Total marks: " + total + " Percentage: " + percentage);
		
		sc.close();
	}
}
