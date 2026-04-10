package com.scanner;
import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float r;
		
		System.out.print("Enter radius: ");
		r = sc.nextFloat();
		
		System.out.println("Area of circle is: " + 3.14 * r  * r);
		
		sc.close();
	}
}
