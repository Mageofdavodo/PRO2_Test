package model;

import java.util.HashSet;
import java.util.Set;

public class PersonAdministrator {

    private static PersonAdministrator personAdministrator;
    private Set<Person> persons;

    private PersonAdministrator() {
        persons = new HashSet<>();
    }

    public static PersonAdministrator getPersonAdmin() {
        if (personAdministrator == null) {
            personAdministrator = new PersonAdministrator();
        }
        return personAdministrator;
    }

    public Set<Person> getPersons() {
        return persons;
    }

    public void addPerson(Person p) {
        this.persons.add(p);
    }

    public void removePerson(Person p) {
        this.persons.remove(p);
    }
}
