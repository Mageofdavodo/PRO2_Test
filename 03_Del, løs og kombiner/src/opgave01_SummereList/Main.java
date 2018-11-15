package opgave01_SummereList;

import java.util.ArrayList;

public class Main {
    public static int Sum(ArrayList<Integer> list) {
        return SumCount(list, 0, list.size() - 1);
    }

    private static int SumCount(ArrayList<Integer> list, int l, int h) {

        if (l == h) {
            return list.get(l);
        } else {
            int middle = (l + h) / 2;
            int max1 = SumCount(list, l, middle);
            int max2 = SumCount(list, middle + 1, h);
            return max1 + max2;
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(15);

        System.out.println(Sum(list));
    }

}
