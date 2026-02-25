package com.defaultSize;

public class Student {

	static String studentName;
	static int studentRollNo;
	static String studentCourse;
	static String currentYear = "3rd year";
	static byte totalSubject = 7;
	static float studentMarks;
	static boolean passFail;

	public static void main(String[] args) {
		System.out.println("Student Information");
		System.out.println("Student Full Name: " + studentName);
		System.out.println("Student Roll No: " + studentRollNo);
		System.out.println("Student Course: " + studentCourse);
		System.out.println("Student current year: " + currentYear);
		System.out.println("Total subject in " + currentYear + ": " + totalSubject);
		System.out.println("Student Marks/Percentage: " + studentMarks);
		System.out.println("Student Pass or fail: " + passFail);
	}
}
