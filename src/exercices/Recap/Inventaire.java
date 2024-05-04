package exercices.Recap;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

import static java.lang.System.*;

public class Inventaire implements Fichier {
    public UUID id;
    protected String nom;
    protected LocalDate DateEnreg;
    protected LocalDate DateGarantie;
    protected int qte;
    protected int prix;
    protected int prixTotal;

    public Inventaire() {
    }

    public Inventaire(UUID id, String nom, LocalDate dateEnreg, LocalDate dateGarantie, int qte, int prix, int prixTotal) {
        this.id = UUID.randomUUID();
        this.nom = nom;
        DateEnreg = dateEnreg;
        DateGarantie = dateGarantie;
        this.qte = qte;
        this.prix = prix;
        this.prixTotal = prixTotal;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateEnreg() {
        return DateEnreg;
    }

    public void setDateEnreg(LocalDate dateEnreg) {
        DateEnreg = dateEnreg;
    }

    public LocalDate getDateGarantie() {
        return DateGarantie;
    }

    public void setDateGarantie(LocalDate dateGarantie) {
        DateGarantie = dateGarantie;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(int prixTotal) {
        this.prixTotal = prixTotal;
    }

    @Override
    public String toString() {
        return "Inventaire{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", DateEnreg=" + DateEnreg +
                ", DateGarantie=" + DateGarantie +
                ", qte=" + qte +
                ", prix=" + prix +
                ", prixTotal=" + prixTotal +
                '}';
    }


    public int afficherMenu() {
        Scanner sc = new Scanner(in);
        /**
         Définition des différents menus du programme
         */
        out.println("\t-------------------------------------");
        out.println("\t|\t------Choix du menu------\t\t|");
        out.println("\t|\t1. Afficher un inventaire\t\t|");
        out.println("\t|\t2. Ajouter un article\t\t\t|");
        out.println("\t|\t3. Supprimer un article\t\t\t|");
        out.println("\t|\t4. Sortir\t\t\t\t\t\t|");
        out.println("\t-------------------------------------");

        /**
         Recupérer la donnée entrée par l'utilisateur dans le variable menuChoisi
         */
        out.print("\tVeuillez choisir l'opération à exécuter? ");
        int menuchoisi = 0;
        try {
            menuchoisi = sc.nextInt();
            sc.nextLine();
            out.println("\t-------------------------------------");
            while (menuchoisi != 1 && menuchoisi != 2 && menuchoisi != 3 && menuchoisi != 4 ) {
                menuchoisi = 0;
                out.println("\tLe menu sélectionné n'existe pas ou est incorrect");
                out.print("\tVeuillez choisir un menu existant ou correct (entre 1 et 6): ");
                menuchoisi = sc.nextInt();
                sc.nextLine();
                out.println("\t-------------------------------------");
            }
        } catch (Exception e) {
            out.println("\t-------------------------------------");
            out.println("\t\u001B[31mSaisie incorrecte, Erreur interne: " + e.getMessage() + "\u001B[00m");
        }
        return menuchoisi;

    }

    public List<String> ajoutArticle(List<String> listArticle, File file) throws FileNotFoundException {
        Scanner sc = new Scanner(in);
        out.println("\t\t-----Ajout d'un article-----\t\t");

        /**Recupérer les informations sur l'article*/

        out.print("\tVeuillez saisir toutes les informations sur l'article NomProduit,2024,04,10,2025,04," + "10,qté,prix: ");
        String produit = sc.nextLine().toUpperCase();


        /**Boucle pour vérifier si les informations ont été bien saisies*/

        String[] tabVerif = produit.split(",");
        while (tabVerif.length != 9 && !produit.equals("EXIT")) {
            out.print("\t\u001B[31mLes informations saisies sont incomplètes\u001B[0m, Veuillez saisir à nouveau (saisir 'exit' pour revenir au menu): ");
            produit = sc.nextLine().toUpperCase();
        }

        /**vérification des données saisies par l'utilisateur*/
        out.println("\t-------------------------------------");
        /*Vérification du nom du Produit*/
        StringBuilder verifNomProduit = new StringBuilder();
        verifNomProduit.append("");
        while (tabVerif[0].equals("")) {
            out.print("\t\u001B[31mNom de l'article non saisi\u001B[0m, Veuillez saisir le nom de l'article: ");
            verifNomProduit.append(sc.nextLine());
            tabVerif[0] = verifNomProduit.toString();
        }
        if (!produit.equals("EXIT")) {
            LocalDate dateEnregistrement = LocalDate.of(Integer.parseInt(tabVerif[1]), Integer.parseInt(tabVerif[2]), Integer.parseInt(tabVerif[3]));
            LocalDate dateGarantie = LocalDate.of(Integer.parseInt(tabVerif[4]), Integer.parseInt(tabVerif[5]), Integer.parseInt(tabVerif[6]));


            /**Vérification que la date de garantie est postérieure à la date d'enregistrement*/
            StringBuilder verifDate = new StringBuilder();
            String[] dteverif = new String[3];
            verifDate.append("");
            int choix;
            StringBuilder verifdte = new StringBuilder();
            StringBuilder verifdteg = new StringBuilder();

            /**Boucle pour vérifier si la date de garantie est postérieure à la date d'enregistrement*/
            while (!dateGarantie.isAfter(dateEnregistrement)) {
                out.println("\tQuelle date souhaitez-vous modifier?\n\t1. Date d'enregistrement\n\t2. Date de garantie");
                out.print("\tVeuillez Saisir le choix opéré: ");
                choix = sc.nextInt();
                sc.nextLine();
                while (choix != 1 && choix != 2) {
                    out.print("\tChoix non configuré, saisir à nouveau: ");
                    choix = sc.nextInt();
                    sc.nextLine();
                }
                out.println("\t-------------------------------------");
                /**Choix de la date à modifier*/
                if (choix == 1) {
                    out.print("\tVeuillez saisir la date d'enregistrement (JJ/MM/AAAA) : ");
                    verifdte.append(sc.nextLine());
                    dteverif = verifdte.toString().split("/");
                    while (dteverif.length != 3) {
                        out.print("\tLa date saisie n'est pas correct, saisir à nouveau : ");
                        verifdte.append(sc.nextLine());
                        dteverif = verifdte.toString().split("/");
                    }
                    dateEnregistrement = LocalDate.of(Integer.parseInt(dteverif[2]), Integer.parseInt(dteverif[1]), Integer.parseInt(dteverif[0]));
                } else if (choix == 2) {
                    out.print("\tVeuillez saisir la date de garantie (JJ/MM/AAAA) : ");
                    verifdteg.append(sc.nextLine());
                    dteverif = verifdteg.toString().split("/");
                    while (dteverif.length != 3) {
                        out.print("\tLa date saisie n'est pas correct, saisir à nouveau : ");
                        verifdteg.append(sc.nextLine());
                        dteverif = verifdteg.toString().split("/");
                    }
                    dateGarantie = LocalDate.of(Integer.parseInt(dteverif[2]), Integer.parseInt(dteverif[1]), Integer.parseInt(dteverif[0]));
                }
            }


            /**Vérification de la quantité du Produit*/
            StringBuilder verifQteProduit = new StringBuilder();
            verifQteProduit.append("");
            while (tabVerif[7].equals("0")) {
                out.print("\t\u001B[31mLa quantité ne peut pas être nulle\u001B[0m, Veuillez saisir la quantité: ");
                verifQteProduit.append(sc.nextLine());
                tabVerif[7] = verifQteProduit.toString();
            }

            StringBuilder verifPrixProduit = new StringBuilder();
            verifPrixProduit.append("");
            while (tabVerif[8].equals("0")) {
                out.print("\t\u001B[31mLe prix ne peut pas être nulle\u001B[0m, Veuillez saisir la prix: ");
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


            /**
             Parcours de la base de donnée bdd pour chercher si un produit porte le même nom que celui saisi par l'utilisateur
             */

            /**Création de 2 objects de la classe StringBuilder qui nous permettront de vérifier l'état des opérations
             * statutProduit vérifie si l'opération déjà été effectuée
             * */

            StringBuilder statutProduit = new StringBuilder();
            /*La variable statut_p permet d'arrêter la recherche dans bdd lorsqu'on a trouvé un produit portant le même nom que celui porté par l'utilisateur*/
            StringBuilder statut_p = new StringBuilder();
            int reponse = 0;
            for (String article : listArticle) {
                if (!article.isEmpty() && article.equals(tabVerif[0])) {

                    /*Si un article portant le même nom est trouvé dans bdd alors un message de confirmation pour continuer l'opération s'affiche*/

                    out.println("\t\u001B[31m\u001B[3mCe produit est déjà présente dans la base de données, Souhaitez-vous l'ajouter quand même?\u001B[0m\n\t1. Oui\n\t2. Non");

                    /*Il est demandé à l'utilisateur d'opérer un choix pour continuer ou non l'opération*/
                    out.print("\tVeuillez saisir le choix opéré: ");

                    try {
                        reponse = sc.nextInt();
                        sc.nextLine();
                        out.println("\t-------------------------------------");
                        statut_p.append("ok");
                    } catch (Exception e) {
                        out.println("\t\u001B[31mSaisie incorrecte, erreur interne: " + e.getMessage() + "\u001B[00m");
                    }

                }
                if (statut_p.toString().equals("ok")) {
                    break;
                }


            }

            /**Définir une condition en fonction du choix porté par l'utilsateur
             * si la varibale statut_p a la valeur "ok" c'est que un produit portant la même nom que celui porté par l'utilisateur existe et l'utilisateur a fait le choix de continuer l'opération
             * si la variable statut_p n'a pas de valeur alors aucune correspondance n'a été trouvé dans la base de donnéé
             **/

            if (statut_p.toString().equals("ok")) {
                /**Boucle pour vérifier si le nom de produit choisie par l'utilisateur n'est pas vide*/
                while (reponse != 1 && reponse != 2) {
                    out.println("\tLe choix opéré n'est pas configuré, Entrez 1 pour ajouter et 2 pour annuler \n\t1. Oui\n\t2. Non");
                    reponse = sc.nextInt();
                    sc.nextLine();
                }


                switch (reponse) {
                    case 1:  /**Cas où l'utilisateur choisi d'ajouter le nom de produit malgré son existence dans bdd*/
                        reponse = 1;

                        /**Dans ce cas de figure, l'utilisation peut continuer son enregistrement*/

                        statutProduit.append("ok");


                        /**Un message de confirmation avant d'ajouter l'article*/
                        out.println("\tVous êtes sur le point d'ajouter " + tabVerif[7] + " " + tabVerif[0] + " au prix de " + tabVerif[8] + " FCFA l'unité.\n\tSouhaitez-vous continuer?\n\t1. Oui \n\t2. Non");
                        out.print("\tVeuillez saisir le choix opéré: ");
                        reponse = sc.nextInt();
                        sc.nextLine();
                        out.println("\t-------------------------------------");

                        /*Boucle pour vérifier si le choix fait par l'utilisateur est compris entre 1 et 2*/
                        while (reponse != 1 && reponse != 2) {
                            out.println("\tLe choix opéré n'est pas configuré, Entrez 1 pour ajouter et 2 pour annuler \n\t1. Oui\n\t2. Non");
                            reponse = sc.nextInt();
                            sc.nextLine();
                        }

                        /**Programme à exécuter en fonction du choix de l'utilisateur*/
                        switch (reponse) {
                            case 1:   /*Cas où l'utilisateur choisi de continuer l'opération*/


                                /**Création d'un objet statut de la classe StringBuilder pour vérifier si la base de donnée bdd est pleine
                                 * si cette variable a la valeur ok, la base de donnée n'est pas pleine et si elle est vide la base est pleine.
                                 *  */

                                StringBuilder statut = new StringBuilder();
                                statut.append("");


                                /**Remplissage de la base de données bdd*/

                                UUID uuid = UUID.randomUUID();
                                listArticle.add(uuid.toString().toUpperCase() + "," + tabVerif[0] + "," + tabVerif[1] + "/" + tabVerif[2] + "/" + tabVerif[3] + "," + tabVerif[4] + "/" + tabVerif[5] + "/" + tabVerif[6] + "," + tabVerif[7] + "," + tabVerif[8] + "," + Integer.parseInt(tabVerif[7]) * Integer.parseInt(tabVerif[8]));


                                statut.append("ok");


                                /**Affichage du message de validation de l'opération*/

                                if (statut.toString().equals("ok")) {
                                    out.println("\t\u001B[32m\u001B[3mArticle ajouté avec succès\u001B[0m");
                                    out.println("\t-------------------------------------");
                                }

                                break;
                            case 2: /**Cas où l'utilisateur choisi d'annuler l'opération*/

                                /**Un message de confirmation avant d'annuler l'opération*/

                                out.println("`\tVous êtes sur le point d'annuler cette opération," + "Souhaitez-vous annuler?\n\t" + "1. Oui\n\t2. Non");
                                out.print("\tVeuillez saisir le choix opéré: ");
                                try {
                                    reponse = sc.nextInt();
                                    sc.nextLine();
                                    while (reponse != 1 && reponse != 2) {
                                        out.println("\tLe choix opéré n'est pas configuré, Entrez 1 pour annuler et 2 pour ajouter l'article \n\t1. Oui\n\t2. Non");
                                        reponse = sc.nextInt();
                                        sc.nextLine();
                                    }
                                } catch (Exception e) {
                                    out.println("\t\u001B[31mSaisie incorrecte, " + e.getMessage() + "\u001B[00m");
                                }

                                /**Boucle pour vérifier si le choix fait par l'utilisateur est compris entre 1 et 2*/

                                out.println("\t-------------------------------------");

                                /*Programme à exécuter en fonction du choix de l'utilisateur*/
                                switch (reponse) {
                                    case 1: /*Cas où l'utilisateur choisi d'annuler l'opération*/

                                        statut = new StringBuilder();
                                        statut.append("");
                                        out.println("\u001B[31m\u001B[3mOpération annulée\u001B[0m");
                                        break;

                                    case 2: /*Cas où l'utilisateur choisi de continuer l'opération*/
                                        statut = new StringBuilder();
                                        statut.append("");
                                        uuid = UUID.randomUUID();
                                        listArticle.add(uuid.toString().toUpperCase() + "," + tabVerif[0] + "," + tabVerif[1] + "/" + tabVerif[2] + "/" + tabVerif[3] + "," + tabVerif[4] + "/" + tabVerif[5] + "/" + tabVerif[6] + "," + tabVerif[7] + "," + tabVerif[8] + "," + Integer.parseInt(tabVerif[7]) * Integer.parseInt(tabVerif[8]));

                                        statut.append("ok");


                                        if (statut.toString().equals("ok")) {
                                            out.println("\t\u001B[32m\u001B[3mArticle ajouté avec succès\u001B[0m");
                                            out.println("\t-------------------------------------");
                                        } else {
                                            out.println("\t\u001B[31m\u001B[3mLa base de donnée renvoie : pleine\u001B[0m");
                                            out.println("\t-------------------------------------");
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
                        out.println("\t\u001B[31m\u001B[3mOpération annulée\u001B[0m");
                        out.println("\t-------------------------------------");

                        break;
                    default:

                }
            }


            if (!statutProduit.toString().equals("ok")) {  /*Condition qui vérifie si l'opération a déjà été effectuée suite à l'ajout d'un article existant*/
                StringBuilder statut = new StringBuilder();
                statut.append("");


                UUID uuid = UUID.randomUUID();

                listArticle.add(uuid.toString().toUpperCase() + "," + tabVerif[0] + "," + tabVerif[1] + "/" + tabVerif[2] + "/" + tabVerif[3] + "," + tabVerif[4] + "/" + tabVerif[5] + "/" + tabVerif[6] + "," + tabVerif[7] + "," + tabVerif[8] + "," + Integer.parseInt(tabVerif[7]) * Integer.parseInt(tabVerif[8]));
                statut.append("ok");

                if (statut.toString().equals("ok")) {
                    out.println("\t\u001B[32m\u001B[3mArticle ajouté avec succès\u001B[0m");
                    out.println("\t-------------------------------------");

                }

            }

        }
        return listArticle;
    }


    @Override
    public void ecrireFichier(FileWriter fileWriter, List<String> listArticle) throws RuntimeException {
        try {
            fileWriter = new FileWriter("src/exercices/Recap/bdd.txt", true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        PrintWriter pWriter = new PrintWriter(fileWriter);
        String[] tbWriter = listArticle.toString().split(",");
        tbWriter[0] = tbWriter[0].replace("[", "");
        tbWriter[6] = tbWriter[6].replace("]", "");
        pWriter.printf("\n");
        for (int i = 0; i < tbWriter.length; i++) {
            pWriter.printf("%-40s", tbWriter[i]);
        }
        pWriter.flush();
        pWriter.close();
    }

    @Override
    public void lectureFichier(File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            out.println(sc.nextLine());
        }

    }

    @Override
    public void suppressionFichier(File file, String uuid) throws IOException {

        Scanner sc = new Scanner(file);
        List<String> listBdd = new ArrayList<>();
        while (sc.hasNext()) {
                listBdd.add(sc.nextLine());
        }

        for (int i = 0; i < listBdd.size(); i++) {
            if(listBdd.get(i).contains(uuid)){
                listBdd.remove(i);
            }
        }
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter pWriter = new PrintWriter(fileWriter);
        for (int i = 0; i < listBdd.size(); i++) {
            pWriter.print(listBdd.get(i));
        }
        pWriter.flush();
        pWriter.close();


    }


}
