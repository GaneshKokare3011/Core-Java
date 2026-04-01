package com.inheritance;

public class ElectronicsMainMethod {
	public static void main(String[] args) {
		Electronics e = new Electronics();
		
		e.name = "Lenovo Ideapad";
		e.price = 50000;
		e.warranty = 3;
		
		e.displayProduct();
		e.showWarranty();
	}
}
