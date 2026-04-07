package com.abstraction;

public class WhatsAppNotification implements Notification {
	
	public void sendMessage(String msg) {
		System.out.println("WhatsApp Notification: " + msg);
	}
}
