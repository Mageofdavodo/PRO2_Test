package opgave5;

public class SpiritusVat implements IVat {

    @Override
    public double getPricePlusVAT(double price) {
        if (price <= 90) {
            return price * 1.8;
        } else {
            return price * 2.2;
        }
    }

}
