// af Michael Kragelund
package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;

public class PraktikVirksomhed {
    private String navn;
    private String feedback;
    private String kontaktPerson;
    private ArrayList<PraktikOpgave> opgaver = new ArrayList<>();
    private ArrayList<PraktikKontrakt> kontrakter = new ArrayList<>();

    public PraktikVirksomhed(String navn, String feedback, String kontaktPerson) {
        this.navn = navn;
        this.feedback = feedback;
        this.kontaktPerson = kontaktPerson;
    }

    public void addOpgave(PraktikOpgave opgave) {
        opgaver.add(opgave);
    }

    public void addKontrakt(PraktikKontrakt kontrakt) {
        kontrakter.add(kontrakt);
    }

    public String getNavn() {
        return navn;
    }

    public String getFeedback() {
        return feedback;
    }

    public String getKontaktPerson() {
        return kontaktPerson;
    }

    public ArrayList<PraktikOpgave> getOpgaver() {
        return opgaver;
    }

    public ArrayList<PraktikKontrakt> getKontrakter() {
        return kontrakter;
    }

    public void skrivTilFilKontrakter() {
        File file = new File(navn + ".txt");

        try {
            PrintWriter pw = new PrintWriter(file);
            pw.write(navn + " kontraker: \r\n");
            pw.write("\r\n");
            for (PraktikKontrakt kon : kontrakter) {
                pw.write(kon.toString() + "\r\n");
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }

    public ArrayList<PraktikKontrakt> sorterKontrakter() {
        // SelectionSort

        ArrayList<PraktikKontrakt> konSorted = this.kontrakter;
        int n = konSorted.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (konSorted.get(i).compareTo(konSorted.get(j)) > 0) {
                    PraktikKontrakt temp = konSorted.get(j);
                    konSorted.set(j, konSorted.get(i));
                    konSorted.set(i, temp);
                }
            }
        }

        return konSorted;
    }

    public int getTotalAntalUgentligeTimerIPeriode(LocalDate start, LocalDate slut) {
        int antal = 0;
        for (PraktikKontrakt kon : this.kontrakter) {
            if (kon.getPeriodeStart().isAfter(start) && kon.getPeriodeSlut().isBefore(slut)) {
                antal += kon.getTimerPerUge();
            }
        }

        return antal;
    }

    public int antalOpgaverISemester(int semester) {
        int antal = 0;
        for (PraktikOpgave opgave : this.opgaver) {
            if (opgave.getSemester() == semester) {
                antal++;
            }
        }

        return antal;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void setKontaktPerson(String kontaktPerson) {
        this.kontaktPerson = kontaktPerson;
    }

    @Override
    public String toString() {
        return navn + " " + feedback + " " + kontaktPerson;
    }
}
