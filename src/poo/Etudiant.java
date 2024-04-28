package poo;

public class Etudiant {
String nomComplet;
String matricule;
String filiere;
int niveau;

    public Etudiant() {
        this.nomComplet = nomComplet;
        this.matricule = matricule;
        this.filiere = filiere;
        this.niveau = niveau;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getFiliere() {
        return filiere;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nomComplet + '\'' +
                ", matricule='" + matricule + '\'' +
                ", filiere='" + filiere + '\'' +
                ", niveau=" + niveau +
                '}';
    }
}
