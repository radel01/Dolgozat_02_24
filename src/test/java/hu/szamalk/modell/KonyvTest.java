package java.hu.szamalk.modell;

import hu.szamalk.modell.Kategoria;
import hu.szamalk.modell.Konyv;
import hu.szamalk.modell.NemLetezoKonyvException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

class KonyvTest {
    @Test
    void testRovidNev(){
        Konyv konyv=new Konyv(UUID.randomUUID(), 2300, new Kategoria("krimi"), "Cim", "J.K.Rowling", 1997);

        Assertions.assertThrows(new NemLetezoKonyvException("túl rövid cím"), true);

    }
    //
}