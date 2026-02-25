package com.defaultSize;

public class Employee {
	
	static String empName = "Ganesh Ashok Kokare";
	static int empId = 123;
	static String empDesignation = "Developer";
	static String empDepartment = "IT";
	static int age = 21;
	static String empCTC = "5LPA";
	static String empJoiningDate = "28 Aug 2026";
	static float empExperiance;
	static long adharcardNo;
	static String pancardNo;
	
	public static void main(String[] args) {
		System.out.println("Employee Information");
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Designation: " + empDesignation);
		System.out.println("Employee Department: " + empDepartment);
		System.out.println("Employee Age: " + age);
		System.out.println("Employee CTC: " + empCTC);
		System.out.println("Employee Joining Date: " + empJoiningDate);
		System.out.println("Work Experiance: "  + empExperiance);
		System.out.println("Adhar Card Number: " + adharcardNo);
		System.out.println("Pan Card Number: " + pancardNo);
	}
}
