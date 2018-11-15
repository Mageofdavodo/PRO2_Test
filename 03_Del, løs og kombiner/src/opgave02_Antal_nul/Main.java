package opgave02_Antal_nul;

import java.util.ArrayList;

public class Main {
    public static int antalNul(ArrayList<Integer> list) {
        return antalNulCount(list, 0, list.size() - 1);
    }

    private static int antalNulCount(ArrayList<Integer> list, int l, int h) {

        if (l == h) {
            if (list.get(l) == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            int middle = (l + h) / 2;
            int max1 = antalNulCount(list, l, middle);
            int max2 = antalNulCount(list, middle + 1, h);
            return max1 + max2;
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(1);
        list.add(15);

        System.out.println(antalNul(list));
    }

}
