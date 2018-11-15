// af Michael Kragelund
package service;

import java.time.LocalDate;
import java.util.ArrayList;

import models.AnalyseOpgave;
import models.PraktikKontrakt;
import models.PraktikOpgave;
import models.PraktikVirksomhed;
import models.TekniskOpgave;
import storage.Storage;

public class Service {

    public static PraktikVirksomhed createPraktikVirksomhed(String navn, String feedback, String kontaktPerson) {
        PraktikVirksomhed virksomhed = new PraktikVirksomhed(navn, feedback, kontaktPerson);
        Storage.addVirksomhed(virksomhed);
        return virksomhed;
    }

    public static PraktikKontrakt createPraktikKontrakt(String opgavebeskrivelse, int timerPerUge,
            LocalDate periodeStart, LocalDate periodeSlut) {
        PraktikKontrakt kontrakt = new PraktikKontrakt(opgavebeskrivelse, timerPerUge, periodeStart, periodeSlut);
        Storage.addKontrakt(kontrakt);
        return kontrakt;
    }

    public static AnalyseOpgave createAnalyseOpgave(String navn, int semester, PraktikVirksomhed virksomhed,
            String analyseModel) {
        AnalyseOpgave opgave = new AnalyseOpgave(navn, semester, virksomhed, analyseModel);
        virksomhed.addOpgave(opgave);
        return opgave;
    }

    public static TekniskOpgave createTekniskOpgave(String navn, int semester, PraktikVirksomhed virksomhed,
            String programmeringsSprog) {
        TekniskOpgave opgave = new TekniskOpgave(navn, semester, virksomhed, programmeringsSprog);
        virksomhed.addOpgave(opgave);
        return opgave;
    }

    public static void updatePraktikVirksomhed(String navn, String feedback, String kontaktPerson,
            PraktikVirksomhed virksomhed) {
        virksomhed.setNavn(navn);
        virksomhed.setFeedback(feedback);
        virksomhed.setKontaktPerson(kontaktPerson);
    }

    public static void addVirksomhedtoKontrakt(PraktikVirksomhed virksomhed, PraktikKontrakt kontrakt) {
        kontrakt.setVirksomhed(virksomhed);
        virksomhed.addKontrakt(kontrakt);
    }

    public static ArrayList<PraktikVirksomhed> getVirksomheder() {
        return Storage.getVirksomheder();
    }

    public static ArrayList<PraktikKontrakt> getKontrakter() {
        return Storage.getKontrakter();
    }

    public static String getEfterTragtetSemesterVirksomhed(int semester) {
        String virksomhedNavn = "";
        int max = 0;
        int temp = 0;

        for (PraktikVirksomhed virksomhed : Service.getVirksomheder()) {
            temp = 0;
            for (PraktikOpgave opgave : virksomhed.getOpgaver()) {
                if (opgave.getSemester() == semester) {
                    temp++;
                }
            }
            if (max < temp) {
                max = temp;
                virksomhedNavn = virksomhed.getNavn();
            }

        }
        return virksomhedNavn;

    }

    public static void initStorage() {

        PraktikVirksomhed vestas = Service.createPraktikVirksomhed("Vestas", "Godt miljø", "Peter Justesen");
        PraktikVirksomhed nilfisk = Service.createPraktikVirksomhed("Nilfisk", "Udfordende", "Peter Justesen");
        PraktikVirksomhed power = Service.createPraktikVirksomhed("POWER", "Energisk", "Margrethe Dybdahl");

        PraktikKontrakt k1 = Service.createPraktikKontrakt("Tester", 37, LocalDate.parse("2018-07-01"),
                LocalDate.parse("2018-09-16"));
        PraktikKontrakt k2 = Service.createPraktikKontrakt("Udvikler", 27, LocalDate.parse("2018-03-14"),
                LocalDate.parse("2018-05-06"));
        PraktikKontrakt k3 = Service.createPraktikKontrakt("Programmør", 15, LocalDate.parse("2018-02-14"),
                LocalDate.parse("2018-06-06"));
        PraktikKontrakt k4 = Service.createPraktikKontrakt("Analytiker", 12, LocalDate.parse("2018-02-14"),
                LocalDate.parse("2018-04-06"));
        Service.addVirksomhedtoKontrakt(vestas, k1);
        Service.addVirksomhedtoKontrakt(nilfisk, k2);
        Service.addVirksomhedtoKontrakt(vestas, k3);
        Service.addVirksomhedtoKontrakt(vestas, k4);

        Service.createTekniskOpgave("Flowoptimering", 5, vestas, "Java");
        Service.createTekniskOpgave("Test i felten", 5, vestas, "C#");
        Service.createAnalyseOpgave("Risikoanalyse", 3, nilfisk, "MUST");
        Service.createTekniskOpgave("Simulering", 5, power, "Python");

    }
}
