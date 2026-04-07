package com.abstraction;

public class PaymentMainMethod {
	public static void main(String[] args) {
		
		Payment upi = new UPI();
		Payment cd = new CreditCard();
		Payment dc = new Debitcard();
		
		upi.pay(100);
		cd.pay(200);
		dc.pay(300);
	}
}
