package com.nonParameterWithReturnType;

public class MyInfo {

	String firstName;
	String lastName;
	int age;
	float height;
	String birthDate;
	long mobileNo;
	long adharNo;
	String city;
	float tenthMarks;
	float twelthMarks;
	float currentSGPA;

	public String displayMyInfo() {
		return "First name: " + firstName + "\n" + "Last name: " + lastName + "\n" + "Age: " + age + "\n" + 
	"Height: " + height + "\n" + "Birthday: " + birthDate + "\n" + "Mobile No: " + mobileNo + "\n" + "Adhar No: " + adharNo + "\n" +
	"City: " + city + "\n" + "10th Percentage: " + tenthMarks + "\n" + "12th Percentage: " + twelthMarks + "\n" + 
	"Current SGPA: " + currentSGPA;
	}
}
