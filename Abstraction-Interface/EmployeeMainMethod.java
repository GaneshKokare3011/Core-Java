package com.abstraction;

public class EmployeeMainMethod {
	public static void main(String[] args) {
		Employee f = new FullTimeEmployee(50000);
		Employee p = new PartTimeEmployee(120, 200);
		
		System.out.println("Full Time Employee Salary: Rs." + f.calculateSalary());
		System.out.println("Part Time Employee Salary: Rs." + p.calculateSalary());
	}
}
