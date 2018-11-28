package opgave01;

import java.util.HashSet;

public class MainApp {

	public static void main(String[] args) {
		HashSet<Bil> set = new HashSet<Bil>();
		Bil b1 = new Bil("1345", "Skoda", "Octavia", "Lilla");
		Bil b2 = new Bil("2352", "Kia", "Mini", "Rød");
		Bil b3 = new Bil("521s", "Banan", "Skæv", "Brun");
		Bil b4 = new Bil("2352", "Kia", "Mini", "Blå");
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);

		System.out.println(b2.equals(b4));
		System.out.println(b2.equals(b3));
		System.out.println(set);

	}

}
