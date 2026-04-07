package com.abstraction;

public class EmailNotification implements Notification{

	public void sendMessage(String msg) {
		System.out.println("Email notification: " + msg);
	}
}
