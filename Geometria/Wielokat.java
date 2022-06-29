package Geometria;

import Geometria.Figura;

public class Wielokat extends Figura {

    public Wielokat(int pole, int obwod) {
        super(pole, obwod);
    }

    public Wielokat() {
        super();
    }

    @Override
    public int getPole() {
        return super.getPole();
    }

    @Override
    public void setPole(int pole) {
        super.setPole(pole);
    }

    @Override
    public int getObwod() {
        return super.getObwod();
    }

    @Override
    public void setObwod(int obwod) {
        super.setObwod(obwod);
    }

    @Override
    void rysuj() {
        super.rysuj();
    }

    @Override
    void usun() {
        super.usun();
    }

    @Override
    void przesun() {
        super.przesun();
    }

    @Override
    String podajParametry() {
        return super.podajParametry();
    }
}
