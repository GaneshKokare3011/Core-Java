class SBDeleteByIndex {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java is a programming language");
		
		sb.delete(2, 6);
		
		System.out.println("After deletion: " + sb);
	}
}
