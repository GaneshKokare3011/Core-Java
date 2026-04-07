package com.abstraction;

public class PartTimeEmployee implements Employee {
	
	int noOfHours;
	double ratePerHour;
	
	public PartTimeEmployee(int noOfHours, double ratePerHour) {
		this.noOfHours = noOfHours;
		this.ratePerHour = ratePerHour;
	}
	
	public double calculateSalary() {
		return noOfHours * ratePerHour;
	}
	
}
