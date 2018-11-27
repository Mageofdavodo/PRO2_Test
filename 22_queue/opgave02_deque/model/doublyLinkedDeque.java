package model;

import java.util.NoSuchElementException;

public class doublyLinkedDeque implements IDeque {

	private class Node {
		public Object data;
		public Node next;
		public Node previous;
	}

	private Node first;
	private Node last;
	private int size;

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
		size++;
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
		size++;

	}

	@Override
	public Object removeFirst() {
		Node temp = new Node();
		if (first == null) {
			throw new NoSuchElementException();
		}
		temp = first;
		if (first == last) {
			first = null;
			last = null;
		} else {
			Node currentNode = new Node();
			currentNode = first.next;
			first = currentNode;
			first.previous = null;
		}
		size--;

		return temp.data;
	}

	@Override
	public Object removeLast() {
		Node temp = new Node();
		if (last == null) {
			throw new NoSuchElementException();
		}
		temp = last;
		if (last == first) {
			first = null;
			last = null;
		} else {
			Node currentNode = new Node();
			currentNode = last.previous;
			last = currentNode;
			last.next = null;
		}
		size++;
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
		return size;
	}

}
