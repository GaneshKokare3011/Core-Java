package com.abstraction;

public class NotificationMainMethod {
	public static void main(String[] args) {
		
		Notification email = new EmailNotification();
		Notification sms = new SMSNotification();
		Notification whatsapp = new WhatsAppNotification();
		
		email.sendMessage("You got an email.");
		sms.sendMessage("You got a sms.");
		whatsapp.sendMessage("You got a message.");
	}
}	
