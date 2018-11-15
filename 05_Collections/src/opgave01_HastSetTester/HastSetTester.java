package opgave01_HastSetTester;

import java.util.HashSet;

public class HastSetTester {

    public static void main(String[] args) {
        HashSet<Integer> integerHash = new HashSet<>();
        integerHash.add(34);
        integerHash.add(12);
        integerHash.add(23);
        integerHash.add(45);
        integerHash.add(67);
        integerHash.add(98);
        System.out.println(integerHash.toString());

        integerHash.add(23); // bliver ikke indsat
        System.out.println(integerHash.toString());

        integerHash.remove(67); // fjernes
        System.out.println(integerHash.toString());

        System.out.println(integerHash.contains(23));

        System.out.println(integerHash.size());

    }

}
