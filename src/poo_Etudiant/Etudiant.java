package poo_Etudiant;

import java.util.Objects;
import java.util.Scanner;

public class Etudiant {
    String nomComplet;
    String matricule;
    String filiere;
    int niveau;




    public Etudiant(String nomComplet, String matricule, String filiere, int niveau) {
        this.nomComplet = nomComplet;
        this.matricule = matricule;
        this.filiere = filiere;
        this.niveau = niveau;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }




    public String getMatricule() {
        return matricule;
    }



    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return Objects.equals(matricule, etudiant.matricule);
    }

    @Override
    public String toString() {
        return matricule+"{"+ nomComplet+","+filiere +","+ niveau+"}";
    }

    public Etudiant() {

    }


    public String[] ajouterEtudiant() throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] tb = new String[5];

        System.out.println("\n\t=====Informations sur l'étudiant=====\n");

        System.out.print("\tSaisir le nom complet: ");
        tb[0] = sc.nextLine().toUpperCase();
        while (tb[0].isEmpty()) {
            System.out.print("\n\tLe champs 'nom complet' est obligatoire, Saisir à nouveau: ");
            tb[0] = sc.nextLine().toUpperCase();
        }

        System.out.print("\tSaisir le matricule: ");
        tb[1] = sc.nextLine().toUpperCase();
        while (tb[1].isEmpty()) {
            System.out.print("\n\tLe champs 'matricule' est obligatoire, Saisir à nouveau: ");
            tb[1] = sc.nextLine().toUpperCase();
        }

        System.out.print("\tSaisir la filière: ");
        tb[2] = sc.nextLine().toUpperCase();
        while (tb[2].isEmpty()) {
            System.out.print("\n\tLe champs 'fili-re' est obligatoire, Saisir à nouveau: ");
            tb[2] = sc.nextLine().toUpperCase();
        }

        System.out.print("\tSaisir le niveau: ");
        tb[3] = sc.nextLine();
        try {
            long tel = Long.parseLong(tb[3]);

        } catch (Exception e) {
            //Question : Aucun message sur la console
            System.out.println("\n\t\u001B[31mLe numéro de téléphone ne doit contenir que des nombres\u001B[00m\n");
            throw new NumberFormatException(e.getMessage());
        }

        System.out.println("\t-------------------------------------\n");

        return tb;
    }





}
