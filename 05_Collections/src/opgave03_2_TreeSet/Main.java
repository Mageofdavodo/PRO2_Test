package opgave03_2_TreeSet;

public class Main {

    public static void main(String[] args) {
        Skole skole = new Skole("Skolen skole");
        Studerende s1 = new Studerende(1, "Torben");
        Studerende s2 = new Studerende(2, "Michael");
        Studerende s3 = new Studerende(3, "Kennet");
        Studerende s4 = new Studerende(4, "Peter");
        s1.addKarakter(12);
        s1.addKarakter(7);
        s2.addKarakter(2);
        s2.addKarakter(4);
        s3.addKarakter(7);
        s3.addKarakter(7);
        s4.addKarakter(12);
        s4.addKarakter(10);

        skole.addStuderende(s1);
        skole.addStuderende(s2);
        skole.addStuderende(s3);
        skole.addStuderende(s4);

        System.out.println(skole);
        System.out.println("Gennemsnit " + skole.gennemsnit());

        System.out.println("Finder Michael med studieNr 2: " + skole.findStuderende(2));
    }

}
