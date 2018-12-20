package opgave02_TempleteMethod;

public class SearchableArray<E extends Comparable<E>> extends SearchPattern<E> {
	private E[] array;
	private int i;

	public SearchableArray(E[] array) {
		this.array = array;
	}

	@Override
	protected void init() {
		i = 0;
	}

	@Override
	protected boolean isEmpty() {
		return i >= array.length;
	}

	@Override
	protected E select() {
		return array[i];
	}

	@Override
	protected void split(E m) {
		i++;
	}

}
