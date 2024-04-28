package db;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SourceDonnee {
    public static final String ANSI_ROUGE = "\u001B[31m";
    public static final String ANSI_VERT = "\u001B[32m";
    public static final String ANSI_JAUNE = "\u001B[33m";
    public static final String ANSI_BLEU = "\u001B[34m";
    public static final String ANSI_BVIOLET = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLANC = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    public String[] recPerso() {
        Scanner saisie = new Scanner(System.in);
        String[] perso = new String[5];
        System.out.print("\n\t Veuillez entrer votre nom: ");
        perso[0] = saisie.nextLine().toUpperCase();
        System.out.print("\n\t Veuillez entrer votre prenom: ");
        perso[1] = saisie.nextLine().toUpperCase();
        System.out.print("\n\t Veuillez entrer votre numero de telephone: ");
        perso[2] = saisie.nextLine().toUpperCase();
        System.out.print("\n\t Veuillez entrer votre e-mail: ");
        perso[3] = saisie.nextLine().toUpperCase();
        System.out.print("\n\t Veuillez entrer votre mot de passe: ");
        perso[4] = saisie.nextLine().toUpperCase();
        return perso;
    }

    public void affichePerso(String[] perso) {
        System.out.println(" =======Information détaillée sur l'utilisation========");
        System.out.println("\t\t Votre nom est: " + perso[0]);
        System.out.println("\t\t Votre prenom est: " + perso[1]);
        System.out.println("\t\t Votre numero de telephone est: " + perso[2]);
        System.out.println("\t\t Votre e-mail est: " + perso[3]);
        System.out.println("\t\t Votre mot de passe est: " + perso[4]);
    }


    public static void afficheMenu() {
        System.out.println("\n\t\t\tPROGRAMME DE GESTION DES UTILISATEURS");
        System.out.println(ANSI_BLEU + "\t\t\t[============= MENU ==============]  " + ANSI_RESET +
                ANSI_CYAN + "\n\t\t\t|\t1-Lire un fichier             " + "|\t" +
                "\n\t\t\t|\t2-Creer un fichier            " + "|\t" +
                "\n\t\t\t|\t3-Ecrire dans un fichier      " + "|\t" +
                "\n\t\t\t|\t4-Enregistrer un utilisateur  " + "|\t" +
                "\n\t\t\t|\t5-Afficher le contenu de la BD" + "|\t" +
                "\n\t\t\t|\t6-Sortir                      " + "|\t");
        System.out.println(ANSI_BLEU + "\t\t\t[=================================]" + ANSI_RESET);
        System.out.println("veuillez entrer le numero correspondant à l'opération que vous souhaitez effectuer");
    }
//        Scanner inputReader = new Scanner(System.in);
//        System.out.print("Bien vouloir entrer votre choix : ");
//        int choix = inputReader.nextInt();
//
//        switch (choix) {
//            case 1:
//                System.out.println("Affichage de l'inventaire");
//                break;
//            case 2:
        public static void creerEntete() {
            //System.out.println(ANSI_BLEU + "Ajout d'un article" + ANSI_RESET);
            String[] Entete = new String[]{"N° Ordre", " Nom ", " Prénoms ", " E-Mail ", "Password"};
            System.out.println("---------------------------------------------------------------------------------------------");
            for (int i = 0; i < Entete.length; i++) System.out.print("|\t" + Entete[i] + "\t");
            System.out.println("\n---------------------------------------------------------------------------------------------");
        }
        //Scanner sc = new Scanner(System.in);
        //int taille1 = 6, taille2 = 5;
//                //String tab[] = new String[taille1];
//
//                String donnee = "1,Mack-book-pro,2024-04-13,650000";
//                String[] split = donnee.split(",");
//                for (int i = 0; i < split.length; i++) {
//                    System.out.print("\t" + split[i]);
//                }
//
//                //System.out.println("Entrez les éléments du tableau (chaînes de caractères) : ");
//                // for (int i = 0; i < taille1; i++) {
//                //tab[i] = sc.next();
//
//                //System.out.println("Les éléments du tableau : " + Arrays.toString(tab));
//                break;
//            case 3:
//                System.out.println(ANSI_ROUGE + "Suppression d'un article" + ANSI_RESET);
//                break;
//            case 4:
//                System.out.println("Modification d'un article");
//                break;
//            case 5:
//                System.out.println("Verificateur de l'inventaire");
//                break;
//            case 6:
//                System.out.println("Sorti du programme");
//                break;
//            default:
//                System.out.println(ANSI_ROUGE + "votre choix n'est pas valide, veuillez entrer un nombre compris entre 1 et 6" + ANSI_RESET);


    }



