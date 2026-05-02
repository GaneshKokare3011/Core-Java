package com.listPractice;

import java.util.*;

public class TransferData {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Vector list2 = new Vector();
		LinkedList list3 = new LinkedList();
		
		list.add(1);
		list.add("Ganesh");
		list.add(21);
		list.add(50000);
		list.add(81f);
		
		list2.addAll(list);
		list3.addAll(list2);
		
		System.out.println("ArrayList: " + list);
		System.out.println("Vector: " + list2);
		System.out.println("LinkedList: " + list3);
	}
}
