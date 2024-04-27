package collections.exo6;

public class Main {
    /**
     * Exercice 6 : Gestion d'une boutique en ligne
     *      * Objectif : Utiliser l'encapsulation, le polymorphisme et les collections pour
     *      * gérer une boutique en ligne.
     *      *
     *      * Créez une classe Article avec les attributs :
     *      * - id
     *      * - nom
     *      * - prix
     *      * Créez une classe Panier qui contient une liste d'articles.
     *      * Ajoutez des méthodes pour ajouter un article au panier, calculer
     *      * le total et afficher le contenu du panier.
     *      *
     *      *
     */

    public static void main(String[] args) {
        Panier panier = new Panier();
        Article conso = new Article("Yaourt",250);
        Article ordi = new Article("MacBook Pro 2019 16 Inches",950000);
        Article desk = new Article("Gamer Chair",320000);

        panier.ajouterArticle(conso);
        panier.ajouterArticle(ordi);
        panier.ajouterArticle(desk);

        panier.afficherContenuPanier();
    }
}
