import java.util.Scanner;

class CountPositiveNegativeZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int positive = 0, negative = 0, zero = 0;
		char ch;
		
		do {
			System.out.println("Do you want to enter a number: (y/n)");
			ch = sc.next().charAt(0);

			if (Character.toUpperCase(ch) == 'Y') {
				System.out.println("Enter number: ");
				int num = sc.nextInt();
				
				if (num > 0) {
					positive ++;
				} else if (num < 0) {
					negative ++;
				} else {
					zero ++;
				}
			}
		} while (Character.toUpperCase(ch) != 'N');
	
		System.out.println("Positive Number count: " + positive);
		System.out.println("Negative Number count: " + negative);
		System.out.println("Zero Number count: " + zero);
	}
}
			
