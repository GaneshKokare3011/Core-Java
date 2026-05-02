package com.listPractice;

import java.util.LinkedList;

public class StringLinkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		for (String str : list) {
			System.out.print(str + " ");
		}
	}
}
