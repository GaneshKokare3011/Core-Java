package com.abstractClass;

public class Electronics extends Product implements Discount {
	
	double price;
	
	public Electronics(double price) {
		this.price = price;
	}
	
	public void getPrice() {
		System.out.println("Product price: " + price);
	}
	
	public void apllyDiscount() {
		System.out.println("Discount price: " + (price * 0.9));
	}
}
