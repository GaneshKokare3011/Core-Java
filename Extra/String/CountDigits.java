class CountDigits {
	public static void main(String[] args) {
		String input = "Java1234";
		int digit = 0;
	
		for (int i = 0; i < input.length(); i ++) {
			char ch = input.charAt(i);
			
			if (Character.isDigit(ch)) {
				digit ++;
			}
		}
		System.out.println("Digit count: " + digit);
	}
}
