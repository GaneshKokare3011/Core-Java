package com.scanner;
import java.util.Scanner;

public class Person {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("Enter name: ");
		name = sc.nextLine();
		
		System.out.print("Enter age: ");
		age = sc.nextInt();
		
		System.out.println("Person Information");
		System.out.println("Name: " + name + " " + " Age: " + age);
		
		sc.close();
	}
}
