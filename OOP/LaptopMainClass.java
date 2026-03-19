package com.class_and_object;

public class LaptopMainClass {
	public static void main(String[] args) {
		
		Laptop obj1 = new Laptop();
		
		obj1.brand = "Lenovo";
		obj1.ram = 8000;
		
		System.out.println("Brand: " + obj1.brand);
		System.out.println("Ram: " + obj1.ram + " MB");
	}
}	
