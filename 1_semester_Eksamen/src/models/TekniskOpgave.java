// af Michael Kragelund
package models;

public class TekniskOpgave extends PraktikOpgave {

    private String programmeringsSprog;

    public TekniskOpgave(String navn, int semester, PraktikVirksomhed virksomhed, String programmeringsSprog) {
        super(navn, semester);
        this.programmeringsSprog = programmeringsSprog;

    }

    @Override
    public String toString() {
        return super.getNavn() + " " + super.getSemester() + " " + this.programmeringsSprog;

    }

}
