package exercices.Classes.Biblio;

import exercices.Classes.Biblio.Document;

import java.time.LocalDate;
import java.util.Scanner;

public class Livre extends Document {
    String auteur;
    int isbn;
    LocalDate date_de_sortie;

    public Livre(String auteur, int isbn, LocalDate date_de_sortie) {

        this.auteur = auteur;
        this.isbn = isbn;
        this.date_de_sortie = date_de_sortie;
    }

    public Livre() {
    }
    @Override
    public void afficheDetail() {
        super.afficheDetail();
        Scanner sc=new Scanner(System.in);
        System.out.print("\tSaisir le titre du livre: ");
        titre=sc.nextLine();
        System.out.print("\tSaisir l'isbn du livre': ");
        try{
            isbn=sc.nextInt();
        }catch(Exception e){
            e.getMessage();
        }
        System.out.print("\tSaisir le nom de l'auteur du livre: ");
        auteur=sc.nextLine();

        System.out.print("\tSaisir la date de sortie du livre : ");
        auteur=sc.nextLine();

        System.out.println("\tTitre du livre: "+titre+"\n\tAuteur: "+auteur+"\n\tisbn: "+isbn+"\n\tdate_de_sortie: "+date_de_sortie);
    }


}
