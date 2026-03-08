package com.controlFlow;

public class UserAuthentication {
	public static void main(String[] args) {
		String username = "Ganesh";
		String password = "Ganesh";
		
		if (username == password) {
			System.out.println("Login Successful.");
		} else {
			System.out.println("Failed to Login.");
		}
	}
}
