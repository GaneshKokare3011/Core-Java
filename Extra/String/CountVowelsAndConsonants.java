class CountVowelsAndConsonants {
	public static void main(String[] args) {
		String input = "Education";
		int vowels = 0, consonants = 0;

		for (int i = 0; i < input.length(); i ++) {
			char ch = input.charAt(i);
			ch = Character.toLowerCase(ch);
			if (Character.isLetter(ch)) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels ++;
				} else {
					consonants ++;
				}
			}
		}
		System.out.println("Vowels count: " + vowels);
		System.out.println("Consonants count: " + consonants);
	}
}
