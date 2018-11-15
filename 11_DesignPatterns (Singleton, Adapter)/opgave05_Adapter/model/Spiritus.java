package model;

public class Spiritus {
    private int pris;
    private String betegnelse;

    public Spiritus(int pris, String betengelse) {
        this.pris = pris;
        this.betegnelse = betengelse;
    }

    public double hentMoms() {
        if (getPris() < 90) {
            return (getPris() / 100.0) * 80.0;
        } else {
            return (getPris() / 100.0) * 120.0;
        }
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public String getBetegnelse() {
        return betegnelse;
    }

    public void setBetegnelse(String betegnelse) {
        this.betegnelse = betegnelse;
    }

}
