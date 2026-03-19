package com.class_and_object;

public class CarMainClass {
	public static void main(String[] args) {
		
		Car obj1 = new Car();
		
		obj1.model = "BMW M5";
		obj1.color = "White";
		obj1.price = 7000000;
		
		System.out.println("Model: " + obj1.model);
		System.out.println("Color: " + obj1.color);
		System.out.println("Price: Rs." + obj1.price);
	}
}
