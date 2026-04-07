package com.abstraction;

public class RemoteControlMainMethod {
	public static void main(String[] args) {
		
		RemoteControl tv = new TV();
		RemoteControl ac = new AC();
		
		System.out.println("TV Remote");
		tv.powerOn();
		tv.powerOff();
		
		System.out.println("----------");
		
		System.out.println("AC Remote");
		ac.powerOn();
		ac.powerOff();
	}
}
