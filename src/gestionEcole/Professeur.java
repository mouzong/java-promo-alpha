package gestionEcole;

import java.util.Date;
import java.util.Objects;

public class Professeur extends Personne {
    private String specialite;

    public void afficherDetails (){
        System.out.println("\n\t\tNom : " +getNom());
        System.out.println("\t\tPrénom : " +getPrenom());
        System.out.println("\t\tDate de naissance : " +getDate());
        System.out.println("\t\tSpécialité : " +getSpecialite());
    }


    public Professeur() {
        super();
    }

    public Professeur(String nom, String prenom, Date date, String specialite) {
        super();
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Professeur that = (Professeur) o;
        return Objects.equals(specialite, that.specialite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), specialite);
    }

    @Override
    public String toString() {
        return "Professeur{" +
                "specialite='" + specialite + '\'' +
                '}';
    }
}
