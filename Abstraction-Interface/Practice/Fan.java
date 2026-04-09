package com.abstractClass;

public class Fan implements SmartDevice {

	public void turnOn() {
		System.out.println("Fan is ON.");
	}
	
	public void turnOff() {
		System.out.println("Fan is OFF.");
	}
}
