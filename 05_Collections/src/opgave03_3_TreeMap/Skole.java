package opgave03_3_TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class Skole {

    private String navn;
    private TreeMap<Integer, Studerende> studerendeList;

    public Skole(String navn) {
        this.navn = navn;
        studerendeList = new TreeMap<>();

    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende s) {
        this.studerendeList.put(s.getStudieNr(), s);
    }

    public void removeStuderende(Studerende s) {
        this.studerendeList.remove(s.getStudieNr(), s);
    }

    public double gennemsnit() {
        double sum = 0;
        Set<Integer> keySet = this.studerendeList.keySet();
        for (Integer i : keySet) {
            sum += studerendeList.get(i).getGennemsnit();
        }
        return sum / this.studerendeList.size();
    }

    public Studerende findStuderende(int studieNr) {
        Set<Integer> keySet = this.studerendeList.keySet();
        for (Integer i : keySet) {
            if (studieNr == this.studerendeList.get(i).getStudieNr()) {
                return this.studerendeList.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return getNavn() + "\n" + studerendeList;

    }

}
