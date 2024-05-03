package exercices.Collections;

import java.util.*;

public class CarteNormale extends Carte{

    @Override
    public void afficheDetail(Collection collection) {
        Iterator<String> listcn=collection.iterator();
        while(listcn.hasNext()) {
            System.out.println(listcn.next());
        }
    }

    public CarteNormale() {
    }

    @Override
    public String toString() {
        return "CarteNormale{" +
                "couleur='" + couleur + '\'' +
                ", valeur='" + valeur + '\'' +
                '}';
    }
}
