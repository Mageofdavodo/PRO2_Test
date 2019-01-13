package binaryTree;

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

	public int countElements(E element) {
		if (isEmpty()) {
			return 0;
		} else {
			return countElementsHelper(element, root);
		}
	}

	private int countElementsHelper(E element, Node node) {
		Node current = node;
		if (current != null) {
			if (element.equals(current.data)) {
				return 1 + countElementsHelper(element, current.left) + countElementsHelper(element, current.right);
			} else {
				return countElementsHelper(element, current.left) + countElementsHelper(element, current.right);
			}
		}
		return 0;
	}

	public int value() {
		return value(root);
	}

	private int value(Node n) {
		if (n != null) {
			if (n.data.equals("*")) {
				return value(n.left) * value(n.right);
			} else if (n.data.equals("+")) {
				return value(n.left) + value(n.right);
			} else {
				return Integer.parseInt((String) n.data) + value(n.left) + value(n.right);
			}
		}
		return 0;

	}

	/**
	 * Replace the root data with some new data
	 * 
	 * @param newData the new data for the root
	 * @return the data in the root before replacement
	 */
	public E replace(E newData) {
		E oldData = this.root.data;
		this.root.data = newData;
		return oldData;
	}

	/**
	 * The size of the tree
	 * 
	 * @return the number of nodes in the tree
	 */
	public int size() {
		return size(root);
	}

	// Private recursive helper method
	private int size(Node n) {
		if (n == null)
			return 0;
		return 1 + size(n.left) + size(n.right);
	}

	private class Node {
		public E data;
		public Node left;
		public Node right;
	}
}