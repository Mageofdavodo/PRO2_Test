package arrayExercise1;

import java.util.NoSuchElementException;

import queues.Queue;

public class LinkedListQueue<T> implements Queue<T> {

	private Node first;
	private Node last;
	private int size;

	public LinkedListQueue() {
		first = null;
		last = null;
		size = 0;
	}

	@Override
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	@Override
	public void enqueue(T newElement) {
		Node currentNode = new Node();
		currentNode.data = newElement;
		if (isEmpty()) {
			first = currentNode;
		} else {
			last.next = currentNode;
		}
		last = currentNode;
		last.next = null;
		size++;

	}

	@Override
	public T dequeue() {
		Node temp = first;
		if (first == null) {
			throw new NoSuchElementException();
		}
		if (first.next == null) {
			last = null;
		}
		first = first.next;
		size--;
		return temp.data;
	}

	@Override
	public T getFront() {
		if (!isEmpty()) {
			return first.data;
		}
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	class Node {
		public T data;
		public Node next;
	}
}
