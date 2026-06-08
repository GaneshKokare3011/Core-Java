class SBCountCharacter {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java is a programming language");
		int count = 0;

		for (int i = 0; i < sb.length(); i ++) {
			char ch = sb.charAt(i);

			if (ch != ' ') {
				count ++;
			}
		}
		System.out.println("Character count: " + count);
	}
}
