package exercices.Classes.Professeur_Etudiant;

import java.time.LocalDate;
import java.util.Scanner;

public class Personne {
    String nom;
    String prenom;
    LocalDate dateNaissance;

    public Personne(String nom, String prenom, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    public void afficheDetail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t--------------------");
        System.out.print("\tSaisir le nom: ");
        String nom = sc.nextLine();
        while (nom.isEmpty()) {
            System.out.print("\tSaisir à nouveau le nom: ");
            nom = sc.nextLine();
        }
        System.out.print("\tSaisir le prénom: ");
        String prenom = sc.nextLine();
        while (nom.isEmpty()) {
            System.out.print("\tSaisir à nouveau le prénom: ");
            prenom = sc.nextLine();
        }
        System.out.print("\tSaisir la date de naissance: (JJ/MM/AAAA)");
        String dte = sc.nextLine();
        while (dte.length() != 10 || !dte.contains("/")) {
            System.out.print("\tSaisir à nouveau la date de naissance: (JJ/MM/AAAA) ");
            dte = sc.nextLine();
        }
        String[] tbDate=dte.split("/");
        dateNaissance=LocalDate.of(Integer.parseInt(tbDate[2]),Integer.parseInt(tbDate[1]),Integer.parseInt(tbDate[0]));

        System.out.println("\t-----------Personne-----------\n\tNom: " + nom + "\n\tPrénom: " + prenom + "\n\t" +
                "Date de naissance: " + dateNaissance);
    }

    public Personne() {
    }
}
