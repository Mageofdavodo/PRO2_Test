package model;

import java.util.ArrayList;
import java.util.Observable;

public class BogTitel extends Observable {

    private String titel;
    private int antal;
    private ArrayList<Kunde> kunder = new ArrayList<>();

    public BogTitel(String titel, int antal) {
        this.titel = titel;
        this.antal = antal;
    }

    public String getTitel() {
        return titel;
    }

    public int getAntal() {
        return antal;
    }

    public void addKunde(Kunde k) {
        this.kunder.add(k);
    }

    public void indkoebTilLager(int antal) {
        this.antal += antal;
    }

    public void etKoeb(Kunde k) {
        addKunde(k);
        k.addBog(this);
        antal--;
        setChanged();
        notifyObservers();
    }

    public ArrayList<Kunde> getKunder() {
        return kunder;
    }

}
