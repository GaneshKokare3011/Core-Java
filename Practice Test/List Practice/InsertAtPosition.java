package com.listPractice;

import java.util.LinkedList;

public class InsertAtPosition {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add(1);
		list.add("Ganesh");
		list.add(21);
		list.add(81f);
		
		System.out.println("Original list: " + list);
		list.add(3, 50000);
		System.out.println("Updated list: " + list);
	}
}
