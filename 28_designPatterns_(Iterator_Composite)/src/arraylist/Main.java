package arraylist;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayedList<String> list = new ArrayedList<>();
		list.add("Banan");
		list.add("Æble");
		list.add("Tomat");
		list.add("Jordbær");
		System.out.println(list);

		Iterator<String> iter = list.iterator();

		for (int i = 0; i < list.size(); i++) {
			System.out.println(iter.next());
		}

		list.add("Bob");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(iter.next());
		}

	}

}
