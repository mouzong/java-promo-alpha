package collections.exo7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    /**
     *Exercice 7 : Simulation d'un jeu de cartes
     * Objectif : Utiliser l'abstraction, l'héritage et le polymorphisme pour simuler
     * un jeu de cartes.
     *
     * Créez une classe abstraite 'Carte' avec les attributs :
     * - valeur
     * - couleur
     * Implémentez deux classes, CarteNormale et CarteSpeciale, qui héritent de Carte.
     * Ajoutez des méthodes pour afficher les détails de chaque carte.
     *
     * - Vous allez créer une liste pour les cartes normale et une liste pour les cartes
     * speciales. La liste de carte speciale ne peut pas contenir des doublons.
     *
     * - vous devez implementer la methode afficherListe heritée de l'interface Carte pour
     * parcourrir et afficher toutes les cartes de chaque liste à l'aide des Iterators.@
     */
    public static void main(String[] args) {
        List<CarteNormale> carteNormaleList = new ArrayList<>();
        Set<CarteSpeciale> carteSpecialeSet = new HashSet<>();
        CarteNormale carteNormale = new CarteNormale();
        CarteSpeciale carteSpeciale = new CarteSpeciale();

        // Ajout des cartes dans la liste des Cartes Normales
        carteNormaleList.add(new CarteNormale("10","Coeur"));
        carteNormaleList.add(new CarteNormale("7","Trefle"));
        carteNormaleList.add(new CarteNormale("6","Pique"));
        carteNormaleList.add(new CarteNormale("2","Carre"));

        // Ajout des cartes speciales
        carteSpecialeSet.add(new CarteSpeciale("K","Pique"));
        carteSpecialeSet.add(new CarteSpeciale("Q","Carre"));
        carteSpecialeSet.add(new CarteSpeciale("J","Coeur"));
        carteSpecialeSet.add(new CarteSpeciale("A","Trefle"));

        System.out.println("\n\t Affichage des Cartes Normale !");
        System.out.println("\t -----------------------------");
        carteNormale.afficherListe(carteNormaleList);

        System.out.println("\n\t Affichage des Cartes Speciales !");
        System.out.println("\t -------------------------------");
        carteSpeciale.afficherListe(carteSpecialeSet);




        Etudiant e1 = new Etudiant();
        BulletinDeNote bulletinDeNote = e1.getBulletinDeNote();
        bulletinDeNote.setMath(10.75);
        bulletinDeNote.setFrench(17.5);




















    }
}
