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
            System.out.println("\t--------------------------------------------------------------------");

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
                        String uuid= sc.nextLine();
                        /*Boucle pour vérifier si le numéro d'ordre est présent dans bdd */
                        System.out.println();

                       newFile.delete();
                       newFile.createNewFile();
                        String[] tb = {"No d'ordre", "Nom de l'article", "Date enreg.", "Date garantie", "Qté", "Prix Unitaire", "Prix Total"};

                        PrintWriter printWriter = new PrintWriter(fileWriter,true);
                        for (int i = 0; i < tb.length; i++) {
                            printWriter.printf("%-40s", tb[i]);

                        }
                       fileWriter=new FileWriter(newFile);
                       printWriter=new PrintWriter(fileWriter,true);
                        for(int i=0;i<article.suppressionFichier(newFile, uuid).size();i++){
                            printWriter.println(article.suppressionFichier(newFile, uuid).get(i));
                        }

                        printWriter.flush();
                        printWriter.close();
                        System.out.println("\t\u001B[32mSuppression effectuée avec succès\u001B[00m");
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
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
