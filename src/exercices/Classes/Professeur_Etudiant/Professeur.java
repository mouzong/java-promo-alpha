package exercices.Classes.Professeur_Etudiant;

import java.time.LocalDate;

public class Professeur extends Personne{
    String specialite;


    public Professeur(String nom, String prenom, LocalDate deteNaissance, String specialite) {
        super(nom, prenom, deteNaissance);
        this.specialite = specialite;
    }


}
