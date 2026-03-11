package com.switchcase;

public class WeekendOrWeekday {
	public static void main(String[] args) {
		int day = 6;

		switch (day) {
		case 1, 2, 3, 4, 5:
			System.out.println(day + " is Week day.");
			break;
		case 6, 7:
			System.out.println(day + " is Weekend.");
			break;
		default:
			System.out.println("Invalid input.");
		}
	}
}
