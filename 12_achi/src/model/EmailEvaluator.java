package model;

public class EmailEvaluator implements Evaluator {

    @Override
    public boolean isValid(String s) {
        String atChar = "@";
        if (s.contains(atChar)) {
            int at = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '@') {
                    at = i;
                }
            }
            if (at != 0 && at < s.length() - 1 && s.charAt(s.length() - 1) != '.') {
                return true;
            }
        }
        return false;
    }

}
