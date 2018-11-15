// af Michael Kragelund
package models;

public class PraktikOpgave {
    private String navn;
    private int semester;
    private PraktikVirksomhed virksomhed;

    public PraktikOpgave(String navn, int semester) {
        this.navn = navn;
        this.semester = semester;

    }

    public String getNavn() {
        return navn;
    }

    public int getSemester() {
        return semester;
    }

    public PraktikVirksomhed getVirksomhed() {
        return virksomhed;
    }
}
