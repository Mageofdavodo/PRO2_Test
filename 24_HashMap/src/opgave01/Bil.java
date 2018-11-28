package opgave01;

public class Bil {

	private String registreringsnummer;
	private String mærke;
	private String model;
	private String color;

	public Bil(String registreringsnummer, String mærke, String model, String color) {
		this.registreringsnummer = registreringsnummer;
		this.mærke = mærke;
		this.model = model;
		this.color = color;
	}

	public String getRegistreringsnummer() {
		return registreringsnummer;
	}

	public void setRegistreringsnummer(String registreringsnummer) {
		this.registreringsnummer = registreringsnummer;
	}

	public String getMærke() {
		return mærke;
	}

	public void setMærke(String mærke) {
		this.mærke = mærke;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {
		Bil bil = (Bil) obj;
		if (bil instanceof Bil) {
			if (registreringsnummer.equals(bil.registreringsnummer) && mærke.equals(bil.mærke)) {
				return true;
			}
		}

		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return registreringsnummer.hashCode() + mærke.hashCode();
	}

	public String toString() {
		return "registreringsnummer " + this.registreringsnummer + " Mærke: " + this.mærke + " model: " + this.model
				+ " farve: " + this.color + "\n";
	}

}
