package com.abstraction;

public class SMSNotification implements Notification {
	
	public void sendMessage(String msg) {
		System.out.println("SMS Notification: " + msg);
	}
}
