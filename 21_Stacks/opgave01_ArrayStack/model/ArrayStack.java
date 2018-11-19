package model;

@SuppressWarnings("unchecked")
public class ArrayStack<T> implements Stack<T> {

	private T[] array;

	public ArrayStack() {
		array = (T[]) new Object[0];
	}

	@Override
	public void push(T element) {
		T[] temp = (T[]) new Object[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		temp[temp.length - 1] = element;
		array = temp;

	}

	@Override
	public T pop() {
		if (!isEmpty()) {
			T element = array[array.length - 1];
			T[] temp = array;
			array = (T[]) new Object[temp.length - 1];
			for (int i = 0; i < array.length; i++) {
				array[i] = temp[i];
			}
			return element;
		} else {
			return null;
		}

	}

	@Override
	public T peek() {
		if (!isEmpty()) {
			return array[array.length - 1];
		} else {
			return null;
		}
	}

	@Override
	public boolean isEmpty() {
		if (array.length > 0) {
			return false;
		}
		return true;
	}

	@Override
	public int size() {
		return array.length;
	}

}
