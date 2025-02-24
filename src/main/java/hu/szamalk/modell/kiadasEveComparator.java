package hu.szamalk.modell;

import java.text.Collator;
import java.util.Comparator;

public class kiadasEveComparator implements Comparator<Konyv> {
    @Override
    public int compare(Konyv o1, Konyv o2) {
        Collator c=Collator.getInstance();
        return c.compare(o1.getKiadasiEve(), o2.getKiadasiEve());
    }
}
