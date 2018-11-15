package opgave5;

public class ElArtikel extends Vare {
    private double averagePowerConsumptionPerHour;
    private IVat vat = new ElArtikelVat();

    public ElArtikel(double price, String name, String description, double averagePowerConsumptionPerHour) {
        super(price, name, description);
        this.averagePowerConsumptionPerHour = averagePowerConsumptionPerHour;
        // TODO Auto-generated constructor stub
    }

    public double getAveragePowerConsumptionPerHour() {
        return averagePowerConsumptionPerHour;
    }

    public void setAveragePowerConsumptionPerHour(double averagePowerConsumptionPerHour) {
        this.averagePowerConsumptionPerHour = averagePowerConsumptionPerHour;
    }

    @Override
    public double getPricePlusVAT() {
        return vat.getPricePlusVAT(super.getPrice());

    }
}
