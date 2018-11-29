package opgave03_Dictionary;

public class DictionaryHashMap<K, V> implements Dictionary<K, V> {

	private java.util.Map<Object, Object>[] tabel;
	private int N = 10;

	/**
	 * HashingMap constructor comment.
	 */
	public DictionaryHashMap() {
		tabel = new java.util.HashMap[N];
		for (int i = 0; i < N; i++) {
			tabel[i] = new java.util.HashMap<Object, Object>();
		}
	}

	@Override
	public V get(K key) {
		int i = key.hashCode() % N;
		java.util.Map<Object, Object> map = tabel[i];
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
		// TODO
		return null;
	}

	@Override
	public V remove(K key) {
		// TODO
		return null;
	}

	@Override
	public int size() {
		// TODO
		return 0;
	}

}
