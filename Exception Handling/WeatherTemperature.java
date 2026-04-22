package com.exception;

public class WeatherTemperature {

	public void checkTemperature(float temperature) {
		if (temperature > 70 || temperature < -50) {
			throw new InvalidWeatherTemperatureException("Weather temperature cannot be this high.");
		} else {
			System.out.println("Valid weather temperature.");
		}
	}
}
