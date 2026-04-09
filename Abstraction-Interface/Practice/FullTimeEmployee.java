package com.abstractClass;

public class FullTimeEmployee extends Employee {
	double salary = 45000;
	public void calculateSalary() {
		System.out.println("Salary: " + salary);
	}
}
