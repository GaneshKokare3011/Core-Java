package com.encapsulation;

public class PersonMainMethod {
	public static void main(String[] args) {

		Person p = new Person();

		p.setName("Ganesh");
		p.setAge(21);

		System.out.println("Name: " + p.getName());
		System.out.println("Age: " + p.getAge());
	}
}
