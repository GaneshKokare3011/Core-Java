package com.practice2;

public class Employee {
	int empId;
	String empName;
	String city;
	double salary;
	
	public Employee(int empId, String empName, String city, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.city = city;
		this.salary = salary;
	}
	
	public void displayInfo() {
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("City: " + city);
		System.out.println("Salary: Rs." + salary);
	}
}
