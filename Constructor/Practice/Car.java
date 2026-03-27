package com.practice2;

public class Car {
	
	String brand;
	String modelName;
	int year;
	double price;
	
	public Car(String brand, String modelName, int year, double price) {
		this.brand = brand;
		this.modelName = modelName;
		this.year = year;
		this.price = price;
//		displayInfo(); Can call method inside constructor
	}
	
	public void displayInfo() {
		System.out.println("Car Brand: " + brand);
		System.out.println("Car model: " + modelName);
		System.out.println("Year: " + year);
		System.out.println("Price: Rs." + price);
		
		System.out.println("-----------");
	}
}
