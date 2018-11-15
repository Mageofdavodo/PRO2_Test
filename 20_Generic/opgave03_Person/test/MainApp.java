package test;

import java.util.ArrayList;
import java.util.Collections;

import model.Navn;
import model.Person;

public class MainApp {
    public static void main(String[] args) {
        Person<String> person = new Person<>("Torben");
        System.out.println(person.getNavn());

        Navn navn = new Navn("Michael", "Kragelund");
        Navn navn2 = new Navn("Torben", "Grove");
        Navn navn3 = new Navn("Fisk", "Fisken");
        Person<Navn> person2 = new Person<>(navn);
        Person<Navn> person3 = new Person<>(navn2);
        Person<Navn> person4 = new Person<>(navn3);

        ArrayList<Person<Navn>> personer = new ArrayList<>();
        personer.add(person2);
        personer.add(person3);
        personer.add(person4);
        System.out.println(personer);
        Collections.sort(personer);
        System.out.println(personer);
    }

}
