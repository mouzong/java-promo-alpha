package exercices.bd;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        int exit = 0;

        /**
         * Création de la table de données et insertion de l'entête;
         */

        String[][] tb_bdd_final = new String[10][6];
        tb_bdd_final[0][0] = "No d'ordre";
        tb_bdd_final[0][1] = "Nom";
        tb_bdd_final[0][2] = "Prénom";
        tb_bdd_final[0][3] = "Numéro de téléphone";
        tb_bdd_final[0][4] = "E-mail";
        tb_bdd_final[0][5] = "Mot de passe";

        /**
         * Boucle pour remplacer les valeurs null par le vide
         */
        for (int i = 1; i < tb_bdd_final.length; i++) {
            for (int j = 0; j < 6; j++) {
                tb_bdd_final[i][j] = "";

            }
        }
        Scanner sc = new Scanner(System.in);

        while (exit == 0) {

            System.out.print("\n\tSaisir 'enter' pour ouvrir le menu ou 'exit' pour fermer le programme: ");
            String statut = sc.nextLine();
            while (!statut.equals("enter") && !statut.equals("exit")) {
                System.out.print("\n\tBien vouloir saisir les mots clés qui vous permettent d'accéder ou de sortir du programme ('enter' ou 'exit'): ");
                statut = sc.nextLine();
            }
            if (statut.equals("enter")) {

                int i = (Utilisateur.afficheMenu());
                Utilisateur utilisateur = new Utilisateur();
                try {
                    switch (i) {
                        case 1:
                            /**
                             * Ajouter et ecrire un utilisateur dans le fichier bdd.txt
                             */
                            String[] tb_recep = utilisateur.ajouterUtilisateur();
                            for (int x = 1; x < tb_bdd_final.length; x++) {
                                if (tb_bdd_final[x][0].isEmpty()) {
                                    if (x == 1) {
                                        tb_bdd_final[x][0] = "1";
                                    } else {
                                        tb_bdd_final[x][0] = String.valueOf(Integer.parseInt(tb_bdd_final[(x - 1)][0]) + 1);
                                    }
                                    tb_bdd_final[x][1] = tb_recep[0];
                                    tb_bdd_final[x][2] = tb_recep[1];
                                    tb_bdd_final[x][3] = tb_recep[2];
                                    tb_bdd_final[x][4] = tb_recep[3];
                                    tb_bdd_final[x][5] = tb_recep[4];

                                    System.out.println("\t\u001B[32m\u001B[3mAjout utilisateur effectué avec succès\u001B[0m");
                                    break;
                                }

                            }

                            utilisateur.creationEcritureFichier(tb_bdd_final);
                            break;
                        case 2:

                           utilisateur.modif_utilisateur(tb_bdd_final);
                        case 3:

                            break;

                        case 4:
                            /**
                             *  Lire le fichier bdd.txt
                             */

                            utilisateur.lirefichier();
                            break;

                        case 5:
                            exit = 1;
                            System.out.println("\n\t\u001B[31mAu revoir!\u001B[00m");
                            break;

                        default:
                            System.out.println("\t\u001B[31mMenu non repertorié\u001B[00m");
                            break;
                    }
                } catch (Exception e) {

                }

            } else {
                exit = 1;
                System.out.println("\n\t\u001B[31mAu revoir!\u001B[00m");

            }

        }

    }
}
