package opgave_p12_9;

public class Main {

    public static String reverseString(String str) {
        return reverse(str, "", 0);
    }

    public static String reverse(String str, String rev, int index) {
        if (index > str.length() - 1) {
            return rev;
        }

        rev = str.charAt(index) + rev;

        return reverse(str, rev, index + 1);
    }

    public static void main(String[] args) {
        String s = "Fisk";
        System.out.println(reverseString(s));

    }

}
