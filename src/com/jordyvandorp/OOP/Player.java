package com.jordyvandorp.OOP;

public class Player {
    private int huidigeLocatieX;
    private int huidigeLocatieY;
    private int sleutelInBezit;

    public Player(int huidigeLocatieX, int huidigeLocatieY, int sleutelInBezit){
        this.huidigeLocatieX = huidigeLocatieX;
        this.sleutelInBezit = sleutelInBezit;
        this.huidigeLocatieY = huidigeLocatieY;
    }


    public int getHuidigeLocatieX() {
        return huidigeLocatieX;
    }

    public void setHuidigeLocatieX(int huidigeLocatieX) {
        this.huidigeLocatieX = huidigeLocatieX;
    }

    public int getSleutelInBezit() {
        return sleutelInBezit;
    }

    public void setSleutelInBezit(int sleutelInBezit) {
        this.sleutelInBezit = sleutelInBezit;
    }

    public int getHuidigeLocatieY() {
        return huidigeLocatieY;
    }

    public void setHuidigeLocatieY(int huidigeLocatieY) {
        this.huidigeLocatieY = huidigeLocatieY;
    }
}
