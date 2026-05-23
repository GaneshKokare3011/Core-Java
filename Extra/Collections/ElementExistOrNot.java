import java.util.ArrayList;
	
class ElementExistOrNot {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		int search = 5;
		
		for (int a : list) {
			if (search == a) {
				System.out.println("Element exist in list.");
				return;
			}
		}
		System.out.println("Element does not exist in list.");
	}
}
