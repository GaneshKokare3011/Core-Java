package com.practice1;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String sentence = "java is easy and java is powerful";
		
		String words[] = sentence.split(" ");
		String result = "";
		
		for (int i = 0; i < words.length; i ++) {
			boolean isDuplicate = false;
			
			for (int j = 0; j < i; j ++) {
				if (words[i].equals(words[j])) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				result += words[i] + " ";
			}
		}
		System.out.println(result.trim());
	}
}
