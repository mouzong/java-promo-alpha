package exercices.Classes.BoutiqueEnLigne;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainBoutiqueEnLigne {
    public static void main(String[] args) throws IOException {
        String[][] bdd = new String[11][3];
        bdd[0][0] = "Id";
        bdd[0][1] = "Nom";
        bdd[0][2] = "Prix";

        for (int i = 1; i < bdd.length; i++) {
            for (int j = 0; j < 3; j++) {
                bdd[i][j] = "";
            }
        }
        File fileBdd = new File("src/exercices/Classes/BoutiqueEnLigne/bdd.txt");
        try {
            fileBdd.createNewFile();
            Scanner sc = new Scanner(fileBdd);
            FileWriter fileWriter = new FileWriter(fileBdd, true);


            PrintWriter pfile = new PrintWriter(fileWriter);
            for (int j = 0; j < 3; j++) {
                pfile.printf("%-20s", bdd[0][j]);
            }
            pfile.print("\n");

            pfile.flush();
            pfile.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Panier article = new Panier();


        int exit = 0;

        while (exit == 0) {
            System.out.println("------------------Boutique en ligne------------------");
            System.out.println("1. Ajouter un article");
            System.out.println("2. Afficher le prix total");
            System.out.println("3. Afficher le contenu du panier");
            System.out.println("4. Sortir");
            System.out.println("------------------------------------");

            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Quelle action souhaitez-vous mener? ");
                int choix = sc.nextInt();
                while (choix < 1 || choix > 4) {
                    System.out.print("Sélectionnez une action existante: ");
                    choix = sc.nextInt();
                }
                switch (choix) {
                    case 1:
                        String cheminFichier = "/mes-projets-adacorp/java-promo-alpha/src/exercices/Classes/BoutiqueEnLigne/bdd.txt";
 fileBdd=new File(cheminFichier);
                        fileBdd.delete();
                        article.ajoutArticle(bdd);



                        try {
                            fileBdd.createNewFile();
                            FileWriter fileWriter = new FileWriter(fileBdd);
                            PrintWriter pfile = new PrintWriter(fileWriter);
                            for (int i = 0; i < bdd.length; i++) {
                                for (int j = 0; j < 3; j++) {
                                    pfile.printf("%-20s", bdd[0][j]);
                                }
                            }

                            pfile.print("\n");

                            pfile.flush();
                            pfile.close();


                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }


                        break;
                    case 2:
                        System.out.println("Le prix total s'élève à " + article.calculTotal(bdd) + " FCFA");

                        break;
                    case 3:

                        article.afficheContenuPanier(fileBdd);
                        break;
                    case 4:
                        break;
                    default:

                }
            } catch (Exception e) {
                System.out.println("Saisie incorrecte, Erreur interne " + e.getMessage());
            }


        }
    }
}
