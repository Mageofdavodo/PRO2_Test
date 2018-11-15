package test;

import model.Person;
import model.PersonAdministrator;

public class TestSystem {

    public static void main(String[] args) {
        PersonAdministrator.getPersonAdmin();
        Person p1 = new Person("Torben");
        Person p2 = new Person("Michael");

        PersonAdministrator.getPersonAdmin().addPerson(p1);
        PersonAdministrator.getPersonAdmin().addPerson(p2);

        System.out.println(PersonAdministrator.getPersonAdmin().getPersons());
    }

}
