package db;

import db.SourceDonnee;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


import static db.SourceDonnee.ANSI_BLEU;
import static db.SourceDonnee.ANSI_ROUGE;
import static db.SourceDonnee.ANSI_RESET;

public class Drive {
    public static void main(String[] args) throws IOException {
        Scanner saisie = new Scanner(System.in);
        SourceDonnee rec = new SourceDonnee();
        //String[] perso = new String[5];
        //rec.affichePerso(rec.recPerso(saisie));
        SourceDonnee.afficheMenu();
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Bien vouloir entrer votre choix : ");
        int choix = inputReader.nextInt();

        switch (choix) {
            case 1:
                System.out.println("Lecture d'un fichier");
                break;
            case 2:
                System.out.println("Création d'un fichier");
//                System.out.println(ANSI_BLEU + "Ajout d'un article" + ANSI_RESET);
//                String[] Entete = new String[]{"Ordre", "Nom du produit", "Date enregistrement", "Date de fin de garanti", "Prix"};
//                System.out.println("---------------------------------------------------------------------------------------------");
//                for (int i = 0; i < Entete.length; i++) System.out.print("|\t" + Entete[i] + "\t");
//                System.out.println("\n---------------------------------------------------------------------------------------------");
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
                System.out.println(ANSI_ROUGE + "Ecrire dans un fichier" + ANSI_RESET);
                break;
            case 4:
                System.out.println("Enregistrement d'un utilisateur");
                System.out.println("Veuillez entrer les infos dans le format: 'Nom','Prenoms', 'E-mail', 'Password'");
                SourceDonnee.creerEntete();

                File fichier = new File("src/db/db.txt");
                try {
                    fichier.createNewFile();

                } catch (IOException e) {
                    throw new RuntimeException(e);

                }
                FileWriter fileWriter = new FileWriter(fichier);
                PrintWriter printWriter = new PrintWriter(fileWriter);

                String[] perso = new String[5];

                System.out.print("\n\t Veuillez entrer le premier utilisateur: ");
                perso[0] = saisie.nextLine().toUpperCase();
                printWriter.println(perso[0].split (","));
                System.out.print("\n\t Veuillez entrer le second utilisateur: ");
                perso[1] = saisie.nextLine().toUpperCase();
                printWriter.println(perso[1]);
                System.out.print("\n\t Veuillez entrer le troisième utilisateur: ");
                perso[2] = saisie.nextLine().toUpperCase();
                printWriter.println(perso[2]);
                System.out.print("\n\t Veuillez entrer le quatrième utilisateur: ");
                perso[3] = saisie.nextLine().toUpperCase();
                printWriter.println(perso[3]);
                System.out.print("\n\t Veuillez entrer le cinquième utilisateur: ");
                perso[4] = saisie.nextLine().toUpperCase();
                printWriter.println(perso[4]);


                printWriter.flush();
                printWriter.close();

                Scanner sc2 = new Scanner(fichier);

                while (sc2.hasNext()) {
                    System.out.println(sc2.nextLine());
                }
                break;
            case 5:
                System.out.println("Afficher le contenu de la BD");
                break;
            case 6:
                System.out.println("Sorti du programme");
                break;
            default:
                System.out.println(ANSI_ROUGE + "votre choix n'est pas valide");
        }

//        File fichier = new File("src/db/db.txt");
//        try {
//            fichier.createNewFile();
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//
//        }
//        FileWriter fileWriter = new FileWriter(fichier);
//        PrintWriter printWriter = new PrintWriter(fileWriter);
//
//        String[] perso = new String[5];
//        System.out.print("\n\t Veuillez entrer votre nom: ");
//        perso[0] = saisie.nextLine().toUpperCase();
//        printWriter.println(perso[0]);
//        System.out.print("\n\t Veuillez entrer votre prenom: ");
//        perso[1] = saisie.nextLine().toUpperCase();
//        printWriter.println(perso[1]);
//        System.out.print("\n\t Veuillez entrer votre numero de telephone: ");
//        perso[2] = saisie.nextLine().toUpperCase();
//        printWriter.println(perso[2]);
//        System.out.print("\n\t Veuillez entrer votre e-mail: ");
//        perso[3] = saisie.nextLine().toUpperCase();
//        printWriter.println(perso[3]);
//        System.out.print("\n\t Veuillez entrer votre mot de passe: ");
//        perso[4] = saisie.nextLine().toUpperCase();
//        printWriter.println(perso[4]);
//
//
//        printWriter.flush();
//        printWriter.close();
//
//        Scanner sc2 = new Scanner(fichier);
//
//        while (sc2.hasNext()) {
//            System.out.println(sc2.nextLine());
    }
}







