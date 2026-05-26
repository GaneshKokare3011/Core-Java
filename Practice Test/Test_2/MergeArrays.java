package com.practice1;

public class MergeArrays {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3};
		int arr2[] = {4, 5, 6};
		
		int merged[] = new int[arr.length + arr2.length];
		
		for (int i = 0; i < arr.length; i ++) {
			merged[i] = arr[i];
		}
		
		for (int i = 0; i < arr2.length; i ++) {
			merged[arr.length + i] = arr2[i];
		}
		
		System.out.print("Merged Array: ");
		for (int i = 0; i < merged.length; i ++) {
			System.out.print(merged[i] + " ");
		}
	}
}
