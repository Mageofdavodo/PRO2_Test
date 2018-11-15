package opgave04_Comparator;

import java.util.TreeSet;

public class Skole {

    private String navn;
    private TreeSet<Studerende> studerendeList;

    public TreeSet<Studerende> getStuderendeList() {
        return studerendeList;
    }

    public Skole(String navn) {
        this.navn = navn;
        studerendeList = new TreeSet<>();

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
