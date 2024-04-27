package collections.exo6;

import java.util.ArrayList;
import java.util.List;

public class Panier {
    private List<Article> articleList;

    public Panier() {
        this.articleList = new ArrayList<>();
    }

    public void ajouterArticle(Article article){
        articleList.add(article);
    }

    public double calculerPrixTotal(){
        double prixTotal = 0;
        for (Article article : articleList){
            prixTotal += article.getPrice();
        }

        return prixTotal;
    }

    public void afficherContenuPanier(){
        System.out.println("\n\t Contenu Du Panier ");
        for (Article article : articleList){
            System.out.println(article);
        }

        System.out.println("\n\t Montant Total : "+calculerPrixTotal()+" FCFA");
    }
}
