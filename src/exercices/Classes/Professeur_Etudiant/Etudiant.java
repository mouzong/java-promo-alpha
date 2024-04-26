package exercices.Classes.Professeur_Etudiant;

import java.time.LocalDate;
import java.util.Scanner;

public class Etudiant extends Personne{
   int numEtudiant;


    public Etudiant(String nom, String prenom, LocalDate deteNaissance, int numEtudiant) {
        super(nom, prenom, deteNaissance);
        this.numEtudiant = numEtudiant;
    }

    @Override
    public void afficheDetail() {
        super.afficheDetail();
        Scanner sc = new Scanner(System.in);
        System.out.println("\t--------------------");
        System.out.print("\tSaisir le nom de l'étudiant: ");
        String nom = sc.nextLine();
        while (nom.isEmpty()) {
            System.out.print("\tSaisir à nouveau le nom de l'étudiant: ");
            nom = sc.nextLine();
        }
        System.out.print("\tSaisir le prénom de l'étudiant: ");
        String prenom = sc.nextLine();
        while (nom.isEmpty()) {
            System.out.print("\tSaisir à nouveau le prénom de l'étudiant: ");
            prenom = sc.nextLine();
        }
        System.out.print("\tSaisir la date de naissance de l'étudiant: (JJ/MM/AAAA)");
        String dte = sc.nextLine();
        while (dte.length() != 10 || !dte.contains("/")) {
            System.out.print("\tSaisir à nouveau la date de naissance de l'étudiant: (JJ/MM/AAAA) ");
            dte = sc.nextLine();
        }
        System.out.print("\tSaisir le Nº de l'étudiant: ");
        try{
            int num = sc.nextInt();
            sc.nextLine();
            while (nom.isEmpty()) {
                System.out.print("\tSaisir à nouveau le prénom de l'étudiant: ");
                prenom = sc.nextLine();
            }


            String[] tbDate=dte.split("/");
            dateNaissance=LocalDate.of(Integer.parseInt(tbDate[2]),Integer.parseInt(tbDate[1]),Integer.parseInt(tbDate[0]));

            System.out.println("\t-----------Personne-----------\n\tNom: " + nom + "\n\tPrénom: " + prenom + "\n\t" +
                    "Date de naissance: " + dateNaissance);

        }catch (Exception e){
            System.out.println("Saisie incorrecte, Erreur interne: "+e.getMessage());
        }


    }

    }
