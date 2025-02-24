package hu.szamalk.modell;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class KonyvTest {
    @Test
    void testRovidNev(){
        Konyv konyv=new Konyv(UUID.randomUUID(), 2300, new Kategoria("krimi"), "Cim", "J.K.Rowling", 1997);


    }

}