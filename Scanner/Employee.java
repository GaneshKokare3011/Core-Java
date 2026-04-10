package com.scanner;
import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int empId;
		String empName;
		double salary;
		
		System.out.print("Enter id: ");
		empId = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name: ");
		empName = sc.nextLine();
		System.out.print("Enter salary: ");
		salary = sc.nextDouble();
		
		System.out.println("Employee Details");
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + salary);
		
		sc.close();
	}
}
