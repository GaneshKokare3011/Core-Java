package com.controlFlow;

public class CheckTemperature {
	public static void main(String[] args) {
		float temperature = 19f;
		
		if (temperature > 35) {
			System.out.println("Weather is hot.");
		} else if (temperature >= 20 && temperature <= 35) {
			System.out.println("Weather is warm.");
		} else if (temperature < 20) {
			System.out.println("Weather is cold.");
		}
	}
}
