package com.abstraction;

public class FullTimeEmployee implements Employee {
	
	double salary;
	public FullTimeEmployee(double salary) {
		this.salary = salary;
	}
	
	public double calculateSalary() {
		return salary;
	}
}
