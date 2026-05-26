package com.practice1;

public class LargestAndSmallestElement {
	public static void main(String[] args) {
		int arr[] = {12, 5, 8, 20, 1};
		int largest = arr[0];
		int smallest = arr[0];
		
		for (int i = 0; i < arr.length; i ++) {
			if (largest < arr[i]) {
				largest = arr[i];
			}
		}
		
		for (int j = 0; j < arr.length; j ++) {
			if (smallest > arr[j]) {
				smallest = arr[j];
			}
		}
		
		System.out.println("Largest: " + largest);
		System.out.println("Smallest: " + smallest);
	}
}
