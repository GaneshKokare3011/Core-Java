package com.staticKeyword;

import com.staticKeyword.NestedClass.InnerClass;

public class MainMethod {
	public static void main(String[] args) {
		
		//Student
		Student s1 = new Student(1, "Ganesh");
		Student s2 = new Student(2, "Asharaf");
		Student s3 = new Student(3, "Rahul");
		
		s1.display();
		
		System.out.println("----------");
		
		s2.display();
		
		System.out.println("----------");
		
		s3.display();
		
		System.out.println("----------");
		
//		System.out.println(Student.collegeName);
		
		//Bank
		Bank b1 = new Bank(10000);
		b1.displayBalance();
		b1.changeROI(6.5f);
		b1.displayBalance();
		
		System.out.println("----------");
		
		Bank b2 = new Bank(20000);
		b1.displayBalance();
		
		
		//Nested Class
		InnerClass s = new InnerClass();
		s.display();
	}
}
