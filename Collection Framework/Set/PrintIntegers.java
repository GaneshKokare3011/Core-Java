package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class PrintIntegers {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
//		for (Integer i : set) {
//			System.out.print(i + " ");
//		}
		
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}
