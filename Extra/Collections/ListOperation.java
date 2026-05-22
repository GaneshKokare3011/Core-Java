import java.util.ArrayList;

class ListOperation {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println("Original list: " + list);

		list.add(6);
		System.out.println("List after adding an element: " + list);

		list.set(5, 7);
		System.out.println("List after updation: " + list);

		list.remove(5);
		System.out.println("List after removing an element: " + list);
	}
}
