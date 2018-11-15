package model;

import java.util.ArrayList;

public class Kunde {

    private String navn;
    private ArrayList<BogTitel> bogtitler = new ArrayList<>();

    public Kunde(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void addBog(BogTitel bog) {
        this.bogtitler.add(bog);
    }

    public ArrayList<BogTitel> getBogtitler() {
        return bogtitler;
    }

}
