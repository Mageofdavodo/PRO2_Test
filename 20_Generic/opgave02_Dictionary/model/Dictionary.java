package model;


import java.util.LinkedList;
@SuppressWarnings({"rawtypes", "unchecked"})
public class Dictionary<K, V> implements IDictionary<K, V> {

	
	private LinkedList<Node> link;
	
	public Dictionary() {
		this.link = new LinkedList<>();
	}

	
	
	@Override
	public V get(K key) {
		for (Node node : link) {
			if (node.key.equals(key)) {
				return (V) node.value;
			}
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return link.isEmpty();
	}

	@Override
	public V put(K key, V value) {
		boolean found = false;
		int i = 0;
		while (!found && i < link.size()) {
			Node current = link.get(i);
			if (current.key.equals(key)) {
				V valueCurrent = (V) current.value;
				current.value = value;
				found = true;
				return valueCurrent;
			}
			i++;
		}
			Node node = new Node();
			node.key = key;
			node.value = value;
			link.add(node);
			return null;
	}

	@Override
	public V remove(K key) {
		int i = 0;
		while (i < link.size()) {
			Node node = link.get(i);
			if (node.key.equals(key)) {
				V value = (V) node.value;
				link.remove(i);
				return value;
			}
			else {
				i++;
			}
		}
		return null;
	}

	@Override
	public int size() {
		return link.size();
	}

}
class Node<K, V>{
	K key;
	V value;
}
