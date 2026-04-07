package com.abstraction;

public class ShapeMainMethod {
	public static void main(String[] args) {
		Shape c = new Circle(5);
		Shape r = new Rectangle(2, 5);

		System.out.println("Circle");
		System.out.println("Area: " + c.area());
		System.out.println("Perimeter: " + c.perimeter());

		System.out.println("----------");

		System.out.println("Rectangle");
		System.out.println("Area: " + r.area());
		System.out.println("Perimeter: " + r.perimeter());
	}
}
