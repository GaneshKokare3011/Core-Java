package com.listPractice;

import java.util.LinkedList;

public class ReverseLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.add(1);
		list.add("Ganesh");
		list.add(21);
		list.add(50000);
		list.add(81f);

		System.out.println("Original list: " + list);
		System.out.println("Reversed list: " + list.reversed());
	}
}
