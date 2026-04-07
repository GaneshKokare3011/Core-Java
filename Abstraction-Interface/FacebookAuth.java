package com.abstraction;

public class FacebookAuth implements Authentication {
	
	public void login() {
		System.out.println("Login successful.");
	}
	
	public void logout() {
		System.out.println("Logount successful.");
	}
}
