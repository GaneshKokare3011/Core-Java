package com.listPractice;

import java.util.ArrayList;
import java.util.Collections;

public class SortAscending {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(6);
		list.add(5);
		
		System.out.println("Original list: " + list);
		Collections.sort(list);
		System.out.println("Sorted list: " + list);
	}
}
