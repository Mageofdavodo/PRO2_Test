package opgave02_doublyList;

public class SortedDoublyLinkedList {

	private class Node {
		public String data;
		public Node next;
		public Node previous;
	}

	private Node first;
	private Node last;

	/**
	 * Laver en tom sorteret doubly linked list.
	 */
	public SortedDoublyLinkedList() {
		Node sentinelFirst = new Node();
		Node sentinelLast = new Node();
		sentinelFirst.previous = null;
		sentinelFirst.next = sentinelLast;
		sentinelLast.previous = sentinelFirst;
		sentinelLast.next = null;
		this.first = sentinelFirst;
		this.last = sentinelLast;
	}

	/**
	 * Tilføjer et element til listen, så listen fortsat er sorteret i henhold til
	 * den naturlige ordning på elementerne.
	 * 
	 * @param element det der indsættes
	 */
	public void addElement(String element) {
		Node node = new Node();
		node.data = element;

		if (first.next == last && last.previous == first) {
			node.next = last;
			node.previous = first;
			first.next = node;
			last.previous = node;
		} else {
			boolean found = false;
			Node temp = first.next;
			while (!found) {
				if (temp.data != null) {
					if (temp.data.compareTo(node.data) > 0) {
						found = true;
					} else {
						temp = temp.next;
					}
				} else {
					found = true;
				}
			}
			if (found) {
				node.next = temp;
				node.previous = temp.previous;
				temp.previous.next = node;
				temp.previous = node;
			}
		}
	}

	public void print() {
		if (first.next != null) {
			Node temp = first.next;
			while (temp.data != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}

	/**
	 * Fjerner et element fra listen.
	 * 
	 * @param element det element der fjernes
	 * @return true hvis elementet blev fjernet, men ellers false.
	 */

}
