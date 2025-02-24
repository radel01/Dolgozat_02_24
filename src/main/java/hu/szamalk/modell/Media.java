package hu.szamalk.modell;

import java.io.Serializable;
import java.util.UUID;

public class Media implements Serializable {
    private UUID ID;
    private Integer ar;
    private Kategoria kategoria;

    public Media(UUID ID, Integer ar, Kategoria kategoria) {
        this.ID = ID;
        this.ar = ar;
        this.kategoria = kategoria;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }

    public Integer getAr() {
        return ar;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public void setAr(Integer ar) {
        this.ar = ar;
    }

    public void setKategoria(Kategoria kategoria) {
        this.kategoria = kategoria;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
