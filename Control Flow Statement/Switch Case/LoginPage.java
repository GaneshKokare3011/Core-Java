package com.switchcase;

public class LoginPage {
	public static void main(String[] args) {
		int choice = 1;
		
		switch (choice) {
		case 1:
			System.out.println("Login Page");
			break;
		case 2:
			System.out.println("Register Page");
			break;
		case 3:
			System.out.println("Profile Page");
			break;
		case 4:
			System.out.println("Logout Page");
			break;
		default:
			System.out.println("Invalid input.");
		}
	}
}	
