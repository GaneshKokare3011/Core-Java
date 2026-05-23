class AveragOfElements {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int sum = 0, length = 0;
		float avg = 0;

		for (int a : arr) {
			sum += a;
			length ++;
		}
		avg = sum / length;
		System.out.println("The average of array elements: " + avg);
	}
}
