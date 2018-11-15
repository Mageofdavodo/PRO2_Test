// Af Michael Kragelund

package gui;

import java.time.LocalDate;

import models.PraktikKontrakt;
import models.PraktikVirksomhed;
import service.Service;

public class App {

    public static void main(String[] args) {
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

        vestas.skrivTilFilKontrakter();

        System.out.println(vestas.getKontrakter());
        System.out.println(vestas.sorterKontrakter());
        System.out.println();

        System.out.println(vestas.getTotalAntalUgentligeTimerIPeriode(LocalDate.parse("2018-01-01"),
                LocalDate.parse("2019-01-01")));
        System.out.println(vestas.getTotalAntalUgentligeTimerIPeriode(LocalDate.parse("2018-01-01"),
                LocalDate.parse("2018-04-07")));
        System.out.println();

        System.out.println(Service.getEfterTragtetSemesterVirksomhed(5));
        System.out.println(Service.getEfterTragtetSemesterVirksomhed(3));

    }

}
