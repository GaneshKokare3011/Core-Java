package com.set;

import java.util.HashSet;

public class SizeOfHashSet {
	public static void main(String[] args) {
		HashSet set = new HashSet();

		set.add(1);
		set.add("Ganesh");
		set.add(21);
		set.add(50000);
		set.add(81f);

		System.out.println("Size: " + set.size());
	}
}
