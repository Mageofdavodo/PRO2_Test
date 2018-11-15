package opgave02;

public class Counter {

    private static Counter unikCounter;
    private int value;

    private Counter() {
        value = 0;
    }

    public static Counter getCounter() {
        if (unikCounter == null) {
            unikCounter = new Counter();
        }
        return unikCounter;
    }

    public void count() {
        value++;
    }

    public void times2() {
        value *= 2;
    }

    public void zero() {
        value = 0;
    }

    public int getValue() {
        return value;
    }
}
