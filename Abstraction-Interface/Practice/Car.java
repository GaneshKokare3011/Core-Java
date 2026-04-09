package com.abstractClass;

public class Car implements Vehicle {
	
	public void start() {
		System.out.println("Car start with key.");
	}
	
	public void stop() {
		System.out.println("Car stop with brake.");
	}
}
