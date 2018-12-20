package opgave02_TempleteMethod;

import java.util.ArrayList;
import java.util.Arrays;

public class TestOpgave2 {
	public static void main(String[] args) {

		// opgave 2.2
		System.out.println();
		System.out.println("Opgave 2.2:");
		ArrayList<String> list = new ArrayList<>();
		list.add("Holme");
		list.add("Skåde");
		list.add("Viby");
		list.add("Beder");
		list.add("Stautrup");
		list.add("Engdal");
		list.add("Forældreskolen");
		list.add("Malling");
		SearchableList<String> searchlist = new SearchableList<>(list);
		System.out.println("Er Malling i listen? " + searchlist.search("Malling"));
		System.out.println("Er Riisskov i listen? " + searchlist.search("Riisskov"));

		// opgave 2.3
		System.out.println();
		System.out.println("Opgave 2.3:");
		String[] array = { "Holme", "Skåde", "Viby", "Beder", "Stautrup", "Engdal", "Forældreskolen", "Malling" };
		SearchableArray<String> searchArray = new SearchableArray<>(array);
		System.out.println("Er Malling i listen? " + searchArray.search("Malling"));
		System.out.println("Er Riisskov i listen? " + searchArray.search("Riisskov"));

		// opgave 2.4
		System.out.println();
		System.out.println("Opgave 2.4:");
		Arrays.sort(array);
		SearchableArrayBin<String> searchArrayBin = new SearchableArrayBin<>(array);
		System.out.println("Er Malling i listen? " + searchArrayBin.search("Malling"));
		System.out.println("Er Riisskov i listen? " + searchArrayBin.search("Riisskov"));

	}
}
