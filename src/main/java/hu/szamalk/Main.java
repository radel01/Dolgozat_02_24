package hu.szamalk;

import hu.szamalk.modell.Kategoria;
import hu.szamalk.modell.Media;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Kategoria k1=new Kategoria("krimi");
        Kategoria k2=new Kategoria("dráma");

        ArrayList<Media> mediaLista = new ArrayList<>();
        mediaLista.add(new Media(UUID.randomUUID(), 2300, k1));
        mediaLista.add(new Media(UUID.randomUUID(), 3500, k2));
        mediaLista.add(new Media(UUID.randomUUID(), 5000, k2));
        mediaLista.add(new Media(UUID.randomUUID(), 4500, k1));
        mediaLista.add(new Media(UUID.randomUUID(), 2000, k2));
        Gyujtemeny gy1= new Gyujtemeny(mediaLista);
        System.out.println(gy1);
        gy1.eladas(1);
        System.out.println(gy1);
        gy1.vetel(3);
        System.out.println(gy1);

        private void szerializacio(){
            try(ObjectOutputStream objKi = new ObjectOutputStream(new FileOutputStream("gyujtemeny.ser"))){
                objKi.writeObject(gy1);}
            catch (IOException e){
                throw new RuntimeException();

            }
        }


    }

}