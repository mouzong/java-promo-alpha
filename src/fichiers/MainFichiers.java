package fichiers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainFichiers {
    public static void main(String[] args) throws Exception {
        File monFichier = new File("src/fichiers/mon-fichier-test.txt");

        try {
            monFichier.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        FileWriter monFileWriter = new FileWriter(monFichier);
//        PrintWriter monPrintWriter = new PrintWriter(monFileWriter);
//
//        monPrintWriter.println("\n\t Premier ligne de mon fichier !");
//        monPrintWriter.println(tab[i]);
//        monPrintWriter.println("\t Une autre ligne dans mon fichier !");
//        monPrintWriter.println("\t Encore une autre ligne dans mon fichier de base !");
//
//
//        monPrintWriter.flush();
//        monPrintWriter.close();

        Scanner sc = new Scanner(monFichier);

        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }

        /**
         * Exercice 1 :
         * ------------
         * Ecrire un programme java qui demande a un utilisateur de rentrer ses informations:
         * - nom
         * - prenom
         * - numero de telephone
         * - e-mail
         * - mot de passe
         *
         * Puis le programme enregistre cet utilisateur dans notre base de donnees "bd.txt"
         *
         * Vous devrez creer au prelalble un package "bd" dans le quel vous aurez tou vos fichiers
         *
         *
         * Afficher le contenu de votre base de donnees a l'écran.
         *
         *
         * Exercice 2 :
         * ------------
         * Etendre l'exercice 1 de maniere a pouvoir enregistrer 5 utilisateur dans la BD,
         * definir les methodes externes qui permettent de :
         *
         * - Afficher un menu pour guider l'utilisateur
         * - lire un fichier
         * - creer un fichiertext
         * - ecrire dans un fichier
         * - enregistrer un utilisateur
         * - afficher le contenu de la BD
         *
         * Vous devrez formater votre BD pour un meilleur affichage sous forme de liste ordonnees avec entetes.
         *
         *
         *
         */





    }
}
