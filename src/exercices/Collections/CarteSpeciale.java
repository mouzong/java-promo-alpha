package exercices.Collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CarteSpeciale extends Carte{


    @Override
    public void afficheDetail(Collection collection) {
        Iterator<String> listcn=collection.iterator();
        while(listcn.hasNext()) {
            System.out.println(listcn.next());
        }
    }

    @Override
    public String toString() {
        return "CarteSpeciale{" +
                "couleur='" + couleur + '\'' +
                ", valeur='" + valeur + '\'' +
                '}';
    }
}
