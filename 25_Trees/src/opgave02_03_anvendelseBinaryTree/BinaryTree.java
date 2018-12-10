package opgave02_03_anvendelseBinaryTree;

/**
 * A binary tree in which each node has two children.
 */
public class BinaryTree<E> {
	private Node root;

	/**
	 * Constructs an empty tree.
	 */
	public BinaryTree() {
		root = null;
	}

	/**
	 * Constructs a tree with one node and no children.
	 * 
	 * @param rootData the data for the root
	 */
	public BinaryTree(E rootData) {
		root = new Node();
		root.data = rootData;
		root.left = null;
		root.right = null;
	}

	/**
	 * Constructs a binary tree.
	 * 
	 * @param rootData the data for the root
	 * @param left     the left subtree
	 * @param right    the right subtree
	 */
	public BinaryTree(E rootData, BinaryTree<E> left, BinaryTree<E> right) {
		root = new Node();
		root.data = rootData;
		if (left != null) {
			root.left = left.root;
		}
		if (right != null) {
			root.right = right.root;
		}
	}

	/**
	 * Checks whether this tree is empty.
	 * 
	 * @return true if this tree is empty
	 */
	public boolean isEmpty() {
		return root == null;
	}

	/**
	 * Gets the data at the root of this tree.
	 * 
	 * @return the root data
	 */
	public E data() {
		return root.data;
	}

	/**
	 * Gets the left subtree of this tree.
	 * 
	 * @return the left child of the root
	 */
	public BinaryTree<E> left() {
		BinaryTree<E> result = new BinaryTree<E>();
		result.root = root.left;
		return result;
	}

	/**
	 * Gets the right subtree of this tree.
	 * 
	 * @return the right child of the root
	 */
	public BinaryTree<E> right() {
		BinaryTree<E> result = new BinaryTree<E>();
		result.root = root.right;
		return result;
	}

	/**
	 *
	 * @param rootData the new data for the root
	 * @return the data previous in the root
	 */
	public E replace(E rootData) {
		E returnable = root.data;
		root.data = rootData;
		return returnable;
	}

	/**
	 * The size of the tree
	 * 
	 * @return the number of nodes in the tree
	 */
	public int size() {
		return size(root);
	}

	public int height() {
		return height(root);
	}

	public int height(Node n) {
		if (n == null) {
			return 0;
		} else {
			return 1 + Math.max(height(n.left), height(n.right));
		}
	}

	public void inorder() {
		inorder(root);
	}

	public void inorder(Node n) {
		if (n != null) {
			inorder(n.left);
			System.out.println(n.data);
			inorder(n.right);
		}
	}

	public void preorder() {
		preorder(root);
	}

	private void preorder(Node n) {
		if (n != null) {
			System.out.println(n.data);
			preorder(n.left);
			preorder(n.right);
		}

	}

	public void postorder() {
		postorder(root);
	}

	private void postorder(Node n) {
		if (n != null) {
			postorder(n.left);
			postorder(n.right);
			System.out.println(n.data);
		}

	}

	public int getSum() {
		return calcSum(root);
	}

	private int calcSum(Node n) {
		if (n != null) {
			return (int) n.data + calcSum(n.left) + calcSum(n.right);
		} else {
			return 0;
		}
	}

	public double getAvg() {
		return 1.0 * getSum() / size();
	}

	// Private recursive helper method
	private int size(Node n) {
		if (n == null) {
			return 0;
		} else {
			return size(n.left) + 1 + size(n.right);
		}
	}

	private class Node {
		public E data;
		public Node left;
		public Node right;
	}
}
