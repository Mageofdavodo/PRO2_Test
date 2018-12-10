package opgave02_03_anvendelseBinaryTree;

public class MainApp {

	public static void main(String[] args) {

		BinaryTree<Integer> tree23 = new BinaryTree<Integer>(23);

		BinaryTree<Integer> tree15 = new BinaryTree<Integer>(15, tree23, null);
		BinaryTree<Integer> tree25 = new BinaryTree<Integer>(25);

		BinaryTree<Integer> tree11 = new BinaryTree<Integer>(11, null, tree15);
		BinaryTree<Integer> tree30 = new BinaryTree<Integer>(30, tree25, null);

		BinaryTree<Integer> tree22 = new BinaryTree<Integer>(22, tree11, tree30);

		BinaryTree<Integer> tree88 = new BinaryTree<Integer>(88);
		BinaryTree<Integer> tree90 = new BinaryTree<Integer>(90, tree88, null);

		BinaryTree<Integer> tree77 = new BinaryTree<Integer>(77, null, tree90);

		BinaryTree<Integer> root = new BinaryTree<Integer>(45, tree22, tree77);

		System.out.println(root.height());
		System.out.println();
		root.inorder();
		System.out.println();
		root.preorder();
		System.out.println();
		root.postorder();
		System.out.println();
		System.out.println("total sum: " + root.calcSum());
		System.out.println();
		System.out.println("Størrelsen af træet: " + root.size());
		System.out.println();
		System.out.println("Average: " + root.calcAvg());
	}

}
