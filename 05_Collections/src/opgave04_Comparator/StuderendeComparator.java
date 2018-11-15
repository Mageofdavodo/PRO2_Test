package opgave04_Comparator;

import java.util.Comparator;

public class StuderendeComparator implements Comparator<Studerende> {

    @Override
    public int compare(Studerende s1, Studerende s2) {
        if (s1.getStudieNr() == s2.getStudieNr()) {
            return s1.getNavn().compareTo(s2.getNavn());
        }
        return Integer.compare(s1.getStudieNr(), s1.getStudieNr());
    }
}
