package opgave_p12_8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static int findBiggest(int[] ints) {
        return getHighestMax(ints, 0);
    }

    public static int getHighestMax(int[] ints, int max) {
        int fisk = 0;
        if (ints.length == 0) {
            return max;
        }

        if (ints[ints.length - 1] > max) {
            max = ints[ints.length - 1];
        }
        int[] newInts = Arrays.copyOfRange(ints, 0, ints.length - 1);

        return

        getHighestMax(newInts, max);
    }

    public static void main(String[] args) {

        int[] array = { 3, 7, 2, 0, 8, 9, 1 };
        System.out.println(findBiggest(array));

    }

}
