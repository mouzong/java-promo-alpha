package Exercice13042024;

import java.util.Scanner;

public class BoiteOutils {

    public void afficheMenu() {
        System.out.println("\tBienvenu au restaurant java-promo-alpha");
        System.out.println("\t----------------------------------------");
        System.out.println("\t1. Création d'un utilisateur");
        System.out.println("\t2. Entrées");
        System.out.println("\t3. Plats principaux");
        System.out.println("\t4. Desserts");
        System.out.println("\t5. Commander ou Reserver");
        System.out.println("\t----------------------------------------");
    }

    public int choix() {
        System.out.print("\tQuel opération souhaitez-vous effectuer? ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.nextLine();
        System.out.println("\t----------------------------------------");
        return i;
    }

    public String[] enregUtil() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tSaisir les informations clés de l'utilisateur: (nom,prenom,filière) ");
        return sc.nextLine().split(",");
    }


}
