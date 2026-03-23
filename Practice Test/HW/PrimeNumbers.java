package com.practice;

public class PrimeNumbers {
    public static void main(String[] args) {
        int limit = 10; 

        System.out.println("Prime numbers up to " + limit + " are:");

        for (int number = 2; number <= limit; number++) {
            boolean isPrime = true; 

            // Check divisibility from 2 to √number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; 
                    break; 
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}
