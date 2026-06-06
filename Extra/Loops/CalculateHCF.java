import java.util.Scanner;

class CalculateHCF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter first number: ");
		int dividend = sc.nextInt();
		System.out.println("Enter second number: ");
		int divisor = sc.nextInt();
		int remainder, hcf = 0;

		do {
			remainder = dividend % divisor;
			
			if (remainder == 0) {
				hcf = divisor;
			} else {
				dividend = divisor;
				divisor = remainder;
			}
		} while (remainder != 0);
	
		System.out.println("HCF: " + hcf);
	}
}
