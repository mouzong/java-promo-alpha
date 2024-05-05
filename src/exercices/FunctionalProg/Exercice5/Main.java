package exercices.FunctionalProg.Exercice5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> listClient=new ArrayList<>();
        System.out.println("\tPrincipe: vous entrez 5 mots selon  un un thème choisi, " +
                "en moins de 10 secondes, celui qui entre " +
                "les mots cohérents à plus de 5 caractères remporte la partie.");
        System.out.println("\tJeux de mot");
        System.out.print("\tSaisir le 1er mot:");
        listClient.add(sc.nextLine());
        System.out.print("\tSaisir le 2eme mot:");
        listClient.add(sc.nextLine());
        System.out.print("\tSaisir le 3eme mot:");
        listClient.add(sc.nextLine());
        System.out.print("\tSaisir le 4eme mot:");
        listClient.add(sc.nextLine());
        System.out.print("\tSaisir le 5eme mot:");
        listClient.add(sc.nextLine());

       Predicate<String>predicate = longueur -> longueur.length()>5;
       System.out.println(listeChaine.apply(listClient,predicate));
        System.out.println("Votre resultat est de "+listeChaine.apply(listClient,predicate).size());

    }
    static BiFunction<List<String>,Predicate<String>,List<String>> listeChaine=(liste,predicate)->{

        return liste.stream()
                .filter(predicate = s -> s.length()>5)
                .collect(Collectors.toList());
    };


}
