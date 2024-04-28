package collections.exo7;

import java.util.Collection;
import java.util.Iterator;

public class CarteNormale extends Carte{
    public CarteNormale() {
        super();
    }

    public CarteNormale(String valeur, String couleur) {
        super(valeur, couleur);
    }

    @Override
    public void afficherDetails() {
        System.out.println("\n\t Carte Normale - Valeur : "+valeur+", Couleur : "+couleur);
    }

    @Override
    public void afficherListe(Collection collection) {
        Iterator<CarteNormale> it = collection.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Override
    public String toString() {
        return "CarteNormale{" +
                "valeur='" + valeur + '\'' +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
