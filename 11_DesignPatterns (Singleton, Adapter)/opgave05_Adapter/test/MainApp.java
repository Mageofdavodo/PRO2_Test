package test;

import model.ElVare;
import model.FoedeVare;
import model.Spiritus;
import model.SpiritusAdapter;

public class MainApp {

    public static void main(String[] args) {
        ElVare elVare = new ElVare(80, "ps4");
        System.out.println(elVare.beregnMoms());

        FoedeVare foedeVare = new FoedeVare(90, "Pasta");
        System.out.println(foedeVare.beregnMoms());

        Spiritus spiritus = new Spiritus(120, "Vodka");
        SpiritusAdapter adapter = new SpiritusAdapter(spiritus);
        System.out.println(adapter.beregnMoms());

    }

}
