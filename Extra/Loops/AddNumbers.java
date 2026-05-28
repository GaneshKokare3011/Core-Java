import java.util.Scanner;

class AddNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		char choice;

		do {
			System.out.println("Enter first number: ");
			num1 = sc.nextInt();

			System.out.println("Enter second number: ");
			num2 = sc.nextInt();

			int sum = num1 + num2;
	
			System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
		
			System.out.println("Do you want to continue: y/n");
			choice = sc.next().charAt(0);
		} while (choice != 'n');
	}
}
