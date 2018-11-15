package model;

public class NumberEvaluator implements Evaluator {

    @Override
    public boolean isValid(String s) {
        try {
            double tal = Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            e.getMessage();
        }

        return false;
    }

}
