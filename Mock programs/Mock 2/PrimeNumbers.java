package mock.programs;
public class PrimeNumbers {
	
	private int num;
	
	public void setNumber(int num) {
		int count = 0;
		for (int i = 1; i <= num; i ++) {
			if (num % i == 0) {
				count ++;
			}
		}
		
		if (count == 2) {
			this.num = num;
		} else {
			System.out.println("Not a prime number.");
		}
	}
	
	public int getPrime() {
		return num;
	}
}
