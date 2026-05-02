package com.listPractice;

import java.util.*;

public class CopyArrayListToVector {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Vector list2 = new Vector();
		
		list.add(1);
		list.add("Ganesh");
		list.add(21);
		list.add(50000);
		list.add(81f);
		
		System.out.println("ArrayList: " + list);
		list2.addAll(list);
		System.out.println("Vector: " + list2);
	}
}
