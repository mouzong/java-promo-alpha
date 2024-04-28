package gestionEcole;

import java.util.Date;
import java.util.Objects;

public class Etudiant extends Personne {
    private String numEtudiant;

    public void afficherDetails (){
        System.out.println("\n\t\tNom: " + getNom());
        System.out.println("\t\tPrénom: " + getPrenom());
        System.out.println("\t\tDate de Naissance: " + getDate());
        System.out.println("\t\tNuméro de l'étudiant: " + getNumEtudiant());

    }

    public Etudiant() {
        super();
    }

    public Etudiant(String nom, String prenom, Date date, String numEtudiant) {
        super();
        this.numEtudiant = numEtudiant;
    }

    public String getNumEtudiant() {
        return numEtudiant;
    }

    public void setNumEtudiant(String numEtudiant) {
        this.numEtudiant = numEtudiant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Etudiant etudiant = (Etudiant) o;
        return Objects.equals(numEtudiant, etudiant.numEtudiant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numEtudiant);
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "numEtudiant='" + numEtudiant + '\'' +
                '}';
    }
}
