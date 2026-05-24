class RemoveSpaces {
	public static void main(String[] args) {
		String input = "Java is powerful";
		String output = "";

		for (int i = 0; i < input.length(); i ++) {
			char ch = input.charAt(i);
			
			if (ch != ' ') {
				output += ch;
			}
		}
		System.out.println("Original String: " + input);
		System.out.println("Without spaces: " + output);
	}
}
