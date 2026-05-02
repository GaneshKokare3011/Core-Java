package com.listPractice;

import java.util.Vector;

public class CountElementInVector {
	public static void main(String[] args) {
		Vector list = new Vector();
		
		list.add(1);
		list.add(2);
		list.add(3423);
		list.add(211243242l);
		list.add(343.6);
		
		System.out.println("Total element count: " + list.size());
	}
}
