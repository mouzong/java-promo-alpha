package exercices.Classes.VentesEnLigne;

import java.util.Scanner;

public class MainVentesEnLigne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Electronique ordinateur = new Electronique();
        Livre marvel = new Livre();

        ordinateur.setId(1);
        ordinateur.setNom("LAPTOP FUJITSU");
        ordinateur.setPrix(200000);

        marvel.setId(1);
        marvel.setNom("Spiderman");
        marvel.setPrix(50000);

        System.out.println("\t-------------------------");
        System.out.println("\t--------Menu des produits--------------");
        System.out.println("\t1. Afficher un produit");
        System.out.println("\t2. Calculer la TVA");
        System.out.println("\t-------------------------");
        System.out.print("\tChoisir un menu: ");
        try {
            int choixMenu = sc.nextInt();
            sc.nextLine();
            while (choixMenu < 1 || choixMenu > 2) {
                System.out.print("\tChoisir à nouveau un menu: ");
                choixMenu = sc.nextInt();
                sc.nextLine();
            }
            switch(choixMenu){
                case 1:
                    System.out.println("\t-------------------------");
                    System.out.println("\t--------Famille de produit--------------");
                    System.out.println("\t1. Electronique");
                    System.out.println("\t2. Livre");
                    System.out.println("\t-------------------------");
                    System.out.print("\tSaisir le type: ");
                    try{
                        int choixType = sc.nextInt();
                        sc.nextLine();
                        while (choixType < 1 || choixType > 2) {
                            System.out.print("\tChoisir à nouveau un type: ");
                            choixType = sc.nextInt();
                            sc.nextLine();
                        }
                        switch(choixType){
                            case 1:
                                System.out.println("\t-------------------------");
                            ordinateur.afficheDetail();
                                break;
                            case 2:
                                System.out.println("\t-------------------------");
                              marvel.afficheDetail();
                                break;
                        }
                    }catch(Exception e){
                        System.out.println("\tSaisie incorrecte, erreur interne: " + e.getMessage());
                    }


                    break;
                case 2:
                    System.out.println("\t-------------------------");
                    System.out.println("\t--------Famille de produit--------------");
                    System.out.println("\t1. Electronique");
                    System.out.println("\t2. Livre");
                    System.out.println("\t-------------------------");
                    System.out.print("\tSaisir le type: ");
                    try{
                        int choixType = sc.nextInt();
                        sc.nextLine();
                        while (choixType < 1 || choixType > 2) {
                            System.out.print("\tChoisir à nouveau un type: ");
                            choixType = sc.nextInt();
                            sc.nextLine();
                        }
                        switch(choixType){
                            case 1:
                                System.out.println("\t-------------------------");
                                System.out.println("\tLa TVA de "+ordinateur.getNom()+" s'élève à "+ordinateur.TVA()+" FCFA");
                                break;
                            case 2:
                                System.out.println("\t-------------------------");
                                System.out.println("\tLa TVA de "+marvel.getNom()+" s'élève à "+marvel.TVA()+" FCFA");
                                break;
                        }
                    }catch(Exception e){
                        System.out.println("\tSaisie incorrecte, erreur interne: " + e.getMessage());
                    }

                    break;
                default:

            }

        } catch (Exception e) {
            System.out.println("\tSaisie incorrecte, erreur interne: " + e.getMessage());
        }


    }

}
