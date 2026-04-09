package com.abstractClass;

public class MainClass {
	public static void main(String[] args) {
		//Bank
		BankAccount s = new SavingsAccount();
		BankAccount c = new CurrentAccount();
		
		System.out.println("Savings Account");
		System.out.println("Interest on Balance is: Rs." + s.calculateInterest());
		s.displayBalance();
		
		System.out.println("----------");
		
		System.out.println("Current Account");
		System.out.println("Interest on Balance is: Rs." + c.calculateInterest());
		c.displayBalance();
		
		
		//Vehicle
		Vehicle car = new Car();
		Vehicle bike = new Bike();
		
		System.out.println("Car");
		car.start();
		car.stop();
		
		System.out.println("----------");
		
		System.out.println("Bike");
		bike.start();
		bike.stop();
		
		
		//Employee
		Company cmp = new Company();
		System.out.println("Full Time Employee");
		cmp.EmployeeDetails(new FullTimeEmployee());
		
		System.out.println("----------");
		
		System.out.println("Part Time Employee");
		cmp.EmployeeDetails(new PartTimeEmployee(100, 200));
		
		
		//Payment Gateway
		Payment ccp = new CreditCardPayment();
		Payment upi = new UPIPayment();
		Payment netBank = new NetBanking();
		
		System.out.println("Credit Card");
		ccp.pay(10000);
		System.out.println("UPI Payment");
		upi.pay(2000);
		System.out.println("Net Banking");
		netBank.pay(3000);
		
		
		//Area Calculator
		Shape circle = new Circle(5);
		Shape rectangle = new Rectangle(3, 4);
		Shape triangle = new Triangle(7, 4);
		
		circle.area();
		rectangle.area();
		triangle.area();
		
		
		//Smart Device System
		Home sd = new Home();
		sd.control(new Fan());
		sd.control(new Light());
		sd.control(new AC());
		
		
		//Online Shopping
		Electronics e = new Electronics(12000);
		System.out.println("Electronic Product");
		e.getPrice();
		e.apllyDiscount();
		
		System.out.println("----------");
		
		System.out.println("Clothing Product");
		Clothing cl = new Clothing(1000);
		cl.getPrice();
		cl.apllyDiscount();
		
		
		//Notification System
		Notification email = new EmailNotification();
		Notification sms = new SMSNotification() ;
		Notification wapp = new WhatsAppNotification();
		
		email.sendMessage();
		sms.sendMessage();
		wapp.sendMessage();
		
		
		//Food Delivery System
		FoodOrder veg = new VegOrder();
		FoodOrder nonVeg = new NonVegOrder();
		
		veg.orderDetails();
		veg.prepareFood();
		
		System.out.println("----------");
		
		nonVeg.orderDetails();
		nonVeg.prepareFood();
		
		
		//College Management
		Student std = new Student();
		std.getDetails();
		std.markAttendance();
		
		System.out.println("----------");
		
		Teacher t = new Teacher();
		t.getDetails();
		t.markAttendance();
	}
}
