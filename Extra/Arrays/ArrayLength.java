class ArrayLength {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int length = 0;
			
		for (int a : arr) {
			length ++;
		}
		System.out.println("Array length: " + length);
	}
}
