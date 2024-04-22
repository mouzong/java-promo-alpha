package exercices;

import java.time.LocalDate;
import java.util.Scanner;

public class ExoDate {
    public static void main(String[] args) {
         /*
          exit: variable défini pour maintenir la boucle sur le programme. Lorsque cette valeur est égale à 0, le programme s'arrête.
          reponse: variable défini pour recupérer les réponses données par l'utilisateur.
         */
        int exit = 1;
        int reponse = 0;
        /*
          bdd: base de donnée définie sous forme de tableau de 2 dimensions soit 11 lignes et 5 colonnes.
         */
        String[][] bdd = new String[11][7];

        /*
          Insertion des titres à la première ligne du tableau bdd
         */
        bdd[0][0] = "\u001B[44mNo d'ordre\u001B[0m";
        bdd[0][1] = "\u001B[44mNom de l'article\u001B[0m";
        bdd[0][2] = "\u001B[44mDate enreg.\u001B[0m";
        bdd[0][3] = "\u001B[44mDate garantie\u001B[0m";
        bdd[0][4] = "\u001B[44mQté\u001B[0m";
        bdd[0][5] = "\u001B[44mPrix Unitaire\u001B[0m";
        bdd[0][6] = "\u001B[44mPrix Total\u001B[0m";


        String[] tabInit = new String[5];
        tabInit[0] = "1,JAVEL LIQUIDE,2024,04,09,2024,04,12,10,500,5000";
        tabInit[1] = "2,PAX LIQUIDE,2024,04,10,2024,10,12,10,450,4500";
        tabInit[2] = "3,SAVON DE MENAGE,2024,04,09,2024,05,9,40,300,12000";
        tabInit[3] = "4,RACLETTE,2024,04,07,2024,05,25,15,1000,15000";
        tabInit[4] = "5,BALAIE A MANCHE,2024,04,07,2024,05,25,15,1000,15000";

        String[] tab = new String[7];
        for (int i = 0; i < 5; i++) {
            tab = tabInit[i].split(",");

            bdd[i + 1][0] = tab[0];
            bdd[i + 1][1] = tab[1];
            ;
            bdd[i + 1][2] = tab[2] + "/" + tab[3] + "/" + tab[4];
            bdd[i + 1][3] = tab[5] + "/" + tab[6] + "/" + tab[7];
            bdd[i + 1][4] = tab[8];
            bdd[i + 1][5] = tab[9];
            bdd[i + 1][6] = String.valueOf(Integer.parseInt(tab[8]) * Integer.parseInt(tab[9]));

        }


        /*
          Boucle pour remplacer la valeur Null par le vide afin de rendre le tableau plus exploitable.
         */

        for (int i = 6; i < 11; i++) {

            for (int j = 0; j < 7; j++) {
                bdd[i][j] = "";
            }

        }




        /*
          La boucle qui maintient le programme, tant que exit est différent de 0, le programme reste actif
         */
        Scanner sc = null;
        while (exit > 0) {
            /*
              Incrémentation de la valeur exit pour identifier le nombre de fois qu'on fait appel au menu....Cela permet d'afficher le message d'accueil.
             */
            exit++;
            /*
            Création de l'object sc pour recupérer les données entrées par l'utilisateur
             */
            sc = new Scanner(System.in);

            /*
              Récupérer la réponse de l'utilisateur pour entrer/rester ou sortir du programme.
             */
            System.out.print("\tVeuillez écrire 'launch' pour ouvrir le menu ou 'exit' pour sortir du programme : ");


            String dem = sc.nextLine();
            System.out.println("\t--------------------------------------------------------------------");

            if ((dem.equalsIgnoreCase("launch"))) {

                /*
                  Condition pour vérifier le nombre de nombre de fois que le programme a été appelé, si la valeur exit=2 alors le programme affiche le message d'accueil et dans le cas contraire il n'affiche rien
                 */
                if (exit == 2) {
                    System.out.println("\n\tBienvenu au Magasin de l'équipe Java-Promo-Alpha");
                }
                /*
                  Définition des différents menus du programme
                 */
                System.out.println("\t-------------------------------------");
                System.out.println("\t|\t------Choix du menu------\t\t|");
                System.out.println("\t|\t1. Afficher un inventaire\t\t|");
                System.out.println("\t|\t2. Ajouter un article\t\t\t|");
                System.out.println("\t|\t3. Supprimer un article\t\t\t|");
                System.out.println("\t|\t4. Modifier un article\t\t\t|");
                System.out.println("\t|\t5. Vérifier votre inventaire\t|");
                System.out.println("\t|\t6. Sortir\t\t\t\t\t\t|");
                System.out.println("\t-------------------------------------");

                /*
                Recupérer la donnée entrée par l'utilisateur dans le variable menuChoisi
                 */
                System.out.print("\tVeuillez choisir l'opération à exécuter? ");
                int menuchoisi = sc.nextInt();
                sc.nextLine();

                /*
                Boucle pour vérifier si la donnée choisie par l'utilisateur est comprise entre 1 et 6
                 */
                while (menuchoisi != 1 && menuchoisi != 2 && menuchoisi != 3 && menuchoisi != 4 && menuchoisi != 5 && menuchoisi != 6) {
                    menuchoisi = 0;
                    System.out.println("\tLe menu sélectionné n'existe pas ou est incorrect");
                    System.out.print("\tVeuillez choisir un menu existant ou correct (entre 1 et 6): ");
                    menuchoisi = sc.nextInt();
                    sc.nextLine();
                }
                System.out.println("\t-------------------------------------");

                /*
                En fonction du choix opéré par l'utilisateur, le traitement est géré dans le cas correspondant
                 */
                switch (menuchoisi) {
                    case 1:    /*Afficher un inventaire */


                        System.out.println(bdd[0][0] + "\t\t\t" + bdd[0][1] + "\t" + bdd[0][2] + "\t\t\t" + bdd[0][3] + "\t\t" + bdd[0][4] + "\t\t\t\t" + bdd[0][5] + "\t\t" + bdd[0][6]);

                        int somTotal = 0;
                        for (int i = 1; i < bdd.length; i++) {
                            for (int j = 0; j < bdd[i].length; j++) {
                                // Alignement des colonnes avec des espaces pour un affichage bien ordonné
                                System.out.printf("%-20s", bdd[i][j]);


                            }
                            if (!bdd[i][6].equals("")) {
                                somTotal += Integer.parseInt(bdd[i][6]);
                            }
                            System.out.println(); // Nouvelle ligne après chaque ligne du tableau
                        }
                        System.out.println("-----------------------------------------------------------------------------------------------------------------------" + somTotal + " FCFA");

                        break;
                    case 2:  /*Ajouter un article*/

                        System.out.println("\t\t-----Ajout d'un article-----\t\t");

                        /*Recupérer les informations sur l'article*/

                        System.out.print("\tVeuillez saisir toutes les informations sur l'article NomProduit,2024,04,10,2025,04," + "10,qté,prix: ");
                        String produit = sc.nextLine().toUpperCase();


                        /*Boucle pour vérifier si les informations ont été bien saisies*/

                        String[] tabVerif = produit.split(",");
                        while (tabVerif.length != 9 && !produit.equals("EXIT")) {
                            System.out.print("\t\u001B[31mLes informations saisies sont incomplètes\u001B[0m, Veuillez saisir à nouveau (saisir 'exit' pour revenir au menu): ");
                            produit = sc.nextLine().toUpperCase();
                        }

                        /*vérification des données saisies par l'utilisateur*/
                        System.out.println("\t-------------------------------------");
                        /*Vérification du nom du Produit*/
                        StringBuilder verifNomProduit = new StringBuilder();
                        verifNomProduit.append("");
                        while (tabVerif[0].equals("")) {
                            System.out.print("\t\u001B[31mNom de l'article non saisi\u001B[0m, Veuillez saisir le nom de l'article: ");
                            verifNomProduit.append(sc.nextLine());
                            tabVerif[0] = verifNomProduit.toString();
                        }
                        if (!produit.equals("EXIT")) {
                            LocalDate dateEnregistrement = LocalDate.of(Integer.parseInt(tabVerif[1]), Integer.parseInt(tabVerif[2]), Integer.parseInt(tabVerif[3]));
                            LocalDate dateGarantie = LocalDate.of(Integer.parseInt(tabVerif[4]), Integer.parseInt(tabVerif[5]), Integer.parseInt(tabVerif[6]));


                            /*Vérification que la date de garantie est postérieure à la date d'enregistrement*/
                            StringBuilder verifDate = new StringBuilder();
                            String[] dteverif = new String[3];
                            verifDate.append("");
                            int choix;
                            StringBuilder verifdte = new StringBuilder();
                            StringBuilder verifdteg = new StringBuilder();

                            /*Boucle pour vérifier si la date de garantie est postérieure à la date d'enregistrement*/
                            while (!dateGarantie.isAfter(dateEnregistrement)) {
                                System.out.println("\tQuelle date souhaitez-vous modifier?\n\t1. Date d'enregistrement\n\t2. Date de garantie");
                                System.out.print("\tVeuillez Saisir le choix opéré: ");
                                choix = sc.nextInt();
                                sc.nextLine();
                                while (choix != 1 && choix != 2) {
                                    System.out.print("\tChoix non configuré, saisir à nouveau: ");
                                    choix = sc.nextInt();
                                    sc.nextLine();
                                }
                                System.out.println("\t-------------------------------------");
                                /*Choix de la date à modifier*/
                                if (choix == 1) {
                                    System.out.print("\tVeuillez saisir la date d'enregistrement (JJ/MM/AAAA) : ");
                                    verifdte.append(sc.nextLine());
                                    dteverif = verifdte.toString().split("/");
                                    while (dteverif.length != 3) {
                                        System.out.print("\tLa date saisie n'est pas correct, saisir à nouveau : ");
                                        verifdte.append(sc.nextLine());
                                        dteverif = verifdte.toString().split("/");
                                    }
                                    dateEnregistrement = LocalDate.of(Integer.parseInt(dteverif[2]), Integer.parseInt(dteverif[1]), Integer.parseInt(dteverif[0]));
                                } else if (choix == 2) {
                                    System.out.print("\tVeuillez saisir la date de garantie (JJ/MM/AAAA) : ");
                                    verifdteg.append(sc.nextLine());
                                    dteverif = verifdteg.toString().split("/");
                                    while (dteverif.length != 3) {
                                        System.out.print("\tLa date saisie n'est pas correct, saisir à nouveau : ");
                                        verifdteg.append(sc.nextLine());
                                        dteverif = verifdteg.toString().split("/");
                                    }
                                    dateGarantie = LocalDate.of(Integer.parseInt(dteverif[2]), Integer.parseInt(dteverif[1]), Integer.parseInt(dteverif[0]));
                                }
                            }


                            /*Vérification de la quantité du Produit*/
                            StringBuilder verifQteProduit = new StringBuilder();
                            verifQteProduit.append("");
                            while (tabVerif[7].equals("0")) {
                                System.out.print("\t\u001B[31mLa quantité ne peut pas être nulle\u001B[0m, Veuillez saisir la quantité: ");
                                verifQteProduit.append(sc.nextLine());
                                tabVerif[7] = verifQteProduit.toString();
                            }

                            StringBuilder verifPrixProduit = new StringBuilder();
                            verifPrixProduit.append("");
                            while (tabVerif[8].equals("0")) {
                                System.out.print("\t\u001B[31mLe prix ne peut pas être nulle\u001B[0m, Veuillez saisir la prix: ");
                                verifPrixProduit.append(sc.nextLine());
                                tabVerif[8] = verifPrixProduit.toString();
                            }

                            //Structure conditionelle pour modifier les données saisies par l'utilisateur*/
                            if (!verifNomProduit.toString().isEmpty()) {
                                tabVerif[0] = verifNomProduit.toString();
                            } else if (!verifdte.isEmpty()) {
                                tabVerif[1] = dteverif[2];
                                tabVerif[2] = dteverif[1];
                                tabVerif[3] = dteverif[0];

                            } else if (!verifdteg.isEmpty()) {
                                tabVerif[4] = dteverif[2];
                                tabVerif[5] = dteverif[1];
                                tabVerif[6] = dteverif[0];

                            } else if (!verifQteProduit.isEmpty()) {
                                tabVerif[7] = verifQteProduit.toString();
                            } else if (!verifPrixProduit.isEmpty()) {
                                tabVerif[8] = verifPrixProduit.toString();
                            }


                           /*
                        Parcours de la base de donnée bdd pour chercher si un produit porte le même nom que celui saisi par l'utilisateur
                         */

                            /*Création de 2 objects de la classe StringBuilder qui nous permettront de vérifier l'état des opérations
                             * statutProduit vérifie si l'opération déjà été effectuée
                             * */

                            StringBuilder statutProduit = new StringBuilder();
                            System.out.println("\t-------------------------------------");
                            /*La variable statut_p permet d'arrêter la recherche dans bdd lorsqu'on a trouvé un produit portant le même nom que celui porté par l'utilisateur*/
                            StringBuilder statut_p = new StringBuilder();

                            for (String[] article : bdd) {
                                for (String element : article) {
                                    if (!element.isEmpty() && element.equals(tabVerif[0])) {

                                        /*Si un article portant le même nom est trouvé dans bdd alors un message de confirmation pour continuer l'opération s'affiche*/

                                        System.out.println("\t\u001B[31m\u001B[3mCe produit est déjà présente dans la base de données, Souhaitez-vous l'ajouter quand même?\u001B[0m\n\t1. Oui\n\t2. Non");

                                        /*Il est demandé à l'utilisateur d'opérer un choix pour continuer ou non l'opération*/
                                        System.out.print("\tVeuillez saisir le choix opéré: ");
                                        reponse = sc.nextInt();
                                        System.out.println("\t-------------------------------------");
                                        statut_p.append("ok");
                                    }
                                    if (statut_p.toString().equals("ok")) {
                                        break;
                                    }

                                }
                            }

                            /*Définir une condition en fonction du choix porté par l'utilsateur
                             * si la varibale statut_p a la valeur "ok" c'est que un produit portant la même nom que celui porté par l'utilisateur existe et l'utilisateur a fait le choix de continuer l'opération
                             * si la variable statut_p n'a pas de valeur alors aucune correspondance n'a été trouvé dans la base de donnéé
                             **/

                            if (statut_p.toString().equals("ok")) {
                                /*Boucle pour vérifier si le nom de produit choisie par l'utilisateur n'est pas vide*/
                                while (reponse != 1 && reponse != 2) {
                                    System.out.println("\tLe choix opéré n'est pas configuré, Entrez 1 pour ajouter et 2 pour annuler \n\t1. Oui\n\t2. Non");
                                    reponse = sc.nextInt();
                                    sc.nextLine();
                                }


                                switch (reponse) {
                                    case 1:  /*Cas où l'utilisateur choisi d'ajouter le nom de produit malgré son existence dans bdd*/
                                        reponse = 1;

                                        /*Dans ce cas de figure, l'utilisation peut continuer son enregistrement*/

                                        statutProduit.append("ok");


                                        /*Un message de confirmation avant d'ajouter l'article*/
                                        System.out.println("\tVous êtes sur le point d'ajouter " + tabVerif[7] + " " + tabVerif[0] + " au prix de " + tabVerif[8] + " FCFA l'unité.\n\tSouhaitez-vous continuer?\n\t1. Oui \n\t2. Non");
                                        System.out.print("\tVeuillez saisir le choix opéré: ");
                                        reponse = sc.nextInt();
                                        sc.nextLine();
                                        System.out.println("\t-------------------------------------");

                                        /*Boucle pour vérifier si le choix fait par l'utilisateur est compris entre 1 et 2*/
                                        while (reponse != 1 && reponse != 2) {
                                            System.out.println("\tLe choix opéré n'est pas configuré, Entrez 1 pour ajouter et 2 pour annuler \n\t1. Oui\n\t2. Non");
                                            reponse = sc.nextInt();
                                            sc.nextLine();
                                        }

                                        /*Programme à exécuter en fonction du choix de l'utilisateur*/
                                        switch (reponse) {
                                            case 1:   /*Cas où l'utilisateur choisi de continuer l'opération*/


                                                /*Création d'un objet statut de la classe StringBuilder pour vérifier si la base de donnée bdd est pleine
                                                 * si cette variable a la valeur ok, la base de donnée n'est pas pleine et si elle est vide la base est pleine.
                                                 *  */

                                                StringBuilder statut = new StringBuilder();
                                                statut.append("");

                                                for (int verifBdd = 1; verifBdd < bdd.length; verifBdd++) {

                                                    /*Recherche des lignes vides*/

                                                    if (bdd[verifBdd][0].isEmpty()) {

                                                        /*Incremente le numéro d'ordre*/

                                                        if (verifBdd == 1) {
                                                            bdd[verifBdd][0] = "1";
                                                        } else {
                                                            bdd[verifBdd][0] = String.valueOf(Integer.parseInt(bdd[verifBdd - 1][0]) + 1);
                                                        }

                                                        /*Remplissage de la base de données bdd*/
                                                        bdd[verifBdd][1] = tabVerif[0];
                                                        bdd[verifBdd][2] = tabVerif[1] + "/" + tabVerif[2] + "/" + tabVerif[3];
                                                        bdd[verifBdd][3] = tabVerif[4] + "/" + tabVerif[5] + "/" + tabVerif[6];
                                                        bdd[verifBdd][4] = tabVerif[7];
                                                        bdd[verifBdd][5] = tabVerif[8];
                                                        bdd[verifBdd][6] = String.valueOf(Integer.parseInt(tabVerif[7]) * Integer.parseInt(tabVerif[8]));

                                                        statut.append("ok");
                                                        break;
                                                    } else {
                                                        statut.append("");
                                                    }

                                                }

                                                /*Affichage du message de validation de l'opération*/
                                                if (statut.toString().equals("ok")) {
                                                    System.out.println("\t\u001B[32m\u001B[3mArticle ajouté avec succès\u001B[0m");
                                                    System.out.println("\t-------------------------------------");

                                                    System.out.println(bdd[0][0] + "\t\t\t" + bdd[0][1] + "\t" + bdd[0][2] + "\t\t\t" + bdd[0][3] + "\t\t" + bdd[0][4] + "\t\t\t\t" + bdd[0][5] + "\t\t" + bdd[0][6]);

                                                   somTotal = 0;
                                                    for (int i = 1; i < bdd.length; i++) {
                                                        for (int j = 0; j < bdd[i].length; j++) {
                                                            // Alignement des colonnes avec des espaces pour un affichage bien ordonné
                                                            System.out.printf("%-20s", bdd[i][j]);


                                                        }
                                                        if (!bdd[i][6].equals("")) {
                                                            somTotal += Integer.parseInt(bdd[i][6]);
                                                        }
                                                        System.out.println(); // Nouvelle ligne après chaque ligne du tableau
                                                    }
                                                    System.out.println("-----------------------------------------------------------------------------------------------------------------------" + somTotal + " FCFA");

                                                } else {
                                                    System.out.println("\t\u001B[31m\u001B[3mLa base de donnée renvoie : pleine\u001B[0m");
                                                    System.out.println("\t-------------------------------------");
                                                }

                                                break;
                                            case 2: /*Cas où l'utilisateur choisi d'annuler l'opération*/

                                                /*Un message de confirmation avant d'annuler l'opération*/

                                                System.out.println("`\tVous êtes sur le point d'annuler cette opération," + "Souhaitez-vous annuler?\n\t" + "1. Oui\n\t2. Non");
                                                System.out.print("\tVeuillez saisir le choix opéré: ");
                                                reponse = sc.nextInt();
                                                sc.nextLine();

                                                /*Boucle pour vérifier si le choix fait par l'utilisateur est compris entre 1 et 2*/

                                                while (reponse != 1 && reponse != 2) {
                                                    System.out.println("\tLe choix opéré n'est pas configuré, Entrez 1 pour annuler et 2 pour ajouter l'article \n\t1. Oui\n\t2. Non");
                                                    reponse = sc.nextInt();
                                                    sc.nextLine();
                                                }
                                                System.out.println("\t-------------------------------------");

                                                /*Programme à exécuter en fonction du choix de l'utilisateur*/
                                                switch (reponse) {
                                                    case 1: /*Cas où l'utilisateur choisi d'annuler l'opération*/

                                                        statut = new StringBuilder();
                                                        statut.append("");
                                                        System.out.println("\u001B[31m\u001B[3mOpération annulée\u001B[0m");
                                                        break;

                                                    case 2: /*Cas où l'utilisateur choisi de continuer l'opération*/
                                                        statut = new StringBuilder();
                                                        statut.append("");

                                                        for (int verifBdd = 1; verifBdd < bdd.length; verifBdd++) {

                                                            /*Recherche des lignes vides*/

                                                            if (bdd[verifBdd][0].isEmpty()) {

                                                                /*Incremente le numéro d'ordre*/

                                                                if (verifBdd == 1) {
                                                                    bdd[verifBdd][0] = "1";
                                                                } else {
                                                                    bdd[verifBdd][0] = String.valueOf(Integer.parseInt(bdd[verifBdd - 1][0]) + 1);
                                                                }

                                                                /*Remplissage de la base de données bdd*/
                                                                bdd[verifBdd][1] = tabVerif[0];
                                                                bdd[verifBdd][2] = tabVerif[1] + "/" + tabVerif[2] + "/" + tabVerif[3];
                                                                bdd[verifBdd][3] = tabVerif[4] + "/" + tabVerif[5] + "/" + tabVerif[6];
                                                                bdd[verifBdd][4] = tabVerif[7];
                                                                bdd[verifBdd][5] = tabVerif[8];
                                                                bdd[verifBdd][6] = String.valueOf(Integer.parseInt(tabVerif[7]) * Integer.parseInt(tabVerif[8]));
                                                                statut.append("ok");
                                                                break;
                                                            } else {
                                                                statut.append("");
                                                            }

                                                        }


                                                        if (statut.toString().equals("ok")) {
                                                            System.out.println("\t\u001B[32m\u001B[3mArticle ajouté avec succès\u001B[0m");
                                                            System.out.println("\t-------------------------------------");
                                                        } else {
                                                            System.out.println("\t\u001B[31m\u001B[3mLa base de donnée renvoie : pleine\u001B[0m");
                                                            System.out.println("\t-------------------------------------");
                                                        }

                                                        break;
                                                    default:

                                                }
                                                break;
                                            default:

                                        }
                                        break;

                                    case 2:
                                        reponse = 2; /*Cas où l'utilisateur choisit d'annuler l'opération à cause du nom du produit identique*/
                                        statutProduit.append("ok");
                                        System.out.println("\t\u001B[31m\u001B[3mOpération annulée\u001B[0m");
                                        System.out.println("\t-------------------------------------");

                                        break;
                                    default:

                                }
                            }


                            if (!statutProduit.toString().equals("ok")) {  /*Condition qui vérifie si l'opération a déjà été effectuée suite à l'ajout d'un article existant*/
                                StringBuilder statut = new StringBuilder();
                                statut.append("");

                                for (int verifBdd = 1; verifBdd < bdd.length; verifBdd++) {

                                    /*Recherche des lignes vides*/

                                    if (bdd[verifBdd][0].isEmpty()) {


                                        /*Incremente le numéro d'ordre*/


                                        if (verifBdd == 1) {
                                            bdd[verifBdd][0] = "1";
                                        } else {
                                            bdd[verifBdd][0] = String.valueOf(Integer.parseInt(bdd[verifBdd - 1][0]) + 1);
                                        }

                                        /*Remplissage de la base de données bdd*/
                                        bdd[verifBdd][1] = tabVerif[0];
                                        bdd[verifBdd][2] = tabVerif[1] + "/" + tabVerif[2] + "/" + tabVerif[3];
                                        bdd[verifBdd][3] = tabVerif[4] + "/" + tabVerif[5] + "/" + tabVerif[6];
                                        bdd[verifBdd][4] = tabVerif[7];
                                        bdd[verifBdd][5] = tabVerif[8];
                                        bdd[verifBdd][6] = String.valueOf(Integer.parseInt(tabVerif[7]) * Integer.parseInt(tabVerif[8]));
                                        statut.append("ok");
                                        break;
                                    } else {
                                        statut.append("");
                                    }

                                }
                                if (statut.toString().equals("ok")) {
                                    System.out.println("\t\u001B[32m\u001B[3mArticle ajouté avec succès\u001B[0m");
                                    System.out.println("\t-------------------------------------");
                                    System.out.println(bdd[0][0] + "\t\t\t" + bdd[0][1] + "\t" + bdd[0][2] + "\t\t\t" + bdd[0][3] + "\t\t" + bdd[0][4] + "\t\t\t\t" + bdd[0][5] + "\t\t" + bdd[0][6]);

                                    somTotal = 0;
                                    for (int i = 1; i < bdd.length; i++) {
                                        for (int j = 0; j < bdd[i].length; j++) {
                                            // Alignement des colonnes avec des espaces pour un affichage bien ordonné
                                            System.out.printf("%-20s", bdd[i][j]);


                                        }
                                        if (!bdd[i][6].equals("")) {
                                            somTotal += Integer.parseInt(bdd[i][6]);
                                        }
                                        System.out.println(); // Nouvelle ligne après chaque ligne du tableau
                                    }
                                    System.out.println("-----------------------------------------------------------------------------------------------------------------------" + somTotal + " FCFA");

                                } else {
                                    System.out.println("\t\u001B[31m\u001B[3mLa base de donnée renvoie : pleine\u001B[0m");
                                    System.out.println("\t-------------------------------------");
                                }
                            }

                        }
                        break;

                    case 3:
                        menuchoisi = 3;  /*Supprimer un article */

                        /*Choix du numéro d'ordre de l'article à supprimer*/
                        System.out.print("\tVeuillez saisir le Nº d'ordre de l'article à supprimer: ");
                        int n_ordre = sc.nextInt();
                        sc.nextLine();

                        /*Boucle pour vérifier si le numéro d'ordre est présent dans bdd */
                        while (n_ordre != 1 && n_ordre != 2 && n_ordre != 3 && n_ordre != 4 && n_ordre != 5 && n_ordre != 6 && n_ordre != 7 && n_ordre != 8 && n_ordre != 9 && n_ordre != 10) {
                            n_ordre = 0;
                            System.out.println("\tL'article sélectionné n'existe pas ou est incorrect");
                            System.out.print("\tVeuillez choisir un article existant ou correct (entre 1 et 10): ");
                            n_ordre = sc.nextInt();
                            sc.nextLine();
                        }
                        StringBuilder statutSuppr = new StringBuilder();
                        for (int i = 1; i < 11; i++) {

                            if (bdd[i][0].equals(String.valueOf(n_ordre))) {
                                System.out.println("\t\u001B[31m\u001B[3mVous êtes sur le point de supprimer l'article \u001B[0m" + bdd[i][1] + "\u001B[31m, prix: \u001B[0m" + bdd[i][4] + "\u001B[0m" + "\n\tSouhaitez-vous continuer?\n\t1. Oui\n\t2. Non");
                                System.out.print("\tVeuillez saisir le choix opéré: ");
                                reponse = sc.nextInt();
                                sc.nextLine();
                                System.out.println("\t-------------------------------------");
                                while (reponse != 1 && reponse != 2) {
                                    System.out.println("\tLe choix opéré n'est pas configuré, Entrez 1 pour supprimer et 2 pour annuler \n\t1. Oui\n\t2. Non");
                                    reponse = sc.nextInt();
                                    sc.nextLine();
                                }

                                switch (reponse) {
                                    case 1:
                                        reponse = 1;

                                        bdd[i][0] = "";
                                        bdd[i][1] = "";
                                        bdd[i][2] = "";
                                        bdd[i][3] = "";
                                        bdd[i][4] = "";
                                        bdd[i][5] = "";
                                        bdd[i][6] = "";

                                        System.out.println("\t\u001B[31m\u001B[3mOpération supprimé\u001B[0m");
                                        statutSuppr.append("ok");
                                        break;

                                    case 2:
                                        reponse = 2;
                                        System.out.println("\t\u001B[31m\u001B[3mOpération annulée\u001B[0m");
                                        statutSuppr.append("ok");
                                        break;
                                    default:

                                        break;
                                }

                            }
                            if (statutSuppr.toString().equals("ok")) {
                                break;
                            }
                        }

                        if (!statutSuppr.toString().equals("ok")) {
                            System.out.println("\t\u001B[31m\u001B[3mAucune référence trouvée\u001B[0m");
                            ;
                        }
                        System.out.println("\t-------------------------------------");
                        break;
                    case 4:
                        menuchoisi = 4;
                        System.out.print("\tVeuillez saisir le Nº d'ordre de l'article à modifier: ");
                        n_ordre = sc.nextInt();
                        sc.nextLine();
                        while (n_ordre != 1 && n_ordre != 2 && n_ordre != 3 && n_ordre != 4 && n_ordre != 5 && n_ordre != 6 && n_ordre != 7 && n_ordre != 8 && n_ordre != 9 && n_ordre != 10) {
                            n_ordre = 0;
                            System.out.println("\tL'article sélectionné n'existe pas ou est incorrect");
                            System.out.print("\tVeuillez choisir un article existant ou correct (entre 1 et 10): ");
                            n_ordre = sc.nextInt();
                            sc.nextLine();
                        }
                        StringBuilder statutModif = new StringBuilder();
                        for (int i = 1; i < 11; i++) {

                            if (bdd[i][0].equals(String.valueOf(n_ordre))) {
                                System.out.println("\t\u001B[31m\u001B[3mVous êtes sur le point de modifier la " + bdd[i][0] + "e opération, \u001B[0m Nom de l'article : " + bdd[i][1] + "\u001B[31m, Qté: \u001B[0m" + bdd[i][4] + "\u001B[31m, Prix: \u001B[0m" + bdd[i][5] + "\u001B[0m" + "\n\tSouhaitez-vous continuer?\n\t1. Oui\n\t2. Non");
                                System.out.print("\tVeuillez saisir le choix opéré: ");
                                reponse = sc.nextInt();
                                sc.nextLine();

                                while (reponse != 1 && reponse != 2) {
                                    System.out.println("\tLe choix opéré n'est pas configuré, Entrez 1 pour modifier et 2 pour annuler \n\t1. Oui\n\t2. Non");
                                    reponse = sc.nextInt();
                                    sc.nextLine();
                                }


                                switch (reponse) {
                                    case 1:
                                        reponse = 1;
                                        System.out.println("\t-------------------------------------");
                                        System.out.println("\tQuel est l'information que vous souhaitez modifier :" + "\n\t1. Nom de l'article\n\t2. Date de fin de garantie\n\t3. Prix\n\t4. Qté\n\t5. Tout modifier");
                                        System.out.println("\t-------------------------------------");
                                        System.out.print("\tVeuillez saisir le choix opéré: ");
                                        int reponseModif = sc.nextInt();
                                        sc.nextLine();
                                        while (reponseModif != 1 && reponseModif != 2 && reponseModif != 3 && reponseModif != 4 && reponseModif != 5) {
                                            System.out.println("\tLe choix opéré n'est pas configuré, saisir \n\t1 pour modifier le nom et \n\t2 pour modifier la date de fin de garantie" + "\n\t3 pour modifier le prix\n\tpour tout modifier\n\t1. Oui\n\t2. Non");
                                            reponseModif = sc.nextInt();
                                            sc.nextLine();
                                        }
                                        System.out.println("\t-------------------------------------");
                                        switch (reponseModif) {
                                            case 1:
                                                reponseModif = 1;
                                                System.out.print("\tVeuillez saisir le nom de l'article: ");
                                                String nomProduit1 = sc.nextLine().toUpperCase();
                                                while (nomProduit1.isEmpty()) {
                                                    System.out.print("\tVeuillez saisir un nom de produit valide: ");
                                                    nomProduit1 = sc.nextLine();
                                                }

                                                bdd[i][1] = nomProduit1;
                                                System.out.println("\t-------------------------------------");
                                                System.out.println("\t\u001B[32m\u001B[3mNom de l'article modifié\u001B[0m");
                                                statutModif.append("ok");
                                                break;
                                            case 2:
                                                reponseModif = 2;
                                                System.out.print("\tVeuillez entrez la date de garantie(format:JJ/MM/AAAA): ");
                                                sc.nextLine();
                                                String dteGarantie = sc.nextLine();
                                                String[] verifDateGarantie = dteGarantie.split("/");
                                                while (dteGarantie.length() != 10 || verifDateGarantie.length != 3) {
                                                    System.out.print("\tVeuillez entrez une date valide (format:JJ/MM/AAAA): ");
                                                    dteGarantie = sc.nextLine();
                                                }
                                                LocalDate dateGarantie = LocalDate.of(Integer.parseInt(verifDateGarantie[2]), Integer.parseInt(verifDateGarantie[1]), Integer.parseInt(verifDateGarantie[0]));
                                                String[] dte = bdd[i][2].split("/");
                                                LocalDate dateEnregistrement = LocalDate.of(Integer.parseInt(dte[0]), Integer.parseInt(dte[1]), Integer.parseInt(dte[2]));
                                                while (!dateGarantie.isAfter(dateEnregistrement)) {
                                                    System.out.print("\tLa date de garantie doit être postérieure à la date d'enregistrement" + "\n\tVeuillez entrez une date valide (format:JJ/MM/AAAA): ");
                                                    dteGarantie = sc.nextLine();
                                                    verifDateGarantie = dteGarantie.split("/");
                                                    dateGarantie = LocalDate.of(Integer.parseInt(verifDateGarantie[2]), Integer.parseInt(verifDateGarantie[1]), Integer.parseInt(verifDateGarantie[0]));
                                                }
                                                bdd[i][2] = String.valueOf(dateGarantie);
                                                System.out.println("\t\u001B[32m\u001B[3mDate de fin de garantie modifiée avec succès\u001B[0m");
                                                System.out.println("\t-------------------------------------");
                                                statutModif.append("ok");
                                                break;
                                            case 3:
                                                reponseModif = 3;
                                                System.out.print("\tVeuillez saisir le prix de l'article :");
                                                int prixProduit = sc.nextInt();
                                                while (prixProduit == 0) {
                                                    System.out.println("\tVeuillez saisir un prix valide et supérieur à 0");
                                                    prixProduit = sc.nextInt();
                                                    sc.nextLine();
                                                }
                                                bdd[i][5] = String.valueOf(prixProduit);
                                                bdd[i][6] = String.valueOf((Integer.parseInt(bdd[i][4]) * Integer.parseInt(bdd[i][5])));
                                                System.out.println("\t\u001B[32m\u001B[3mPrix modifié avec succès\u001B[0m");
                                                statutModif.append("ok");
                                                break;
                                            case 4:
                                                reponseModif = 4;

                                                System.out.print("\tVeuillez saisir la quantité de l'article :");
                                                int qteProduit = sc.nextInt();
                                                while (qteProduit == 0) {
                                                    System.out.println("\tVeuillez saisir un prix valide et supérieur à 0");
                                                    qteProduit = sc.nextInt();
                                                    sc.nextLine();
                                                }
                                                bdd[i][5] = String.valueOf(qteProduit);

                                                bdd[i][6] = String.valueOf((Integer.parseInt(bdd[i][4]) * Integer.parseInt(bdd[i][5])));
                                                System.out.println("\t\u001B[32m\u001B[3mQuantité modifiée avec succès\u001B[0m");
                                                statutModif.append("ok");

                                                break;
                                            case 5:
                                                reponseModif = 5;
                                                System.out.print("\tVeuillez saisir le nom de l'article: ");
                                                produit = sc.nextLine().toUpperCase();
                                                while (produit.isEmpty()) {
                                                    System.out.print("\tVeuillez saisir un nom de l'article valide: ");
                                                    produit = sc.nextLine();
                                                }
                                                bdd[i][1] = produit;
                                                System.out.print("\tVeuillez entrez la date de garantie(format:JJ/MM/AAAA): ");
                                                dteGarantie = sc.nextLine();
                                                verifDateGarantie = dteGarantie.split("/");
                                                while (dteGarantie.length() != 10 || verifDateGarantie.length != 3) {
                                                    System.out.print("\tVeuillez entrez une date valide (format:JJ/MM/AAAA): ");
                                                    dteGarantie = sc.nextLine();
                                                }
                                                dateGarantie = LocalDate.of(Integer.parseInt(verifDateGarantie[2]), Integer.parseInt(verifDateGarantie[1]), Integer.parseInt(verifDateGarantie[0]));
                                                dte = bdd[i][3].split("/");
                                                dateEnregistrement = LocalDate.of(Integer.parseInt(dte[0]), Integer.parseInt(dte[1]), Integer.parseInt(dte[2]));
                                                while (!dateGarantie.isAfter(dateEnregistrement)) {
                                                    System.out.print("\tLa date de garantie doit être postérieure à la date d'enregistrement" + "\n\tVeuillez entrez une date valide (format:JJ/MM/AAAA): ");
                                                    dteGarantie = sc.nextLine();
                                                    verifDateGarantie = dteGarantie.split("/");
                                                    dateGarantie = LocalDate.of(Integer.parseInt(verifDateGarantie[2]), Integer.parseInt(verifDateGarantie[1]), Integer.parseInt(verifDateGarantie[0]));
                                                }
                                                bdd[i][3] = String.valueOf(dateGarantie);

                                                System.out.print("\tVeuillez saisir le prix de l'article :");
                                                prixProduit = sc.nextInt();
                                                sc.nextLine();
                                                while (prixProduit == 0) {
                                                    System.out.println("\tVeuillez saisir un prix valide et supérieur à 0");
                                                    prixProduit = sc.nextInt();
                                                    sc.nextInt();
                                                }
                                                bdd[i][4] = String.valueOf(prixProduit);

                                                System.out.print("\tVeuillez saisir la quantité de l'article :");
                                                qteProduit = sc.nextInt();
                                                while (qteProduit == 0) {
                                                    System.out.println("\tVeuillez saisir un prix valide et supérieur à 0");
                                                    qteProduit = sc.nextInt();
                                                    sc.nextLine();
                                                }
                                                bdd[i][5] = String.valueOf(qteProduit);
                                                bdd[i][6] = String.valueOf((Integer.parseInt(bdd[i][4]) * Integer.parseInt(bdd[i][5])));
                                                System.out.println("\t\u001B[32m\u001B[3mModification effectuée avec succès\u001B[0m");

                                                statutModif.append("ok");
                                                break;
                                            default:

                                                break;
                                        }


                                        break;

                                    case 2:
                                        reponse = 2;
                                        System.out.println("\t-------------------------------------");
                                        System.out.println("\t\u001B[31m\u001B[3mOpération annulée\u001B[0m");
                                        break;
                                    default:

                                        break;
                                }

                            }
                            if (statutModif.toString().equals("ok")) {
                                break;
                            }
                        }

                        if (!statutModif.toString().equals("ok")) {

                            System.out.println("\t\u001B[31m\u001B[3mAucune référence trouvée\u001B[0m");

                            break;
                        }

                        System.out.println("\t-------------------------------------");
                        break;
                    case 5:
                        System.out.println("\t\u001B[31m\u001B[3mMenu non configuré\u001B[0m");
                        break;
                    case 6:
                        System.out.println("\tVous êtes sur le point de vous sortir du programme, Souhaitez-vous continuer?\n\t" + "1. Oui\n\t2. Non");
                        System.out.print("\tVeuillez saisir le choix opéré: ");
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
                                exit = 0;
                                break;
                            case 2:
                                System.out.println("\t\u001B[32m\u001B[3mNous sommes ravis que vous ayez décidé de rester avec nous ! \n\t" + "Votre engagement envers notre programme est précieux et nous sommes \n\t" + "déterminés à vous offrir la meilleure expérience possible. Si vous avez \n\t" + "des questions, des suggestions ou si vous avez besoin d'aide, n'hésitez \n\t" + "pas à nous contacter. Merci encore pour votre confiance et votre fidélité !\u001B[0m\n\t");
                                System.out.println("\t--------------------------------------------------------------------");
                        }
                        break;
                    default:


                }

            } else if (!dem.isEmpty() && (dem.equalsIgnoreCase("exit"))) {
                System.out.println("\t\u001B[31m\u001B[3mMerci d'avoir utilisé notre programme. Nous espérons que vous avez\n\t" + "trouvé l'expérience agréable et utile. N'hésitez pas à revenir si vous avez besoin d'aide \n\t" + "à l'avenir. À bientôt !\u001B[0m\n");
                System.out.println("\t--------------------------------------------------------------------");
                exit = 0;

            } else {
                System.out.println("\tVeuillez saisir le mot 'launch' pour lancer le programme ou 'exit' pour sortir du programme");
                System.out.println("\t--------------------------------------------------------------------");
            }
        }
        sc.close();
    }
}
