package com.listPractice;

import java.util.ArrayList;

public class ArrayListSize {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add("Ganesh");
		list.add(21);
		list.add(50000);
		list.add(81f);
		
		System.out.println("The size of arraylist is: "+list.size());
	}
}
