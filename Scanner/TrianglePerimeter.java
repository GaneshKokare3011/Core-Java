package com.scanner;
import java.util.Scanner;

public class TrianglePerimeter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float sideA, sideB, sideC;
		float perimeter;
		
		System.out.print("Enter side A: ");
		sideA = sc.nextFloat();
		
		System.out.print("Enter side B: ");
		sideB = sc.nextFloat();
		
		System.out.print("Enter side C: ");
		sideC = sc.nextFloat();
		
		perimeter = sideA + sideB + sideC;
		
		System.out.println("The perimeter of triangle is: " + perimeter);
		
		sc.close();
	}
}
