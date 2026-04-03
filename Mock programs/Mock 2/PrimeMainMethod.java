package mock.programs;

public class PrimeMainMethod {
	public static void main(String[] args) {
		PrimeNumbers p = new PrimeNumbers();
		
		p.setNumber(7);
//		System.out.println(p.getPrime());
		
		int check = p.getPrime();
		
		if (check == 0) {
			return;
		} else {
			System.out.println(p.getPrime() + " is a prime number.");
		}
	}
}
