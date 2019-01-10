package model;

public class UdvidelsesesPakke extends TimePakke {

	private double plusPris;

	public UdvidelsesesPakke(double mndPris, double minutPris, int fireTimer, double plusPris) {
		super(mndPris, minutPris, fireTimer);
		this.plusPris = plusPris;

	}

	@Override
	public double abonnementsPris() {
		return super.abonnementsPris() + this.plusPris;
	}

}
