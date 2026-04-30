package com.list;

import java.util.ArrayList;

public class FirstAndLastElement {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println("List size: " + list.size());
		System.out.println("First element: " + list.getFirst());
		System.out.println("Last element: " + list.getLast());
	}
}
