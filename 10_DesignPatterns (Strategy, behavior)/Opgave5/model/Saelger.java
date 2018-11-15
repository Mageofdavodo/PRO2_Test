package model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Saelger implements Observer {

    private String navn;

    public Saelger(String navn) {
        this.navn = navn;
    }

    @Override
    public void update(Observable o, Object arg) {
        BogTitel b = (BogTitel) o;
        ArrayList<BogTitel> bogtitles = new ArrayList<>();
        bogtitles.add(b);
        if (bogtitles.size() >= 1) {
            System.out.println("Følgende kunder har også købt bøgerne: ");
        }
        for (Kunde k : b.getKunder()) {
            for (BogTitel bog : k.getBogtitler()) {
                if (!bogtitles.contains(bog)) {
                    bogtitles.add(bog);
                    System.out.println(bog.getTitel());
                }

            }
        }
    }

    public String getNavn() {
        return navn;
    }

}
