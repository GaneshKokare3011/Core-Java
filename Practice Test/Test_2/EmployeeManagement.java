package com.practice1;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManagement {
	public static void main(String[] args) {
		HashMap<Integer, String> employees = new HashMap<>();
		
		employees.put(101,  "Rahul");
		employees.put(102, "Amit");
		employees.put(103, "Sneha");
		
		System.out.println("All Employees: ");
		for (Map.Entry<Integer, String> e : employees.entrySet()) {
			System.out.println(e.getKey() + " -> " + e.getValue());
		}
		
		int searchId = 102;
		if (employees.containsKey(searchId)) {
			System.out.println("\nEmployee found: " + employees.get(searchId));	
		} else {
			System.out.println("\nEmployees not found.");
		}
		
		int removeId = 101;
		employees.remove(removeId);
		
		System.out.println("\nAfter remove: ");
		for (Map.Entry<Integer, String> e : employees.entrySet()) {
			System.out.println(e.getKey() + " -> " + e.getValue());
		}
	}
}
