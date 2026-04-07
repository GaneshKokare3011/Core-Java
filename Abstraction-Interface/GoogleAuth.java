package com.abstraction;

public class GoogleAuth implements Authentication{

	public void login() {
		System.out.println("Login successful.");
	}
	
	public void logout() {
		System.out.println("Logout successful.");
	}
}
