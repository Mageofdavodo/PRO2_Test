package model;

import java.util.Comparator;

public class CompareNumber implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getNumber() - o2.getNumber();
    }

}
