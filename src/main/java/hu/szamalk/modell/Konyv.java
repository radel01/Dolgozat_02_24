package hu.szamalk.modell;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.Collator;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

public class Konyv extends Media implements Cloneable, Comparable<Konyv>, Serializable {
    private String cim;
    private String szerzo;
    private Integer kiadasiEve;

    public Konyv(UUID ID, Integer ar, Kategoria kategoria, String cim, String szerzo, Integer kiadasiEve) {
        super(ID, ar, kategoria);
        this.cim = cim;
        this.szerzo = szerzo;
        this.kiadasiEve = kiadasiEve;
        rovidCim();
    }

    public String getCim() {
        return cim;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public Integer getKiadasiEve() {
        return kiadasiEve;
    }

    public void setKiadasiEve(Integer kiadasiEve) {
        this.kiadasiEve = kiadasiEve;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }

    public void setCim(String cim) {
        this.cim = cim;
        rovidCim();
    }

    public void rovidCim(){
        if(cim.length()<6){
            throw new NemLetezoKonyvException("túl rövid cím");
        }
    }


    @Override
    public int compareTo(Konyv o) {
        return this.cim.compareTo(o.cim);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Konyv konyv = (Konyv) o;
        return Objects.equals(cim, konyv.cim) && Objects.equals(szerzo, konyv.szerzo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cim, szerzo);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
//
}
