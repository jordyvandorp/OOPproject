package com.jordehhh.OOP;

public class Vakje {

    //private Muur muur;
    private boolean exit;

    public Vakje (String typeVakje, int locatie, boolean muur, boolean exit){

       // this.muur = muur;
        this.exit = exit;
    }




    /*public boolean isMuur() {
        return muur;
    }

    public void setMuur(boolean muur) {
        this.muur = muur;
    }*/

    public boolean isExit() {
        return exit;
    }

    public void setExit(boolean exit) {
        this.exit = exit;
    }
}
