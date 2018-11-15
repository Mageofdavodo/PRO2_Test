package model;

public class SpiritusAdapter extends Vare {

    private Spiritus spiritus;

    public SpiritusAdapter(Spiritus spiritus) {
        super(spiritus.getPris(), spiritus.getBetegnelse());
        this.spiritus = spiritus;
        // TODO Auto-generated constructor stub
    }

    @Override
    public double beregnMoms() {

        return spiritus.hentMoms();
    }

    @Override
    public String getNavn() {
        return this.spiritus.getBetegnelse();
    }

    @Override
    public int getPris() {
        return this.spiritus.getPris();
    }

}
