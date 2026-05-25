class ToggleCase {
	public static void main(String[] args) {
		String input = "JaVa";
		String output = "";
	
		for (int i = 0; i < input.length(); i ++) {
			char ch = input.charAt(i);
			
			if (Character.isLetter(ch) && Character.isUpperCase(ch)) {
				output += Character.toLowerCase(ch);
			} else {
				output += Character.toUpperCase(ch);
			}
		}
		System.out.println("Original String: " + input);
		System.out.println("Toggled String: " + output);
	}
}
