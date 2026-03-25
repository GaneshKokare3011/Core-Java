package com.nonParameterWithReturnType;

public class PrimeNumbers {
	
	public void displayPrime() {
		int n = 10;

		System.out.println("Prime numbers up to " + n + " are:");

		for (int number = 2; number <= n; number++) {
			boolean isPrime = true;

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
