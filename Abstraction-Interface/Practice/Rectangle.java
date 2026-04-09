package com.abstractClass;

public class Rectangle extends Shape {
	int length, breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void area() {
		System.out.println("The area of triangle is: " + (length * breadth));
	}
}
