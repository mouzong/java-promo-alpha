package exercices;

import java.util.*;

public class ExoBoucle {
    public static void main(String[] args) {

        System.out.print("Entrez le nombre correspondant au mois que vous souhaitez choisir: ");
        Scanner sc = new Scanner(System.in);
        int nbre = sc.nextInt();

            switch (nbre) {

                case 1:
                    nbre = 1;
                    System.out.println("Vous avez choisi le mois de Janvier.");
                    break;
                case 2:
                    nbre = 2;
                    System.out.println("Vous avez choisi le mois de Février.");
                    break;

                case 3:
                    nbre = 3;
                    System.out.println("Vous avez choisi le mois de Mars.");
                    break;

                case 4:
                    nbre = 4;
                    System.out.println("Vous avez choisi le mois de Avril.");
                    break;

                case 5:
                    nbre = 5;
                    System.out.println("Vous avez choisi le mois de Mai.");
                    break;

                case 6:
                    nbre = 6;
                    System.out.println("Vous avez choisi le mois de Juin.");
                    break;

                case 7:
                    nbre = 7;
                    System.out.println("Vous avez choisi le mois de Juillet.");
                    break;

                case 8:
                    nbre = 8;
                    System.out.println("Vous avez choisi le mois de Août.");
                    break;

                case 9:
                    nbre = 9;
                    System.out.println("Vous avez choisi le mois de Septembre.");
                    break;

                case 10:
                    nbre = 10;
                    System.out.println("Vous avez choisi le mois de Octobre.");
                    break;

                case 11:
                    nbre = 11;
                    System.out.println("Vous avez choisi le mois de Novembre.");
                    break;
                case 12:
                    nbre = 12;
                    System.out.println("Vous avez choisi le mois de Décembre.");
                    break;

                default:
                    System.out.println("Mois inconnu");

            }


    }


}
