package exercices.notionClasse;

import java.time.LocalDate;

public class Livre extends Document {
    String titre;
    String auteur;
    String isbn;
    LocalDate date_de_sortie;

    public Livre(String titre, int numero, String titre1, String auteur, String isbn, LocalDate date_de_sortie) {
        super(titre, numero);
        this.titre = titre1;
        this.auteur = auteur;
        this.isbn = isbn;
        this.date_de_sortie = date_de_sortie;
    }

    public Livre() {
    }

    @Override
    public String getTitre() {
        return titre;
    }

    @Override
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getDate_de_sortie(LocalDate localDate) {
        return date_de_sortie;
    }

    public void setDate_de_sortie(LocalDate date_de_sortie) {
        this.date_de_sortie = date_de_sortie;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", isbn='" + isbn + '\'' +
                ", date_de_sortie=" + date_de_sortie +
                ", titre='" + titre + '\'' +
                ", numero=" + numero +
                '}';
    }
}
