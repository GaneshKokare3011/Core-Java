package com.abstractClass;

public class Clothing extends Product implements Discount {
	
	double price;
	
	public Clothing(double price) {
		this.price = price;
	}
	
	public void getPrice() {
		System.out.println("Product Price: " + price);
	}
	
	public void apllyDiscount() {
		System.out.println("Discount Price: " + (price * 0.7));
	}
}
