package com.listPractice;

import java.util.LinkedList;

public class FirstAndLastElement {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add(1);
		list.add("Ganesh");
		list.add(21);
		list.add(50000);
		list.add(81f);
		
		System.out.println("First element: " + list.getFirst());
		System.out.println("Last element: " + list.getLast());
	}
}
