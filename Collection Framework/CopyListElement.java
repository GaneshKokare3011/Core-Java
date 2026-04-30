package com.list;

import java.util.ArrayList;

public class CopyListElement {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("List1: " + list);
		
		list2.addAll(list);
		System.out.println("List2: " + list2);
	}
}
