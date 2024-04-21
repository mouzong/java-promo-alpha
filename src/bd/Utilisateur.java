package bd;

import java.io.*;
import java.util.Scanner;


public class Utilisateur {


    public static int afficheMenu() {
        //définition du menu de choix de l'utilisateur
        int x = 0;
        System.out.println("\n\tBienvenu à la promo Java-Alpha-Promo");
        System.out.println("\t-------------------------------------");
        System.out.println("\t1. " + OptionMenu.Ajouter_un_utilisateur + "\n");
        System.out.println("\t2. " + OptionMenu.Afficher_tous_les_utilisateurs + "\n");
        System.out.println("\t3. " + OptionMenu.Sortir);
        System.out.println("\t-------------------------------------");
        Scanner sc = new Scanner(System.in);
        try {

            System.out.print("\tChoisir le menu auquel vous souhaitez accéder?: ");
            x = sc.nextInt();
            while (x < 1 || x > 4) {
                System.out.print("\tChoix incorrect, le menu doit-être compris entre 1 et 4, Saisir à nouveau: ");
                x = sc.nextInt();
            }
        } catch (Exception e) {
            System.out.println("\t\u001B[31mSeuls les menus compris entre 1 et 4 sont pris en compte\n\tErreur interne: " + e.getMessage() + "\u001B[0m");
        }

        return x;
    }


    public String[] ajouterUtilisateur() throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] tb = new String[5];

        System.out.println("\n\t=====Informations sur l'utilisateur=====\n");

        System.out.print("\tSaisir le nom: ");
        tb[0] = sc.nextLine().toUpperCase();
        while (tb[0].isEmpty()) {
            System.out.print("\n\tLe champs 'nom' est obligatoire, Saisir à nouveau: ");
            tb[0] = sc.nextLine().toUpperCase();
        }
        System.out.print("\n\tSaisir le prénom: ");
        tb[1] = sc.nextLine();
        while (tb[1].isEmpty()) {
            System.out.print("\n\tLe champs 'prénom' est obligatoire, Saisir à nouveau: ");
            tb[1] = sc.nextLine();
        }
        System.out.print("\n\tSaisir le numéro de téléphone (237XXXXXXXXX): ");
        tb[2] = sc.nextLine();
        try {
            long tel = Long.parseLong(tb[2]);
            while (tb[2].length() != 12 || !tb[2].substring(0, 3).equals("237")) {
                System.out.print("`\n\tSaisir le numéro de téléphone sous la forme 237XXXXXXXXX Exemple: 237655037336: ");
                tb[2] = sc.nextLine();
            }
        } catch (Exception e) {
            //Question: Aucun message sur la console
            System.out.println("\n\t\u001B[31mLe numéro de téléphone ne doit contenir que des nombres\u001B[00m\n");
            throw new NumberFormatException(e.getMessage());
        }
        System.out.print("\n\tSaisir l'adresse email: ");
        tb[3] = sc.nextLine();
        while (!tb[3].contains("@") || !tb[3].contains(".")) {
            System.out.print("\n\tL'adresse doit respecter la nomenclature 'XXXX@XXXX.XXX', saisir à nouveau: ");
            tb[3] = sc.nextLine();
        }
        System.out.print("\n\tSaisir le mot de passe: ");
        tb[4] = sc.nextLine();
        while (tb[4].length() < 8) {
            System.out.print("\n\tLe mot de passe doit contenir au moins 8 caractères, Saisir à nouveau: ");
            tb[4] = sc.nextLine();
        }
        System.out.println("\t-------------------------------------\n");

        return tb;
    }


    public void creationEcritureFichier(String[][] args) throws FileNotFoundException {
        File fichierUtilisateur = new File("src/bd/bdd.txt");


        try {
            fichierUtilisateur.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            FileWriter fichierWriter = new FileWriter(fichierUtilisateur, true);
            PrintWriter printFichierUtilisateur = new PrintWriter(fichierWriter);
            printFichierUtilisateur.println("=====================================================================| Listing des utilisateurs |======================================================================");


            for (int i = 0; i < args.length; i++) {
                for (int j = 0; j < 6; j++) {
                    printFichierUtilisateur.printf("%-30s", args[i][j]);
                }
                printFichierUtilisateur.printf("\n");
            }
            printFichierUtilisateur.println("==============================================================================| FIN |===================================================================================");

            printFichierUtilisateur.flush();
            printFichierUtilisateur.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }


    public void lirefichier() throws FileNotFoundException {
        File fichier = new File("src/bd/bdd.txt");
        try {
            Scanner sc = new Scanner(fichier);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (Exception e) {
            System.out.println("\n\t\u001B[31mAucun fichier trouvé\u001B[00m");
            throw new FileNotFoundException();
        }

    }

}


