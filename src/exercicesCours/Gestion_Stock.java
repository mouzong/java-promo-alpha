package exercicesCours;

import java.util.Arrays;
import java.util.Scanner;

public class Gestion_Stock {
    public static final String ANSI_ROUGE = "\u001B[31m";
    public static final String ANSI_VERT = "\u001B[32m";
    public static final String ANSI_JAUNE = "\u001B[33m";
    public static final String ANSI_BLEU = "\u001B[34m";
    public static final String ANSI_BVIOLET = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLANC = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println("\t\t\t\n\tPROGRAMME DE GESTION DE STOCK");
        System.out.println(ANSI_BLEU + "\t\t\t[============= MENU ==============]  " + ANSI_RESET +
                ANSI_CYAN + "\n\t\t\t|\t1-Afficher l'inventaire       " + "|\t" +
                "\n\t\t\t|\t2-Ajouter un article          " + "|\t" +
                "\n\t\t\t|\t3-Supprimer un article        " + "|\t" +
                "\n\t\t\t|\t4-Modifier un article         " + "|\t" +
                "\n\t\t\t|\t5-Vérifier votre inventaire   " + "|\t" +
                "\n\t\t\t|\t6-Sortir                      " + "|\t");
        System.out.println(ANSI_BLEU + "\t\t\t[=================================]" + ANSI_RESET);
        System.out.println("veuillez entrer le numero correspondant à l'opération que vous souhaitez effectuer");

        Scanner inputReader = new Scanner(System.in);
        System.out.print("Bien vouloir entrer votre choix : ");
        int choix = inputReader.nextInt();

        switch (choix) {
            case 1:
                System.out.println("Affichage de l'inventaire");
                break;
            case 2:
                System.out.println(ANSI_BLEU+"Ajout d'un article"+ ANSI_RESET);
                String [] Entete = new String[]{ "Ordre", "Nom du produit", "Date enregistrement", "Date de fin de garanti", "Prix"};
                System.out.println("---------------------------------------------------------------------------------------------");
                for (int i = 0; i < Entete.length; i++) System.out.print("|\t"+Entete[i]+"\t");
                System.out.println("\n---------------------------------------------------------------------------------------------");
                //Scanner sc = new Scanner(System.in);
                //int taille1 = 6, taille2 = 5;
                //String tab[] = new String[taille1];

                String donnee = "1,Mack-book-pro,2024-04-13,650000";
                String[] split = donnee.split(",");
                for (int i = 0; i < split.length; i++) {
                    System.out.print("\t" + split[i]);
                }

                //System.out.println("Entrez les éléments du tableau (chaînes de caractères) : ");
                // for (int i = 0; i < taille1; i++) {
                //tab[i] = sc.next();

                //System.out.println("Les éléments du tableau : " + Arrays.toString(tab));
                break;
            case 3:
                System.out.println(ANSI_ROUGE + "Suppression d'un article" + ANSI_RESET);
                break;
            case 4:
                System.out.println("Modification d'un article");
                break;
            case 5:
                System.out.println("Verificateur de l'inventaire");
                break;
            case 6:
                System.out.println("Sorti du programme");
                break;
            default:
                System.out.println(ANSI_ROUGE + "votre choix n'est pas valide, veuillez entrer un nombre compris entre 1 et 6" + ANSI_RESET);
        }

    }

}