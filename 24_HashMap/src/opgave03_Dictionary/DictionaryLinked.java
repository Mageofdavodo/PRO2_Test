package opgave03_Dictionary;

public class DictionaryLinked<K, V> implements Dictionary<K, V> {
	private Node start;
	private int size;

	private class Node {
		Node next;
		K key;
		V value;
	}

	public DictionaryLinked() {
		// Sentinel (tomt listehoved, der ikke indeholder data)
		start = new Node();
		size = 0;
	}

	@Override
	public V get(K key) {
		if (key != null) {
			Node temp = start;
			boolean found = false;
			while (!found && temp != null) {
				if (temp.key != null && temp.key.equals(key)) {
					return temp.value;
				}
				temp = temp.next;

			}
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public V put(K key, V value) {
		V oldValue = null;
		if (key != null || value != null) {
			Node temp = start;
			boolean found = false;
			if (start == null) {
				start.key = key;
				start.value = value;
			} else {
				while (!found && temp != null) {

					if (temp != null && temp.key.equals(key)) {
						oldValue = temp.value;
						temp.value = value;
						found = true;
						size++;
					}
					temp = temp.next;
				}
				if (!found) {
					temp = new Node();
					temp.key = key;
					temp.value = value;
					size++;
				}
			}
		}
		return oldValue;
	}

	@Override
	public V remove(K key) {
		if (key != null) {

		}
		return null;
	}

	@Override
	public int size() {
		return size;
	}

}
