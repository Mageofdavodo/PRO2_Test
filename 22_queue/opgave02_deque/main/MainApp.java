package main;

import model.IDeque;
import model.doublyLinkedDeque;

public class MainApp {

	public static void main(String[] args) {
		IDeque q = new doublyLinkedDeque();
		q.addFirst("Fisk");
		q.addFirst("Diamanter");
		q.addLast("Bananer");
		System.out.println("Størrelse " + q.size());

		System.out.println("Første element: " + q.getFirst());
		System.out.println("Fjerner første element: " + q.removeFirst());
		System.out.println("Størrelse " + q.size());
		System.out.println("Første element: " + q.getFirst());
		System.out.println();
		System.out.println("Sidste element: " + q.getLast());
		System.out.println("Fjerner element: " + q.removeLast());
		System.out.println("Sidste element: " + q.getLast());
		System.out.println("Første element: " + q.getFirst());
		System.out.println("Fjerner element: " + q.removeLast());
	}

}
