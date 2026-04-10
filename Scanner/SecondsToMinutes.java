package com.scanner;
import java.util.Scanner;

public class SecondsToMinutes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int seconds, minutes;
		
		System.out.print("Enter seconds: ");
		seconds = sc.nextInt();
		
		minutes = seconds / 60;
		
		System.out.println("Seconds: " + seconds + " To " + " Minutes: " + minutes);
		
		sc.close();
	}
}
