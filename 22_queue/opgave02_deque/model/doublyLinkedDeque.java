package model;

public class doublyLinkedDeque implements Deque {

	private class Node {
		public Object data;
		public Node next;
		public Node previous;
	}

	private Node first;
	private Node last;

	public doublyLinkedDeque() {
		first = null;
		last = null;
	}

	@Override
	public boolean isEmpty() {
		if (first == null) {
			return true;
		}
		return false;
	}

	@Override
	public void addFirst(Object newElement) {
		Node currentNode = new Node();
		currentNode.data = newElement;

		Node temp = new Node();
		if (isEmpty()) {
			first = currentNode;
			last = currentNode;
		} else {
			temp = first;
			first = currentNode;
			first.next = temp;
			temp.previous = first;
		}
	}

	@Override
	public void addLast(Object newElement) {
		Node currentNode = new Node();
		currentNode.data = newElement;

		Node temp = new Node();
		if (isEmpty()) {
			first = currentNode;
			last = currentNode;
		} else {
			temp = last;
			last = currentNode;
			last.previous = temp;
			temp.next = last;
		}

	}

	@Override
	public Object removeFirst() {
		Node temp = new Node();
		temp = first;
		Node currentNode = new Node();
		currentNode = first.next;
		first = currentNode;
		first.previous = null;

		return temp.data;
	}

	@Override
	public Object removeLast() {
		Node temp = new Node();
		temp = last;
		Node currentNode = new Node();
		currentNode = last.previous;
		last = currentNode;
		last.next = null;

		return temp.data;
	}

	@Override
	public Object getFirst() {
		return first.data;
	}

	@Override
	public Object getLast() {
		return last.data;
	}

	@Override
	public int size() {
		int count = 0;
		Node temp = first;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

}
