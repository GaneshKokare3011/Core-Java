class SBReverseString {
	public static void main(String[] args) {
		String input = "Hello World";
		
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();

		String reversed = sb.toString();
		
		System.out.println("Original: " + input);
		System.out.println("Reversed: " + reversed);
	}
}
