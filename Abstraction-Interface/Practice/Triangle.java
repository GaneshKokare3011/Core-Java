package com.abstractClass;

public class Triangle extends Shape {
	
	int height, breadth;
	
	public Triangle(int height, int breadth) {
		this.height = height;
		this.breadth = breadth;
	}
	
	public void area() {
		System.out.println("The area of triangle is: " + (0.5 * height * breadth));
	}
	
}
