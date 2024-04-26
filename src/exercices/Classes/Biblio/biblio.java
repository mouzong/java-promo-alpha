package exercices.Classes.Biblio;

import java.util.Scanner;

public class biblio {
    public static void main(String[] args) {
        Document doc1=new Document();
        Livre livre1=new Livre();

        Scanner sc=new Scanner(System.in);
        System.out.println("\n\t1. Documents\n\t2. Livres\n\tEntrer la bibliothèque à consulter: ");
        int nbreChoisi=sc.nextInt();
        sc.nextLine();

     switch(nbreChoisi){
         case 1:
         doc1.afficheDetail();

         break;
         case 2:
             livre1.afficheDetail();
             break;
         default:

     }



    }
}
