package opgave03_Dictionary;

public class DictionaryHashMap<K, V> implements Dictionary<K, V> {

	private java.util.Map<K, V>[] tabel;
	private int N = 10;
	private int size = 0;

	/**
	 * HashingMap constructor comment.
	 */
	public DictionaryHashMap() {
		tabel = new java.util.HashMap[N];
		for (int i = 0; i < N; i++) {
			tabel[i] = new java.util.HashMap<K, V>();
		}
	}

	@Override
	public V get(K key) {
		int i = key.hashCode() % N;
		java.util.Map<K, V> map = tabel[i];
		return map.get(key);
	}

	@Override
	public boolean isEmpty() {
		boolean empty = true;
		int i = 0;
		while (empty && i < N) {
			empty = (tabel[i]).isEmpty();
			i++;
		}
		return empty;
	}

	@Override
	public V put(K key, V value) {
		int i = key.hashCode() % N;
		V oldValue = tabel[i].put(key, value);
		if (oldValue == null) {
			size++;
		}
		return oldValue;
	}

	@Override
	public V remove(K key) {
		int i = key.hashCode() % N;
		V oldValue = tabel[i].remove(key);
		if (oldValue != null) {
			size--;
		}
		return oldValue;
	}

	@Override
	public int size() {
		return size;
	}

}
