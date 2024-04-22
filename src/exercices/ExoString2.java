package exercices;

import java.util.*;

public class ExoString2 {
    public static void main(String[] args) {

        //Exercice 8: Ecrire un programme qui permet de compter
        // le nombre de consonnes dans une chaine de caractères.

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\tEntrez la chaine de caractère de votre choix: ");

        String chaineChoisie = scanner.nextLine().toLowerCase();               //recupère la chaine de caractère entré par l'utilisateur

        String voyelle = "aeiouy ";

        int compteurConsonne = 0;

        for (int i = 0; i < chaineChoisie.length(); i++) {    //boucle de comptage du nombre de consonnes

            String c = String.valueOf(chaineChoisie.charAt(i));

            if (!voyelle.contains(c)) {

                compteurConsonne += 1;

            }

        }

        if (compteurConsonne <= 1) {

            System.out.println("\nLa chaine de caractère '" + chaineChoisie + "' dispose de " + compteurConsonne + " consonne.");

        } else {

            System.out.println("\tLa chaine de caractère '" + chaineChoisie + "' dispose de " + compteurConsonne + " consonnes.");

        }

    }
}

