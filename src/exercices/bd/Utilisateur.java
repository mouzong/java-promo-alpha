package exercices.bd;

import java.io.*;
import java.util.Scanner;


public class Utilisateur {


    public static int afficheMenu() {
        //définition du menu de choix de l'utilisateur
        int x = 0;
        System.out.println("\n\tBienvenu à la promo Java-Alpha-Promo");
        System.out.println("\t-------------------------------------");
        System.out.println("\t1. " + OptionMenu.Ajouter + "\n");
        System.out.println("\t2. " + OptionMenu.Modifier + "\n");
        System.out.println("\t3. " + OptionMenu.Supprimer + "\n");
        System.out.println("\t4. " + OptionMenu.Tout_afficher + "\n");
        System.out.println("\t5. " + OptionMenu.Sortir);
        System.out.println("\t-------------------------------------");
        Scanner sc = new Scanner(System.in);
        try {

            System.out.print("\tChoisir le menu auquel vous souhaitez accéder?: ");
            x = sc.nextInt();
            while (x < 1 || x > 5) {
                System.out.print("\tChoix incorrect, le menu doit-être compris entre 1 et 5, Saisir à nouveau: ");
                x = sc.nextInt();
            }
        } catch (Exception e) {
            System.out.println("\t\u001B[31mSeuls les menus compris entre 1 et 5 sont pris en compte\n\tErreur interne: " + e.getMessage() + "\u001B[0m");
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


    public String[] modif_utilisateur(String[][] tbdd) {
        String[] tb_mod = new String[5];
        System.out.println("\t-------------------------------------");
        System.out.print("\tSaisir l'id de l'utilisateur: ");

        Scanner sc = new Scanner(System.in);
        try {
            StringBuilder ok = new StringBuilder();
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("\t-------------------------------------");
            for (int i = 1; i < tbdd.length; i++) {
                if (id == Integer.parseInt(tbdd[i][0])) {
                    ok.append("ok");
                    break;
                }
            }
            if (ok.toString().equals("ok")) {
                System.out.println("\t-------------------------------------");
                System.out.println("\tQuelle information souhaitez-vous modifier? \n\t1. le nom\n\t2. Le prénom\n\t3. " +
                        "Le numéro de téléphone\n\t4. l'email\n\t5. Le mot de passe\n\t6. Tout modifier");
                System.out.println("\t-------------------------------------");
                System.out.print("\tChoix de l'information à modifier: ");

                try {
                    int choix = sc.nextInt();
                    sc.nextLine();
                    System.out.println("\t-------------------------------------");
                 while(choix<1 || choix>6){
                     System.out.println("\t-------------------------------------");
                     System.out.println("\tLe choix doit être compris entre 1 et 5");
                     choix = sc.nextInt();
                     sc.nextLine();
                     System.out.println("\t-------------------------------------");
                 }

                } catch (Exception e) {
                    System.out.println("\t\u001B[31mid incorrect, il ne peut être representé que par un entier" +
                            "\n\tErreur interne: " + e.getMessage() + "\u001B[00m");
                }

            } else {
                System.out.println("\t-------------------------------------");
                System.out.println("\t\u001B[31mid incorrect, il ne peut être representé que par un entier\u001B[00m");
            }

        } catch (Exception e) {
            System.out.println("\t\u001B[31mid incorrect, il ne peut être representé que par un entier" +
                    "\n\tErreur interne: " + e.getMessage() + "\u001B[00m");
        }
        return tb_mod;
    }


    public void creationEcritureFichier(String[][] args) throws FileNotFoundException {
        File fichierUtilisateur = new File("src/exercices.bd/bdd.txt");


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
        File fichier = new File("src/exercices.bd/bdd.txt");
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


