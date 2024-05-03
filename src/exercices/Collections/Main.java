package exercices.Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CarteNormale carte1=new CarteNormale();
        CarteSpeciale carte2=new CarteSpeciale();
         List<String> listeCarteNormale=new ArrayList<>();
        Set<String> listeCarteSpeciale=new HashSet<>();
        Scanner sc=new Scanner(System.in);
      int exit=0;

      while(exit==0){

        System.out.println("-----------Jeu de carte-----------");
        System.out.println("1. Ajouter une carte normale");
        System.out.println("2. Ajouter une carte spéciale");
        System.out.println("3. afficher le détail des cartes");
          System.out.println("4. Sortir");
        System.out.println("-----------------------------");
        System.out.print("Choix de l'action: ");
        try{
           int choix=sc.nextInt();
           sc.nextLine();
           while(choix<1 || choix>4){
               System.out.print("Choix de l'action: ");
               choix=sc.nextInt();
               sc.nextLine();
           }
            System.out.println("-----------------------------");
           switch (choix){
               case 1:
                   System.out.print("Saisir la valeur de la carte: ");
                  carte1.setValeur(sc.nextLine());
                   System.out.print("Saisir la couleur de la carte: ");
                   carte1.setCouleur(sc.nextLine());
                   listeCarteNormale.add("Valeur: "+carte1.getValeur()+":"+carte1.getCouleur());
                   break;
               case 2:
                   System.out.print("Saisir la valeur de la carte: ");
                   carte2.setValeur(sc.nextLine());
                   System.out.print("Saisir la couleur de la carte: ");
                   carte2.setCouleur(sc.nextLine());
                   listeCarteSpeciale.add("Valeur: "+carte2.getValeur()+":"+carte2.getCouleur());
                   break;
               case 3:

                   System.out.println("--------Choix de carte-----------");
                   System.out.println("1. Carte Normale");
                   System.out.println("2. Carte Spéciale");
                   System.out.println("-----------------------------");
                   int choixc=sc.nextInt();
                   sc.nextLine();
                   switch(choixc){
                     case 1:
                      carte1.afficheDetail(listeCarteNormale);
                         break;
                       case 2:
                           carte2.afficheDetail(listeCarteSpeciale);
                           break;
                   }


                   break;
               case 4:
                   exit=1;

           }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

      }
    }
}
