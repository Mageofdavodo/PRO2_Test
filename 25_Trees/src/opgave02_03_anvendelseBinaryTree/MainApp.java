package opgave02_03_anvendelseBinaryTree;

public class MainApp {

	public static void main(String[] args) {

		BinaryTree<Integer> allTheBottom = new BinaryTree<Integer>(23);

		BinaryTree<Integer> bottom1 = new BinaryTree<Integer>(15, allTheBottom, null);
		BinaryTree<Integer> bottom2 = new BinaryTree<Integer>(25);

		BinaryTree<Integer> mid1 = new BinaryTree<Integer>(11, null, bottom1);
		BinaryTree<Integer> mid2 = new BinaryTree<Integer>(30, bottom2, null);

		BinaryTree<Integer> topMid1 = new BinaryTree<Integer>(22, mid1, mid2);

		BinaryTree<Integer> bottom3 = new BinaryTree<Integer>(88);
		BinaryTree<Integer> mid3 = new BinaryTree<Integer>(90, bottom3, null);

		BinaryTree<Integer> topMid2 = new BinaryTree<Integer>(77, null, mid3);

		BinaryTree<Integer> root = new BinaryTree<Integer>(45, topMid1, topMid2);

		System.out.println(root.height());
		System.out.println();
		root.inorder();
		System.out.println();
		root.preorder();
		System.out.println();
		root.postorder();
		System.out.println();
		System.out.println("total sum: " + root.getSum());
		System.out.println();
		System.out.println("Average: " + root.getAvg());
	}

}
