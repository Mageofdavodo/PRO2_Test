package opgave_03_PrefixMetode;

public class MainApp {
    public static double[] prefixAverage(int[] inputTal) {
        double[] prefixArray = new double[inputTal.length];
        double sum = 0;
        for (int i = 0; i < inputTal.length; i++) {
            sum += inputTal[i];
            prefixArray[i] = sum / (i + 1);
        }
        return prefixArray;
    }

    public static void main(String[] args) {
        int[] inputTal = { 5, 10, 5, 6, 4, 9, 8 };
        for (int i = 0; i < inputTal.length; i++) {
            System.out.println(prefixAverage(inputTal)[i]);
        }
    }

}
