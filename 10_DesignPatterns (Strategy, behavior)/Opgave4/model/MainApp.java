package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainApp {

    public static void main(String[] args) {
        Comparator<Customer> compName = new CompareName();
        Comparator<Customer> compNumber = new CompareNumber();

        Customer customer3 = new Customer(6, "Torben", compNumber);
        Customer customer4 = new Customer(3, "Rasmus", compNumber);
        Customer customer5 = new Customer(8, "PEter", compNumber);
        Customer customer1 = new Customer(1, "Daniel", compNumber);
        Customer customer2 = new Customer(-1, "Daniella", compNumber);
        Customer customer6 = new Customer(2, "Pedro", compNumber);
        Customer customer7 = new Customer(3, "Niels", compNumber);
        Customer customer8 = new Customer(9, "Michael", compNumber);

        ArrayList<Customer> list = new ArrayList<>();

        list.add(customer1);
        list.add(customer2);
        list.add(customer3);
        list.add(customer4);
        list.add(customer5);
        list.add(customer6);
        list.add(customer7);
        list.add(customer8);

        Collections.sort(list);
        for (Customer c : list) {
            System.out.println(c);
        }

        System.out.println();
        list.sort(compName);
        for (Customer c : list) {
            System.out.println(c);
        }

    }

}
