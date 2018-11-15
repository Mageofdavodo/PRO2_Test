package opgave02;

public class MainApp {

    public static void main(String[] args) {
        Counter.getCounter();

        Counter.getCounter().count();

        System.out.println(Counter.getCounter().getValue());
        Counter.getCounter().count();
        Counter.getCounter().times2();
        System.out.println(Counter.getCounter().getValue());
        Counter.getCounter().zero();
        System.out.println(Counter.getCounter().getValue());

    }

}
