package com.practice1;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
	public static void main(String[] args) {
		String str = "aabbcddee";
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for (int i = 0; i < str.length(); i ++) {
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				return;
			}
		}
		System.out.println("No non-repeated character");
	}
}
