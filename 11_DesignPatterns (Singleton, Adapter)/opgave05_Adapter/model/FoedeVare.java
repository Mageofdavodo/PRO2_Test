package model;

public class FoedeVare extends Vare {

    public FoedeVare(int pris, String navn) {
        super(pris, navn);
    }

    @Override
    public double beregnMoms() {

        return (getPris() / 100.0) * 5.0;
    }

}
