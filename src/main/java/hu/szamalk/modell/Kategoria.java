package hu.szamalk.modell;

import java.io.Serializable;

public class Kategoria implements Serializable{
    private String leiras;

    public Kategoria(String leiras) {
        this.leiras = leiras;
    }

    public String getLeiras() {
        return leiras;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }
    //
}
