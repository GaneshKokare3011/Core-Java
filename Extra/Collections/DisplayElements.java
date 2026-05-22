import java.util.ArrayList;

class DisplayElements {
	public static void main(String[] args) {
		ArrayList<Integer> integer = new ArrayList<>();

		integer.add(1);
		integer.add(2);
		integer.add(3);
		integer.add(4);
		integer.add(5);

		for (int a : integer) {
			System.out.print(a + " ");
		}
	}
}
