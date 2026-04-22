package com.exception;

public class CheckUserPass {
	
	String correctUsername = "user";
	String correctPassword = "user123";
	
	public void checkUser(String username, String password) {
		if (username == correctUsername && password == correctPassword) {
			System.out.println("Login Successful.");
		} else {
			throw new InvalidUserNamePasswordException("Invalid username or password.");
		}
	}
}
