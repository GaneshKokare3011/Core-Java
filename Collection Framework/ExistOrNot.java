package com.list;

import java.util.ArrayList;

public class ExistOrNot {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add("Ganesh");
		list.add("21");
		list.add(81f);
		list.add(40000);
		
		System.out.println(list.contains("Ganesh"));
	}
}	
