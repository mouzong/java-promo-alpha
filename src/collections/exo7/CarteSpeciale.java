package collections.exo7;

import java.util.Collection;
import java.util.Iterator;

public class CarteSpeciale extends Carte{
    public CarteSpeciale() {
        super();
    }

    public CarteSpeciale(String valeur, String couleur) {
        super(valeur, couleur);
    }

    @Override
    public void afficherDetails() {
        System.out.println("\n\t Carte Speciale - Valeur : "+valeur+", Couleur : "+couleur);

    }

    @Override
    public void afficherListe(Collection collection) {
        Iterator<CarteSpeciale> it = collection.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Override
    public String toString() {
        return "CarteSpeciale{" +
                "valeur='" + valeur + '\'' +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
