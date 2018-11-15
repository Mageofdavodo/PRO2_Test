package model;

import java.util.Comparator;

public class Customer implements Comparable<Customer> {

    private int number;
    private String name;
    private Comparator<Customer> comp;

    public Customer(int number, String name, Comparator<Customer> comp) {
        this.number = number;
        this.name = name;
        this.comp = comp;
    }

    @Override
    public int compareTo(Customer o) {

        return comp.compare(this, o);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer [number=" + number + ", name=" + name + "]";
    }

    public Comparator<Customer> getComp() {
        return comp;
    }

    public void setComp(Comparator<Customer> comp) {
        this.comp = comp;
    }

}
