package com.listPractice;

import java.util.Vector;

public class ElementExistOrNot {
	public static void main(String[] args) {
		Vector list = new Vector();
		
		list.add(1);
		list.add("Ganesh");
		list.add(21);
		list.add(50000);
		list.add(81f);
		
		if (list.contains("Ganesh")) {
			System.out.println("Element exist.");
		} else {
			System.out.println("Element does not exist.");
		}
	}
}
