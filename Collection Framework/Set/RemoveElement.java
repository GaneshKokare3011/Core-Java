package com.set;

import java.util.LinkedHashSet;

public class RemoveElement {
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		set.remove(3);
		System.out.println(set);
	}
}
