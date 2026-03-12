package com.switchcase;

public class AreaCalculator {
	public static void main(String[] args) {
		int choice = 1;
		float PI = 3.14f;

		switch (choice) {
		case 1:
			int r = 2;
			System.out.println("Area of circle");
			System.out.println("The area of circle is : " + (PI * (r * r)));
			break;
		case 2:
			int width = 5, height = 4;
			System.out.println("Area of rectangle");
			System.out.println("Area of rectangle is: " + (width * height));
			break;
		case 3:
			int length = 4;
			System.out.println("Area of square");
			System.out.println("Area of square is: " + (length * length));
			break;
		default:
			System.out.println("Invalid choice.");
		}
	}
}
