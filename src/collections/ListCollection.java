package collections;

import collections.exo6.Article;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList<>();

        arrayList.add(new Article());
        arrayList.add("Andreas MOUZONG");
        arrayList.add(8000000);

        System.out.println("Affichage de mon ArrayList Classique");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        int[] listeEntier = new int[10];

        List<String> listeDePresence = new ArrayList<>();


        listeDePresence.add("Ali MOHAMAN");

        listeDePresence.add("Steve ONDOUA");
        listeDePresence.add("Eric MBIDA");
        listeDePresence.add("Eric MBIDA");
        listeDePresence.add("Yann KWADJIO");

        listeDePresence.add(2, "Andreas");

        System.out.println("\n\nAffichage de mon Tableau avec LIST");
        for (int i = 0; i < listeDePresence.size(); i++) {
            System.out.println(listeDePresence.get(i));
        }

        // List<Arcticles> paniers = new ArrayList<>();


    }
}
