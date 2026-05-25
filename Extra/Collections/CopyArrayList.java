import java.util.ArrayList;

class CopyArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();	
	
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
	
		list2.addAll(list);

		for (int a : list2) {
			System.out.print(a + " ");
		}
	}
}
