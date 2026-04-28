package com.arrays;

public class CopyArray {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int arr2[] = new int[10];
		
		for (int i = 0; i < arr.length; i ++) {
			arr2[i] = arr[i];
		}
		
		System.out.println("Elements in array 2: ");
		for (int i = 0; i < arr.length; i ++) {
			System.out.println(arr2[i]);
		}
	}
}
