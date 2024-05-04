package exercices.Recap;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * Création d'un article
         */
        Inventaire article = new Inventaire();
        /**
         * Création de la liste des articles présent dans l'inventaire
         */
        List<String> listArticle = new ArrayList<>();
        /**
         * Création fichier de données
         */
        File newFile = new File("src/exercices/Recap/bdd.txt");
        FileWriter fileWriter = null;
        try {
            if (!newFile.exists()) {
                String[] tb = {"No d'ordre", "Nom de l'article", "Date enreg.", "Date garantie", "Qté", "Prix Unitaire", "Prix Total"};
                newFile.createNewFile();
                fileWriter = new FileWriter(newFile);
                PrintWriter printWriter = new PrintWriter(fileWriter);
                for (int i = 0; i < tb.length; i++) {
                    printWriter.printf("%-40s", tb[i]);

                }
                printWriter.flush();
                printWriter.close();

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        int exit = 0;

        /**
         * Boucle qui me permet de rester dans le programme;
         */
        while (exit == 0) {
            System.out.print("\tVeuillez écrire 'launch' pour ouvrir le menu ou 'exit' pour sortir du programme : ");
            String dem = sc.nextLine();

            /**
             * Condition pour entrer ou sortir du programme
             */
            if ((dem.equalsIgnoreCase("launch"))) {
                /**
                 * Executer les menus du programme en fonction du choix de l'utilisateur
                 */
                switch (article.afficherMenu()) {
                    case 1:
                        article.lectureFichier(newFile);
                        break;
                    case 2:
                        article.ajoutArticle(listArticle, newFile);
                        article.ecrireFichier(fileWriter, listArticle);
                        break;
                    case 3:

                        /*Choix de l'id de l'article à supprimer*/
                        System.out.print("\tVeuillez saisir l'identifiant de l'article à supprimer: ");
                        String uuid = sc.nextLine();

                        article.suppressionFichier(newFile, uuid);

                        System.out.println("\t\u001B[32mSuppression effectuée avec succès\u001B[00m");
                        break;
                    case 4:
                        int reponse = 0;
                        System.out.println("\tVous êtes sur le point de vous sortir du programme, Souhaitez-vous continuer?\n\t" + "1. Oui\n\t2. Non");
                        System.out.print("\tVeuillez saisir le choix opéré: ");
                        try {
                            reponse = sc.nextInt();
                            while (reponse != 1 && reponse != 2) {
                                System.out.println("\tLe choix opéré n'est pas configuré, Entrez 1 pour quitter et 2 pour revenir \n\t1. Oui\n\t2. Non");
                                reponse = sc.nextInt();
                                sc.nextLine();
                            }
                            System.out.println("\t-------------------------------------");
                            switch (reponse) {
                                case 1:
                                    System.out.println("\t\u001B[31m\u001B[3mMerci d'avoir utilisé notre programme. Nous espérons que vous avez\n\t" + "trouvé l'expérience agréable et utile. N'hésitez pas à revenir si vous avez besoin d'aide \n\t" + "à l'avenir. À bientôt !\u001B[0m\n");
                                    System.out.println("\t--------------------------------------------------------------------");
                                    exit = 1;
                                    break;
                                case 2:
                                    System.out.println("\t\u001B[32m\u001B[3mNous sommes ravis que vous ayez décidé de rester avec nous ! \n\t" + "Votre engagement envers notre programme est précieux et nous sommes \n\t" + "déterminés à vous offrir la meilleure expérience possible. Si vous avez \n\t" + "des questions, des suggestions ou si vous avez besoin d'aide, n'hésitez \n\t" + "pas à nous contacter. Merci encore pour votre confiance et votre fidélité !\u001B[0m\n\t");
                                    System.out.println("\t--------------------------------------------------------------------");
                                default:
                            }
                        } catch (Exception e) {
                            System.out.println("\tSaisie incorrect, Erreur interne: " + e.getMessage());
                        }

                        break;


                    default:

                }

            } else if (dem.equalsIgnoreCase("exit")) {
                System.out.println("\t\u001B[31m\u001B[3mMerci d'avoir utilisé notre programme. Nous espérons que vous avez\n\t" + "trouvé l'expérience agréable et utile. N'hésitez pas à revenir si vous avez besoin d'aide \n\t" + "à l'avenir. À bientôt !\u001B[0m\n");
                System.out.println("\t--------------------------------------------------------------------");
                exit = 1;
            }
        } //fin de la boucle qui me permet de rester dans le programme.


    }
}
