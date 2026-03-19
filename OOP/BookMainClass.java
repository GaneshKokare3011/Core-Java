package com.class_and_object;

public class BookMainClass {
	public static void main(String[] args) {
		
		Book obj1 = new Book();
		
		obj1.title = "JAVA";
		obj1.author = "James Gosling";
		obj1.price = 500;
		
		System.out.println("Book Title: " + obj1.title);
		System.out.println("Author: " + obj1.author);
		System.out.println("Price: Rs." + obj1.price);
	}
}
