package arrayExercise1;

import queues.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> q = new ArrayQueue<>();
		q.enqueue("Arnold");
		q.enqueue("Sylvester");
		q.enqueue("Clint");
		q.enqueue("Bruce");
		q.enqueue("Dolph");
		q.enqueue("Chuck");
		System.out.println(q.getFront());
		System.out.println(q.isEmpty() + " " + q.size());
		while (!q.isEmpty()) {
			System.out.println(q.dequeue());
		}
		System.out.println();
		System.out.println(q.isEmpty() + " " + q.size());
		System.out.println();

		// -------------------------------------

		Queue<String> q2 = new LinkedListQueue<>();
		q2.enqueue("Arnold");
		q2.enqueue("Sylvester");
		q2.enqueue("Clint");
		q2.enqueue("Bruce");
		q2.enqueue("Dolph");
		q2.enqueue("Chuck");
		System.out.println("Henter første element: " + q2.getFront());
		System.out.println("Er listen tom? Og hvor mange elementer: " + q2.isEmpty() + " " + q2.size());
		while (!q2.isEmpty()) {
			System.out.print("Fjerner: ");
			System.out.print(q2.dequeue());
			System.out.println();
		}
		System.out.println();
		System.out.println("Er listen tom? Og hvor mange elementer: " + q2.isEmpty() + " " + q2.size());
		System.out.println();
	}
}
