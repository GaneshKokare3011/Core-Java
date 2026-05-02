package com.listPractice;

import java.util.ArrayList;

public class CompareArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
		if (list.equals(list2)) {
			System.out.println("Both list are same.");
		} else {
			System.out.println("Both list are different.");
		}
	}
}
