package opgave5;

import java.time.LocalDate;

public class Fødevare extends Vare {
    private LocalDate lastUsageDate;
    private IVat vat = new FødevareVat();

    public Fødevare(double price, String name, String description, LocalDate lastUsageDate) {
        super(price, name, description);
        this.lastUsageDate = lastUsageDate;
        // TODO Auto-generated constructor stub
    }

    public LocalDate getLastUsageDate() {
        return lastUsageDate;
    }

    public void setLastUsageDate(LocalDate lastUsageDate) {
        this.lastUsageDate = lastUsageDate;
    }

    @Override
    public double getPricePlusVAT() {
        return vat.getPricePlusVAT(super.getPrice());
    }
}
