package com.nonParameterWithReturnType;

public class MyInfoMainMethod {
	public static void main(String[] args) {
		
		MyInfo m = new MyInfo();
		
		m.firstName = "Ganesh";
		m.lastName = "Kokare";
		m.age = 21;
		m.birthDate = "30/11/2004";
		m.mobileNo = 1234567890l;
		m.adharNo = 908765432123l;
		m.city = "Pune";
		m.height = 171;
		m.tenthMarks = 81f;
		m.twelthMarks = 54f;
		m.currentSGPA = 8.64f;
		
		String result = m.displayMyInfo();
		
		System.out.println(result);
	}
}
