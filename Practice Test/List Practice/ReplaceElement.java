package com.listPractice;

import java.util.Vector;

public class ReplaceElement {
	public static void main(String[] args) {
		Vector list = new Vector();
		
		list.add(1);
		list.add("Ganesh");
		list.add(21);
		list.add(50000);
		list.add(81f);
		
		System.out.println("Original list: " + list);
		list.set(3, 100000);
		System.out.println("Updated list: " + list);
	}
}
