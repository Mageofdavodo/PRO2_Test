//af Michael Kragelund
package storage;

import java.util.ArrayList;

import models.PraktikKontrakt;
import models.PraktikVirksomhed;

public class Storage {
    private static ArrayList<PraktikVirksomhed> virksomheder = new ArrayList<>();
    private static ArrayList<PraktikKontrakt> kontrakter = new ArrayList<>();

    public static ArrayList<PraktikVirksomhed> getVirksomheder() {
        return new ArrayList<>(virksomheder);
    }

    public static ArrayList<PraktikKontrakt> getKontrakter() {
        return new ArrayList<>(kontrakter);
    }

    public static void addVirksomhed(PraktikVirksomhed virksomhed) {
        virksomheder.add(virksomhed);
    }

    public static void addKontrakt(PraktikKontrakt kontrakt) {
        kontrakter.add(kontrakt);
    }

}
