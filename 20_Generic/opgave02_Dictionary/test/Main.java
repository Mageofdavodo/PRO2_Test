package test;

import model.Dictionary;

public class Main {

	public static void main(String[] args) {
		Dictionary<Integer, String> dictionary = new Dictionary<Integer, String>();
		System.out.println("Størrelse af listen "+dictionary.size());
System.out.println();

dictionary.put(1, "Torben");
dictionary.put(2, "Michael");
dictionary.put(3, "Peter");
System.out.println(dictionary.put(4, "Per"));
System.out.println("ændre plads 4");
System.out.println();
System.out.println(dictionary.put(4, "Fisk"));
System.out.println("Størrelse af listen "+dictionary.size());
System.out.println("Henter plads 3: "+dictionary.get(3));

System.out.println(dictionary.remove(4));
System.out.println("Størrelse af listen "+dictionary.size());
System.out.println("Henter plads 4: "+dictionary.get(4));


	}

}
