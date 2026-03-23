package com.practice;

public class PrimeNumbers {
    public static void main(String[] args) {
        int limit = 10; // Set the upper limit

        System.out.println("Prime numbers up to " + limit + " are:");

        for (int number = 2; number <= limit; number++) {
            boolean isPrime = true; // Assume number is prime

            // Check divisibility from 2 to √number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Found a divisor, not prime
                    break; // No need to check further
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}
