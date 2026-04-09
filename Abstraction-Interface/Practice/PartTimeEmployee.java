package com.abstractClass;

public class PartTimeEmployee extends Employee {
	
	double salary, hourRate;
	int noOfHours;
	
	public PartTimeEmployee(int noOfHours, double hourRate) {
		this.noOfHours = noOfHours;
		this.hourRate = hourRate;
	}
	
	public void calculateSalary() {
		salary = noOfHours * hourRate;
		System.out.println("Salary: " + salary);
	}
}
