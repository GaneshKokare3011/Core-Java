package com.abstraction;

public class VehicleMainMethod {
	public static void main(String[] args) {
		
		Vehicle c = new Car();
		Vehicle b = new Bike();
		
		System.out.println("Car");
		c.start();
		c.stop();
		
		System.out.println("----------");
		
		System.out.println("Bike");
		b.start();
		b.stop();
	}
}
