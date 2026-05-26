package com.practice1;

public class RotateArrayByKPosition {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int k = 2;
		
		k = k % arr.length;
		if (k < 0) {
			k = k + arr.length;
		}
		
		for (int i = 0; i < k; i ++) {
			int lastElement = arr[arr.length - 1];
			
			for (int j = arr.length - 1; j > 0; j --) {
				arr[j] = arr[j - 1];
			}
			arr[0] = lastElement;
		}
		System.out.print("Rotated array: ");
		for (int i = 0; i < arr.length; i ++) {
			System.out.print(arr[i] + " ");
		}
	}
}
