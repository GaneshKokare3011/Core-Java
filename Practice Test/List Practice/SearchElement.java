package com.listPractice;

import java.util.LinkedList;

public class SearchElement {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add(1);
		list.add(2);
		list.add(232);
		list.add(32432423l);
		list.add(45.2);
		
		if (list.contains(232)) {
			System.out.println("Element found at index: " + list.indexOf(232));
		} else {
			System.out.println("Element not found.");
		}
	}
}
