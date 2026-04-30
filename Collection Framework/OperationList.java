package com.list;
import java.util.ArrayList;

public class OperationList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("Original list: " + list);
		
		list.set(2, 33);
		System.out.println("After updation: " + list);
		
		list.remove(2);
		System.out.println("After remove: " + list);
	}
}
