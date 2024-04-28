package gestionEcole;

import java.util.Date;
import java.util.Objects;

public class Personne {
    private String nom;
    private String prenom;
    private  Date date ;

    public void afficherDetails (){
        System.out.println("\n\t\tNom: " + getNom());
        System.out.println("\t\tPrénom: " + getPrenom());
        System.out.println("\t\tDate de Naissance: " + getDate());
    }
    public Personne() {
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return Objects.equals(nom, personne.nom) && Objects.equals(prenom, personne.prenom) && Objects.equals(date, personne.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, date);
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", date=" + date +
                '}';
    }
}
