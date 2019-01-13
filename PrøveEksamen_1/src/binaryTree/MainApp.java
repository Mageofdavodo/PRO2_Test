package binaryTree;

public class MainApp {

	public static void main(String[] args) {
		BinaryTree<String> four = new BinaryTree<>("4");
		BinaryTree<String> two = new BinaryTree<>("2");

		BinaryTree<String> plus = new BinaryTree<>("+", two, four);

		BinaryTree<String> seven = new BinaryTree<>("7");
		BinaryTree<String> gange = new BinaryTree<>("*", plus, seven);
		BinaryTree<String> three = new BinaryTree<>("3");
		BinaryTree<String> eight = new BinaryTree<>("8");
		BinaryTree<String> plusRight = new BinaryTree<>("+", three, eight);

		BinaryTree<String> root = new BinaryTree<>("+", gange, plusRight);

		System.out.println(root.countElements("+"));
		System.out.println(root.value());
	}

}
