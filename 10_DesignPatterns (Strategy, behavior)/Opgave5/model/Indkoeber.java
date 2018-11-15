package model;

import java.util.Observable;
import java.util.Observer;

public class Indkoeber implements Observer {

    private String navn;

    public Indkoeber(String navn) {
        this.navn = navn;
    }

    @Override
    public void update(Observable o, Object arg) {
        BogTitel b = (BogTitel) o;
        if (b.getAntal() < 6) {
            System.out.println("Der bestilles 10 bøger af: " + b.getTitel());
            b.indkoebTilLager(10);
        }

    }

    public String getNavn() {
        return navn;
    }

}
