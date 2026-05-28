class NumberPower {
	public static void main(String[] args) {
		int num = 5, power = 2;
		int result = 1;

		for (int i = 1; i <= power; i ++) {
			result *= num;
		}
		System.out.println(num + "^" + power + " is: " + result);
	}
}
