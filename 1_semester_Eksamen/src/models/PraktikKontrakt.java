// af Michael Kragelund
package models;

import java.time.LocalDate;

public class PraktikKontrakt implements Comparable<PraktikKontrakt> {
    private String opgavebeskrivelse;
    private int timerPerUge;
    private LocalDate periodeStart;
    private LocalDate periodeSlut;
    private PraktikVirksomhed virksomhed;

    public PraktikKontrakt(String opgavebeskrivelse, int timerPerUge, LocalDate periodeStart, LocalDate periodeSlut) {
        this.opgavebeskrivelse = opgavebeskrivelse;
        this.timerPerUge = timerPerUge;
        this.periodeSlut = periodeSlut;
        this.periodeStart = periodeStart;
    }

    public PraktikVirksomhed getVirksomhed() {
        return virksomhed;
    }

    public void setVirksomhed(PraktikVirksomhed virksomhed) {
        this.virksomhed = virksomhed;
    }

    @Override
    public String toString() {
        return this.opgavebeskrivelse + " Timer per uge: " + this.timerPerUge + " " + this.periodeStart.toString() + " "
                + this.periodeSlut.toString();
    }

    public String getOpgavebeskrivelse() {
        return opgavebeskrivelse;
    }

    public int getTimerPerUge() {
        return timerPerUge;
    }

    public LocalDate getPeriodeStart() {
        return periodeStart;
    }

    public LocalDate getPeriodeSlut() {
        return periodeSlut;
    }

    @Override
    public int compareTo(PraktikKontrakt o) {
        if (this.periodeStart.compareTo(o.getPeriodeStart()) == 0) {
            return this.opgavebeskrivelse.compareTo(o.getOpgavebeskrivelse());
        } else {
            return this.periodeStart.compareTo(o.getPeriodeStart());
        }
    }
}
