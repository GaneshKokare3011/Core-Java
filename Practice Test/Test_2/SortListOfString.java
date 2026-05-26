package com.practice1;

import java.util.ArrayList;
import java.util.Collections;

public class SortListOfString {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Rahul");
		list.add("Amit");
		list.add("Neha");
		
		System.out.println("Original List: " + list);
		
		Collections.sort(list);
		
		System.out.println("Sorted List: " + list);
	}
}
