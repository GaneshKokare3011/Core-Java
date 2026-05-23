class CountUpperAndLowerCase {
	public static void main(String[] args) {
		String input = "JavaTrainer";
		int uppercase = 0, lowercase = 0;

		for (int i = 0; i < input.length(); i ++) {
			char ch = input.charAt(i);
			
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {
					uppercase ++;
				} else {
					lowercase ++;
				}
			}
		}
		System.out.println("Uppercase count: " + uppercase);
		System.out.println("Lowercase count: " + lowercase);
	}
}
