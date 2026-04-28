package com.arrays;

public class AverageOfElements {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int sum = 0, average;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		average = sum / arr.length;
		System.out.println("The average of elements is: " + average);
		
	}
}
