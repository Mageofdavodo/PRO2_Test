package opgave5;

public class VatVare implements IVat {

    @Override
    public double getPricePlusVAT(double price) {

        return price * 1.25;
    }

}
