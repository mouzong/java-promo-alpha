package exercicesCours.gestionBoutique;

import java.util.ArrayList;
import java.util.List;

public class MainArticle {
    public static void main(String[] args) {
        Article article = new Article();

        ArrayList panier = new ArrayList();

        panier.add(new Article().getIdArticle());
        panier.add(new Article().getNomArtice());
        panier.add(new Article().getPrixArticle());

        for(int i=0; i< panier.size(); i++){
            System.out.println(panier.get(i));
        }
    }
}
