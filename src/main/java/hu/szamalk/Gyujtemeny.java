package hu.szamalk;

import hu.szamalk.modell.Media;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Gyujtemeny implements Iterable {
    private int ferohely;
    private ArrayList<Media> mediaLista;

    public Gyujtemeny(ArrayList<Media> mediaLista)  {
        this.ferohely = 5;
        this.mediaLista = new ArrayList<Media>(ferohely);
    }

    public int getFerohely() {
        return ferohely;
    }

    public void setFerohely(int ferohely) {
        this.ferohely = ferohely;
    }

    public void eladas(int db){
        if(this.ferohely-db>=0 && this.ferohely-db<=5){
            this.ferohely-=db;
        }else{
            throw new RuntimeException("Nincs elég Média!");
        }
    }

    public void vetel(int db){
        if(this.ferohely+db<=5 && this.ferohely+db>=0){
            this.ferohely+=db;
        }else{
            throw new RuntimeException("Nincs elég férőhely!");
        }
    }

    @Override
    public String toString() {
        return "Gyujtemeny{" +
                "ferohely=" + ferohely +
                '}';
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
