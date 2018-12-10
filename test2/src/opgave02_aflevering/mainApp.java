package opgave02_aflevering;

// Code by: Michael Kragelund

public class mainApp {

	public static void main(String[] args) {
		BinarySearchTree<Integer> tree = new BinarySearchTree<>();
		tree.add(45);
		tree.add(22);
		tree.add(11);
		tree.add(90);
		tree.add(30);
		tree.add(15);
		tree.add(25);
		tree.add(88);

		tree.print();
		System.out.println(tree.findMax());

		System.out.println("fjerner: " + tree.removeMin());
		System.out.print("Elementer i træet: ");
		tree.print();

		System.out.println("fjerner: " + tree.removeMin());
		System.out.print("Elementer i træet: ");
		tree.print();

		System.out.println("fjerner: " + tree.removeMin());
		System.out.print("Elementer i træet: ");
		tree.print();

		System.out.println("fjerner: " + tree.removeMin());
		System.out.print("Elementer i træet: ");
		tree.print();

		System.out.println("fjerner: " + tree.removeMin());
		System.out.print("Elementer i træet: ");
		tree.print();

		System.out.println("fjerner: " + tree.removeMin());
		System.out.print("Elementer i træet: ");
		tree.print();
		System.out.println("fjerner: " + tree.removeMin());
		System.out.print("Elementer i træet: ");
		tree.print();
		System.out.println("fjerner: " + tree.removeMin());
		System.out.println("fjerner: " + tree.removeMin());

	}

}
