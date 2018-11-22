package arrayExercise1;

import queues.Queue;

/**
 * An implementation of a queue using an array
 */

public class ArrayQueue implements Queue {

	private Object[] array;
	private int head;
	private int tail;
	private int size;

	/**
	 * Constructs an empty queue.
	 */

	public ArrayQueue() {
		size = 5;
		array = new Object[size];
		head = 0;
		tail = 0;

	}

	/**
	 * Checks whether this queue is empty.
	 * 
	 * @return true if this queue is empty
	 */
	@Override
	public boolean isEmpty() {
		if (head == tail) {
			return true;
		}
		return false;
	}

	/**
	 * Adds an element to the tail of this queue.
	 * 
	 * @param newElement the element to add
	 */
	@Override
	public void enqueue(Object newElement) {
		if (tail == size) {
			size += 5;
			Object[] temp = new Object[size];
			for (int i = head; i < tail; i++) {
				temp[i] = array[i];
			}
			array = temp;
		}
		array[tail] = newElement;
		tail++;
	}

	/**
	 * Removes an element from the head of this queue.
	 * 
	 * @return the removed element
	 */
	@Override
	public Object dequeue() {
		Object removedObject = getFront();
		head++;

		return removedObject;
	}

	/**
	 * Returns the head of this queue. The queue is unchanged.
	 * 
	 * @return the head element
	 */
	@Override
	public Object getFront() {
		if (!isEmpty()) {
			return array[head];
		}
		return null;
	}

	/**
	 * The number of elements on the queue.
	 * 
	 * @return the number of elements in the queue
	 */
	@Override
	public int size() {
		return tail - head;
	}
}
