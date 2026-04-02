package com.inheritance2;

public class GoogleMainMethod {
	public static void main(String[] args) {
		Gmail g1 = new Gmail();
		g1.services();
		g1.login();
		g1.mail();
		
		System.out.println("----------");
		
		GMap g2 = new GMap();
		g2.services();
		g2.login();
		g2.map();
		
		System.out.println("----------");
		
		GDrive g3 = new GDrive();
		g3.services();
		g3.login();
		g3.drive();
	}
}
