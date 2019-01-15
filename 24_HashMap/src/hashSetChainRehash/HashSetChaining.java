package hashSetChainRehash;

import java.util.NoSuchElementException;

/**
 * This class implements a hash set using separate chaining.
 */
@SuppressWarnings("unchecked")
public class HashSetChaining<T> {
	private Node<T>[] buckets;
	private int currentSize;

	@SuppressWarnings("hiding")
	private class Node<T> {
		public T data;
		public Node<T> next;
	}

	/**
	 * Constructs a hash table.
	 * 
	 * @param bucketsLength the length of the buckets array
	 */

	public HashSetChaining(int size) {
		buckets = new Node[size];
		currentSize = 0;
	}

	/**
	 * Tests for set membership.
	 * 
	 * @param x an object
	 * @return true if x is an element of this set
	 */
	public boolean contains(Object x) {
		int h = hashValue(x);
		Node<T> bucket = buckets[h];
		boolean found = false;
		while (!found && bucket != null) {
			if (bucket.data.equals(x)) {
				found = true;
			} else {
				bucket = bucket.next;
			}
		}
		return found;
	}

	/**
	 * Adds an element to this set.
	 * 
	 * @param x an object
	 * @return true if x is a new object, false if x was already in the set
	 */
	public boolean add(T x) {
		int h = hashValue(x);

		Node<T> bucket = buckets[h];
		boolean found = false;
		while (!found && bucket != null) {
			if (bucket.data.equals(x)) {
				found = true;
			} else {
				bucket = bucket.next;
			}
		}
		if (!found) {
			Node<T> newNode = new Node<>();
			newNode.data = x;
			newNode.next = buckets[h];
			buckets[h] = newNode;
			currentSize++;
			double loadFactor = 0;
			loadFactor = currentSize / buckets.length;
			if (loadFactor >= 0.75) {
				rehash();
			}
		}

		return !found;
	}

	public int arraySize() {
		return buckets.length;
	}

	public void rehash() {
		Node<T>[] tempBuckets = buckets;
		buckets = new Node[tempBuckets.length * 2];
		currentSize = 0;
		for (int i = 0; i < tempBuckets.length; i++) {
			if (tempBuckets[i] != null) {
				Node<T> temp = tempBuckets[i];
				while (temp != null) {
					add((T) temp.data);
					temp = temp.next;
				}
			}
		}
	}

	/**
	 * Removes an object from this set.
	 * 
	 * @param x an object
	 * @return true if x was removed from this set, false if x was not an element of
	 *         this set
	 */
	public boolean remove(T x) {
		int h = hashValue(x);
		Node<T> bucket = buckets[h];
		boolean found = false;
		if (bucket == null) {
			throw new NoSuchElementException();
		}

		if (bucket.data.equals(x)) {
			if (bucket.next != null) {
				buckets[h] = bucket.next;

			} else {
				buckets[h] = null;
			}
			currentSize--;
			found = true;
		} else {
			while (!found && bucket.next != null) {
				if (bucket.next.data.equals(x)) {
					found = true;
				} else {
					bucket = bucket.next;
				}
			}
			if (found) {
				Node<T> temp = bucket.next;
				bucket.next = temp.next;
				temp.next = null;
				currentSize--;
			}
		}
		return found;
	}

	private int hashValue(Object x) {
		int h = x.hashCode();
		if (h < 0) {
			h = -h;
		}
		h = h % buckets.length;
		return h;
	}

	/**
	 * Gets the number of elements in this set.
	 * 
	 * @return the number of elements
	 */
	public int size() {
		return currentSize;
	}

	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < buckets.length; i++) {
			Node<T> temp = buckets[i];
			if (temp != null) {
				result += i + "\t";
				while (temp != null) {
					result += temp.data + " (h:" + hashValue(temp.data) + ")\t";
					temp = temp.next;
				}
				result += "\n";
			}
		}
		return result;
	}

}
