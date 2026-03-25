package com.practice;

public class Employee {
	
	double salary = 100000;
	public Employee(int empId, String empName, double empSalary) {
		System.out.println("Employee Information");
		System.out.println("Employee Id:  " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + empSalary);
	
		System.out.println("The Actual Salary " + bonus());		
}
	
	public double bonus() {
		double bonus = 20000;
		return salary + bonus;
	}
}
