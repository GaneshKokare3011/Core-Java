class SumOfTwoArrays {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int arr2[] = {1, 2, 3, 4, 5};
		int sum[] = new int[arr.length];
		
		for (int i = 0; i < arr.length; i ++) {
			sum[i] += arr[i] + arr2[i];
		    }
		
		for (int s : sum) {
		    System.out.print(s + " ");
		}
	}
}
