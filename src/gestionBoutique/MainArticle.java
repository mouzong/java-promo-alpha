package gestionBoutique;

import poo.Etudiant;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainArticle {

//    private static Article[] article = new Article[5];
//
//    public static double calculerPrixTotal(){
//        double prixTotal = 0;
//        for (Article article : article){
//            prixTotal += article.getPrix();
//        }
//
//        return prixTotal;
//    }

    public static void main(String[] args) throws IOException {
        Scanner saisiClavier = new Scanner(System.in);
        File panier = new File("src/gestionBoutique/Panier.txt");
        try {
            panier.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.print("\n\t Combien d'article voulez-vous enregistrer? : ");
        int nbArticle = saisiClavier.nextInt();
        saisiClavier.nextLine();


        FileWriter monbdWriter = null;
        try {
            monbdWriter = new FileWriter(panier);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        PrintWriter monbdprintWriter = new PrintWriter(monbdWriter);

        Article article = new Article();
        for (int i = 1; i <= nbArticle; i++) {
            System.out.println("\n\t  Entrez les donnée de l'article : " + i);

            System.out.print("\n\t Entrez l'identifiant: ");
            article.setId(saisiClavier.nextLine());

            System.out.print("\n\t Entrez le nom de l'article: ");
            article.setNom(saisiClavier.nextLine());

            System.out.print("\n\t Entrez le prix de l'article: ");
            article.setPrix(saisiClavier.nextInt());
            saisiClavier.nextLine();

            monbdprintWriter.println(article);

        }
        monbdprintWriter.flush();
        monbdprintWriter.close();

        Scanner sc = new Scanner(panier);

        while (sc.hasNext()) {
            System.out.println(sc.nextLine());

        }
    }

//    public static double calculerTotal() {
//        Scanner saisiClavier = new Scanner(System.in);
//        double montantTotal = 0;
//        List<Article> articleList = new ArrayList<>();
//        montantTotal += articleList.get(saisiClavier.nextInt()).getPrix();
//        return montantTotal;
//       // System.out.println(" le montant total des produits est: " + calculerTotal());
//    }


}
