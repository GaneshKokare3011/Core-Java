package com.arrays;

public class SearchElement {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int search = 4;
		
		for (int i = 0; i < arr.length; i++) {
			if (search == arr[i]) {
				System.out.println("Element found: " + arr[i]);
			} 
		}
	}
}
