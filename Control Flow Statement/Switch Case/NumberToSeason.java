package com.switchcase;

public class NumberToSeason {
	public static void main(String[] args) {
		int choice = 3;

		switch (choice) {
		case 12, 1, 2:
			System.out.println("Winter");
			break;
		case 3, 4, 5:
			System.out.println("Summer");
			break;
		case 6, 7, 8:
			System.out.println("Monsoon");
		default:
			System.out.println("Invalid input.");
		}
	}
}
