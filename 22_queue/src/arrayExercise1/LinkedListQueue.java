package arrayExercise1;

import queues.Queue;

public class LinkedListQueue implements Queue {

	private Node first;
	private Node last;

	public LinkedListQueue() {
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
	public void enqueue(Object newElement) {
		Node currentNode = new Node();
		currentNode.data = newElement;
		if (isEmpty()) {
			first = currentNode;
		} else {
			last.next = currentNode;
		}
		last = currentNode;
		last.next = null;

	}

	@Override
	public Object dequeue() {
		Node temp = first;
		if (first.next == null) {
			last = null;
		}
		first = first.next;
		return temp.data;
	}

	@Override
	public Object getFront() {
		if (!isEmpty()) {
			return first.data;
		}
		return null;
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

	class Node {
		public Object data;
		public Node next;
	}
}
