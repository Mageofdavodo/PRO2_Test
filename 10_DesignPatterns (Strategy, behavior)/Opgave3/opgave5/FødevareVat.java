package opgave5;

public class FødevareVat implements IVat {

    @Override
    public double getPricePlusVAT(double price) {

        return price * 1.05;
    }

}
