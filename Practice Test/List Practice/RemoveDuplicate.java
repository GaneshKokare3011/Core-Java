package com.listPractice;

import java.util.ArrayList;

public class RemoveDuplicate {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add(1);
		list.add(2);
		list.add(34233);
		list.add(2);
		list.add(34.2f);
		list.add(34233);

		System.out.println("Original list: " + list);

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
				}
			}
		}
		System.out.println("List after removing duplicate elements: " + list);
	}
}
