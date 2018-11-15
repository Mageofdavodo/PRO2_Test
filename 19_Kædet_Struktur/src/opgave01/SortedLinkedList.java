package opgave01;

import java.util.NoSuchElementException;

public class SortedLinkedList {
    private Node first;

    public SortedLinkedList() {
        first = null;
    }

    class Node {
        public String data;
        public Node next;
    }

    public Node getFirstNode() {
        return first;
    }

    /**
     * Tilføjer et element til listen, så listen fortsat er sorteret i henhold
     * til den naturlige ordning på elementerne.
     *
     * @param element
     *            det der indsættes
     */
    public void addElement(String element) {
        Node temp = new Node();
        temp.data = element;
        Node current = first;
        Node previous = null;
        while (current != null && temp.data.compareTo(current.data) > 0) {
            previous = current;
            current = current.next;
        }
        if (first == current) {
            first = temp;
            temp.next = current;
        } else if (current == null || current.data != temp.data) {
            previous.next = temp;
            temp.next = current;
        }

    }

    /**
     * Fjerner et element fra listen.
     *
     * @param element
     *            det element der fjernes
     * @return true hvis elementet blev fjernet, men ellers false.
     */
    public boolean removeElement(String element) {
        if (first == null) {
            throw new NoSuchElementException();
        }
        Node temp = new Node();
        temp.data = element;
        Node current = first;
        Node previous = null;
        boolean found = false;
        while (current != null && temp.data.compareTo(current.data) > 0) {
            previous = current;
            current = current.next;
        }
        if (temp.data.compareTo(current.data) == 0 && previous == null) {
            first = first.next;
            found = true;
        } else if (temp.data.compareTo(current.data) == 0) {
            previous.next = current.next;
            found = true;
        }

        return found;
    }

    /**
     * Tilføjer alle elementerne fra list til den aktuelle liste. Listen er
     * fortsat sorteret i henhold til den naturlige ordning på elementerne.
     */
    public void addAll(SortedLinkedList list) {
        Node temp = list.getFirstNode();
        Node currentList = temp;
        while (currentList != null) {
            addElement(currentList.data);
            currentList = temp.next;
            temp = temp.next;
        }
    }

    /**
     * Returnerer antallet af elementer i listen.
     */
    public int countElements() {
        int count = 0;
        Node temp = first;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    @Override
    public String toString() {
        Node temp = first;
        String string = "";
        while (temp != null) {
            string += temp.data + " ";
            temp = temp.next;
        }
        return string;
    }
}
