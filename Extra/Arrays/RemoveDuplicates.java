class RemoveDuplicates {
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 3, 7, 1, 9};
		int n = arr.length;
		int unique[] = new int[n];
		int index = 0;

		for (int i = 0; i < n; i ++) {
			boolean isDuplicate = false;
			
			for (int j = 0; j < index; j ++) {
				if (arr[i] == unique[j]) {
					isDuplicate = true;
					break;
				}
			}
			
			if (!isDuplicate) {
				unique[index ++] = arr[i];
			}
		}
	
		System.out.print("Array after removing duplicates: ");
		for (int i = 0; i < index; i ++) {
			System.out.print(unique[i] + " ");
		}
	}
}
