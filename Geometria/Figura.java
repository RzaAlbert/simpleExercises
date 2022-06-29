package Geometria;

import groovy.json.JsonToken;

import java.awt.*;

public class Figura {
    protected int pole;
    protected int obwod;

    public Figura(int pole, int obwod) {
        this.pole = pole;
        this.obwod = obwod;
    }

    public Figura() {
    }

    public int getPole() {
        return pole;
    }

    public void setPole(int pole) {
        this.pole = pole;
    }

    public int getObwod() {
        return obwod;
    }

    public void setObwod(int obwod) {
        this.obwod = obwod;
    }

    void rysuj() {
        System.out.println("trwa rysowanie");
    }

    void usun() {
        System.out.println("trwa usuwanie");
    }

    void przesun() {
        System.out.println("trwa przesuwanie");
    }

    String podajParametry() {
       return "Podaj parametry";

    }


}

