package opgave02_TempleteMethod;

public class SearchableArrayBin<E extends Comparable<E>> extends SearchPattern<E> {
	private E[] array;
	private int left, right, middle;

	public SearchableArrayBin(E[] array) {
		this.array = array;
	}

	@Override
	protected void init() {
		left = 0;
		right = array.length - 1;
		middle = -1;
	}

	@Override
	protected boolean isEmpty() {
		return left > right;
	}

	@Override
	protected E select() {
		middle = (left + right) / 2;
		return array[middle];
	}

	@Override
	protected void split(E m) {
		if (array[middle].compareTo(m) > 0) {
			right = middle - 1;
		} else {
			left = middle + 1;
		}
	}

}
