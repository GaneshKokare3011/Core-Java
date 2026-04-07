package com.abstraction;

public class AuthenticationMainMethod {
	public static void main(String[] args) {
		
		Authentication google = new GoogleAuth();
		Authentication facebook = new FacebookAuth();
		
		System.out.println("Google Authentication");
		google.login();
		google.logout();
		
		System.out.println("----------");
		
		System.out.println("Facebook Authentication");
		facebook.login();
		facebook.logout();
	}
}	
