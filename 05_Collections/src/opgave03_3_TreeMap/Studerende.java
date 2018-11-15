package opgave03_3_TreeMap;

import java.util.HashSet;

public class Studerende implements Comparable<Studerende> {
    private int studieNr;
    private String navn;
    private HashSet<Integer> karakterer;

    public Studerende(int studieNr, String navn) {
        this.studieNr = studieNr;
        this.navn = navn;
        this.karakterer = new HashSet<>();
    }

    public int getStudieNr() {
        return studieNr;
    }

    public String getNavn() {
        return navn;
    }

    public HashSet<Integer> getKarakterer() {
        return karakterer;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void addKarakter(int karakter) {
        this.karakterer.add(karakter);
    }

    public double getGennemsnit() {
        double sum = 0;
        for (Integer i : this.karakterer) {
            sum += i;
        }
        return sum / this.karakterer.size();
    }

    @Override
    public String toString() {
        return "Navn: " + navn + " StudieNr: " + this.studieNr + "\n";
    }

    @Override
    public int compareTo(Studerende o) {
        if (this.studieNr == o.studieNr) {
            return this.navn.compareTo(o.navn);
        }
        return Integer.compare(studieNr, o.studieNr);
    }
}
