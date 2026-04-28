package com.arrays;

public class MaximumElement {
	public static void main(String[] args) {
		int arr[] = {1, 2, 32, 3, 4, 5};
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("Maximum element from array is: " + max);
	}
}	
