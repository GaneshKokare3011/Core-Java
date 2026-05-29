class SBReplaceJava {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("I love Java");
		
		int start = sb.indexOf("Java");
		
		sb.replace(start, start + 4, "Python");

		System.out.println(sb);
	}
}
