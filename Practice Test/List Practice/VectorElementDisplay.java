package com.listPractice;

import java.util.Vector;

public class VectorElementDisplay {
	public static void main(String[] args) {
		Vector list = new Vector();
		
		list.add(1);
		list.add("Ganesh");
		list.add(3478234793l);
		list.add(672846);
		list.add(343.3f);
		
		for (Object num : list) {
			System.out.print(num + " ");
		}
	}
}	
