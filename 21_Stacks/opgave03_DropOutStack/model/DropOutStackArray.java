package model;

@SuppressWarnings("unchecked")
public class DropOutStackArray<T> implements Stack<T> {

	private int top = 0;

	private T[] array;

	public DropOutStackArray(int maxSize) {
		array = (T[]) new Object[maxSize];
	}

	public void push(T element) {

		if (top == array.length) {
			top = 0;
		}
		array[top] = element;
		top++;

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
			return array[top];
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

	public String print() {
		String string = "";
		for (int i = 0; i < array.length; i++) {
			string += array[i] + " ";
		}
		return string;
	}

}
