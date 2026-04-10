package com.scanner;
import java.util.Scanner;

public class ProductBill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double price, totalBill;
		int quantity;
		
		System.out.print("Enter Price: ");
		price = sc.nextDouble();
		
		System.out.print("Enter Quantity: ");
		quantity = sc.nextInt();
		
		totalBill = price * quantity;
		
		System.out.println("Total bill: Rs." + totalBill);
		
		sc.close();
		
	}
}
