class SBStringToSB {
	public static void main(String args[]) {
		String str = "Java is a language";
		StringBuilder sb = new StringBuilder(str);
		
		sb.insert(9, " programming");
		System.out.println("String to StringBuilder: " + sb);
	}
}
