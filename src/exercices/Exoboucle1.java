package exercices;

import java.util.*;
import java.time.LocalDate;
public class Exoboucle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String JourSemaine = sc.nextLine();
        System.out.println("Entrez le nombre d");
        System.out.println("\n\tNombre de lettre par jour de la semaine");
        System.out.println("\t-----------------------");

        switch (JourSemaine) {
            case "Lundi":

                System.out.println("\tLundi\t => " + JourSemaine.length() + " lettres");
                break;
            case "Mardi":
                System.out.println("\tMardi => " + JourSemaine.length() + " lettres");
                break;
            case "Mercredi":
                System.out.println("\tMercredi => " + JourSemaine.length() + " lettres");
                break;

            case "Jeudi":
                System.out.println("\tJeudi => " + JourSemaine.length() + " lettres");
                break;

            case "Vendredi":
                System.out.println("\tVendredi => " + JourSemaine.length() + " lettres");
                break;

            case "Samedi":
                System.out.println("\tSamedi => " + JourSemaine.length() + " lettres");
                break;
            case "Dimanche":
                System.out.println("\tDimanche => " + JourSemaine.length() + " lettres");
                break;
            default:
                System.out.println("\tJour non prédéfini");
        }

        System.out.println("\t-----------------------");

    }

}
