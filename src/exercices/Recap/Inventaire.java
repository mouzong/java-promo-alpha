package exercices.Recap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;

public class Inventaire implements Fichier {
    protected UUID id;
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
        Scanner sc = new Scanner(System.in);
        /**
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

        /**
         Recupérer la donnée entrée par l'utilisateur dans le variable menuChoisi
         */
        System.out.print("\tVeuillez choisir l'opération à exécuter? ");
        int menuchoisi = sc.nextInt();
        sc.nextLine();
        return menuchoisi;
    }



    @Override
    public void lectureFichier(File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }

    }

    @Override
    public void suppressionFichier(File file) {

    }
}
