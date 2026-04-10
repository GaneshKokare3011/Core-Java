package com.scanner;
import java.util.Scanner;

public class RectangleArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float length, breadth;
		
		System.out.print("Enter length: ");
		length = sc.nextFloat();
		
		System.out.print("Enter breadth: ");
		breadth = sc.nextFloat();
		
		System.out.println("Area of rectangle is: " + (length * breadth));
		
		sc.close();
	}
}
