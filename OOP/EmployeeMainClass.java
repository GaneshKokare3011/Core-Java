package com.class_and_object;

public class EmployeeMainClass {
	public static void main(String[] args) {
		
		Employee obj1 = new Employee();
		
		obj1.empId = 01;
		obj1.empName = "Ganesh";
		obj1.salary = 1000000;
		
		System.out.println("Employee Id: " + obj1.empId);
		System.out.println("Employee Name: " + obj1.empName);
		System.out.println("Salary: " + obj1.salary);
	}
}
