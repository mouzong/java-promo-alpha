import java.util.*;

public class ExoString3 {
    public static void main(String[] args) {
        //Exercice 9: Ecrire un programme qui permet de compter le nombre de mots dans une chaine de caractères.

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t----------------------------------------------");

        System.out.print("\tEntrez une chaine de caractère de votre choix: ");

        String chaineChoisie = scanner.nextLine().toLowerCase();

        System.out.println("\t----------------------------------------------");

        String[] compteurMot = chaineChoisie.split("['.,;:?\\s+]");

        int nbreMot = 0;

        for (String mot : compteurMot) {

            if (!mot.isEmpty()) {

                nbreMot++;
            }
        }
        if (nbreMot <= 1) {

            System.out.println("\tLa chaine de caractère '" + chaineChoisie + "'compte:" + nbreMot + " mot.");

        } else {

            System.out.println("\tCette chaine de caractère compte: " + nbreMot + " mots.");

        }
        System.out.println("\t----------------------------------------------");


    }
}

