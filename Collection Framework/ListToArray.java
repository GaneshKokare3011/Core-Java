package com.list;

import java.util.ArrayList;

public class ListToArray {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		Integer arr[] = list.toArray(new Integer[list.size()]);
		
		for (Integer num : arr) {
			System.out.print(num + " ");
		}
	}
}
