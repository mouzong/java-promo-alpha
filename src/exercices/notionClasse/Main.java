package exercices.notionClasse;

import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
        Document doc1=new Document();
        Livre livre1=new Livre();


        doc1.setTitre("&");
        doc1.setTitre("ok");

        livre1.setAuteur("ok");
        livre1.setAuteur("ok");
        livre1.getDate_de_sortie(LocalDate.of(2024,04,24));



    }
}
