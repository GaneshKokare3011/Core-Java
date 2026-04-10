package com.scanner;
import java.util.Scanner;

public class Sentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.println("Enter a sentence: ");
		str = sc.nextLine();
		
		System.out.println("Yout sentence: " + str);
		
		sc.close();
	}
}
