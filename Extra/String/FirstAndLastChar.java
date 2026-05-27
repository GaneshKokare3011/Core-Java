class FirstAndLastChar {
	public static void main(String[] args) {
		String input = "Java is a programming language";
		
		char firstChar = input.charAt(0);
		char lastChar = input.charAt(input.length() - 1);
		
		System.out.println("First Character: " + firstChar);
		System.out.println("Last Character: " + lastChar);
	}
}
