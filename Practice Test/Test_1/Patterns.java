package com.practice;

public class Patterns {
	public static void main(String[] args) {
		
//		for (char ch = 'A'; ch <= 'E'; ch ++) {
//			for (char ch1 = 'A'; ch1 <= ch; ch1 ++) {
//				System.out.print(ch1);
//			}
//			System.out.println();
//		}
		
//						A
//						AB
//						ABC
//						ABCD
//						ABCDE
	
		
		
		
//		for (int i = 1; i <= 5; i ++) {
//			for (int j = 1; j <= i; j ++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for (int i = 5 - 1; i >= 1; i --) {
//			for (int j = 1; j <= i; j ++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//						*
//						**
//						***
//						****
//						*****
//						****
//						***
//						**
//						*
		
		
		
		
//		for (int i = 1; i <= 5; i++) {
//            int num = (i % 2 == 1) ? 1 : 0; // starting number
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print(num);
//                num = (num == 1) ? 0 : 1; // toggle between 1 and 0
//            }
//            System.out.println();
//		}
		
//						1
//						01
//						101
//						0101
//						10101

		
		  for (int i = 1; i <= 5; i++) {
	            for (int j = 1; j <= 5; j++) {
	                if (j == i || j == 5 - i + 1) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	      }
		  
//						 *   *
//						  * * 
//						   *  
//						  * * 
//						 *   *
	}
}
