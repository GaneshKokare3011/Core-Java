package com.practice2;

public class CarMainMethod {
	public static void main(String[] args) {
		Car c = new Car("Audi", "R8", 2018, 10000000);
		Car c1 = new Car("BMW", "M5", 2022, 8000000);
		Car c2 = new Car("Mercedes", "S-class", 2025, 20000000);
		c.displayInfo();
		c1.displayInfo();
		c2.displayInfo();	
	}
}
