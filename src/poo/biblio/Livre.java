package poo.biblio;

import java.time.LocalDate;

public class Livre extends Document{
    private String auteur;
    private String isbn;
    private LocalDate date_de_sortie;

    public Livre(String titre, String numero, String auteur, String isbn, LocalDate date_de_sortie) {
        super(titre, numero);
        this.auteur = auteur;
        this.isbn = isbn;
        this.date_de_sortie = date_de_sortie;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("\t Auteur : "+auteur);
        System.out.println("\t ISBN : "+isbn);
        System.out.println("\t Date de Sortie : "+date_de_sortie);
    }
}
