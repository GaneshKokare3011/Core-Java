package com.set;

import java.util.TreeSet;
import java.util.Iterator;

public class SortElements {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(212);
		set.add(23);
		set.add(4211);
		set.add(1);
		set.add(25);
		
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}
