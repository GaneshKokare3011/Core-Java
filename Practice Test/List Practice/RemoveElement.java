package com.listPractice;

import java.util.ArrayList;

public class RemoveElement {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add("Ganesh");
		list.add(21);
		list.add(50000);
		list.add(81f);
		
		System.out.println("Original List: " + list);
		System.out.println("Removed element: " + list.remove(2));
		System.out.println("Updated List: " + list);
	}
}
