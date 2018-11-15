// Af Michael Kragelund
package models;

public class AnalyseOpgave extends PraktikOpgave {

    private String analyseModel;

    public AnalyseOpgave(String navn, int semester, PraktikVirksomhed virksomhed, String analyseModel) {
        super(navn, semester);
        this.analyseModel = analyseModel;

    }

    @Override
    public String toString() {
        return super.getNavn() + " " + super.getSemester() + " " + this.analyseModel;

    }

}
