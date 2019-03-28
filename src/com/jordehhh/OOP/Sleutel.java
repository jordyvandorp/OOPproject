package com.jordehhh.OOP;

public class Sleutel {
    private int locatie;
    private int waarde;

    public Sleutel (int locatie, int waarde){
        this.locatie = locatie;
        this.waarde = waarde;
    }

    public int getLocatie() {
        return locatie;
    }

    public void setLocatie(int locatie) {
        this.locatie = locatie;
    }

    public int getWaarde() {
        return waarde;
    }

    public void setWaarde(int waarde) {
        this.waarde = waarde;
    }
}
