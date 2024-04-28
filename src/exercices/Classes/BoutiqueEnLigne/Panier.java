package exercices.Classes.BoutiqueEnLigne;

import java.io.*;
import java.util.Scanner;

public class Panier extends Article {
    public Panier(int id, String nom, int prix) {
        super(id, nom, prix);
    }

    public Panier() {
    }

    public void ajoutArticle(String[][] bdd) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Ajouter un article----------");

        System.out.print("Saisir le nom de l'article: ");
        nom = sc.nextLine();
        while (nom.isEmpty()) {
            System.out.print("Saisir à nouveau le nom de l'article: ");
            nom = sc.nextLine();
        }
        System.out.print("Saisir le prix de l'article: ");
        prix = sc.nextInt();
        sc.nextLine();
        while (prix == 0) {
            System.out.print("Saisir à nouveau le prix de l'article: ");
            prix = sc.nextInt();
            sc.nextLine();
        }

        for(int i = 1; i < bdd.length; i++) {
            if (bdd[i][0].isEmpty()) {
                if (i == 1) {
                    id = 1;
                } else{
                    id=Integer.parseInt(bdd[0][(i-1)])+1;
                }

            }
            bdd[i][0]=String.valueOf(id);
            bdd[i][1]=nom;
            bdd[i][2]=String.valueOf(prix);

            System.out.println("\tAjout effectué avec succès");
break;
        }







    }


    public int calculTotal(String[][] bdd) {
        int total = 0;
        for (int i = 1; i < bdd.length; i++) {
            if(!bdd[i][2].isEmpty()){
                total += Integer.parseInt(bdd[i][2]);
            }

        }
        return total;
    }


    public void afficheContenuPanier(File fileBdd) throws FileNotFoundException {
        Scanner sc = new Scanner(fileBdd);
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }

}
