package exercices.Classes.FormeGeometrique;

import java.util.Scanner;

public class MainFormeGeometrique {
    public static void main(String[] args) {
        Cercle cercle1 = new Cercle();
        Rectangle rectangle1 = new Rectangle();

        Scanner sc = new Scanner(System.in);
        System.out.println("\t--------Calcul de la surface--------\n\t1. Cercle\n\t2. Rectangle");
        System.out.println("------------------------");
        System.out.print("\tSaisir votre choix: ");
        try {
            int nbreChoisi = sc.nextInt();
            sc.nextLine();
            while (nbreChoisi < 1 || nbreChoisi > 2) {
                System.out.print("\tSaisir à nouveau votre choix: ");
                nbreChoisi = sc.nextInt();
                sc.nextLine();
            }

            switch (nbreChoisi) {
                case 1:
                    try {
                        System.out.print("\tSaisir le rayon: ");
                        Double ray = sc.nextDouble();
                        cercle1.setRayon(ray);
                        System.out.println("\tLa surface du cercle est égale à " + cercle1.getRayon() * cercle1.getPi());

                    } catch (Exception e) {
                        System.out.println("------------------------");
                        System.out.println("\tbv saisir un nombre, erreur interne :" + e.getMessage());
                    }

                    break;
                case 2:

                    try {
                        System.out.print("\tSaisir la longueur: ");
                        Double longueur = sc.nextDouble();
                        rectangle1.setLongueur(longueur);

                        System.out.print("\tSaisir la largeur: ");
                        Double largeur = sc.nextDouble();
                        rectangle1.setLargeur(largeur);
                        System.out.println("------------------------");
                        System.out.println("\tLa surface du rectangle est égale à " + rectangle1.getLongueur() * rectangle1.getLargeur());

                    } catch (Exception e) {
                        System.out.println("------------------------");
                        System.out.println("\tbv saisir un nombre, erreur interne :" + e.getMessage());
                    }

                    break;
                default:

            }
        } catch (Exception e) {
            System.out.println("\tChoix non configuré, erreur interne :" + e.getMessage());
        }

    }
}
