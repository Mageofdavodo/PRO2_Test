package opgave03_Comparable;

import java.util.LinkedList;

public class Skole {

    private String navn;
    private LinkedList<Studerende> studerendeList;

    public Skole(String navn) {
        this.navn = navn;
        studerendeList = new LinkedList<>();

    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende s) {
        this.studerendeList.add(s);
    }

    public void removeStuderende(Studerende s) {
        this.studerendeList.remove(s);
    }

    public double gennemsnit() {
        double sum = 0;
        for (Studerende s : this.studerendeList) {
            sum += s.getGennemsnit();
        }
        return sum / this.studerendeList.size();
    }

    public Studerende findStuderende(int studieNr) {
        for (Studerende s : this.studerendeList) {
            if (studieNr == s.getStudieNr()) {
                return s;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return getNavn() + "\n" + studerendeList;

    }

}
