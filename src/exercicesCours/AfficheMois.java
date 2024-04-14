package exercicesCours;

import java.util.Scanner;

public class AfficheMois {
    public static void main(String[] args) {
        // Affichage du mois
        System.out.print("\n\tveuillez entrer un nombre entre 1 et 12 pour afficher le mois correspondant: ");
        Scanner inputReader = new Scanner(System.in);
        int mois = inputReader.nextInt();

        switch (mois) {
            case 1:
                System.out.println("le mois correspondant est Janvier");
                break;
            case 2:
                System.out.println("le mois correspondant est Fevrier");
                break;
            case 3:
                System.out.println("le mois correspondant est Mars");
                break;
            case 4:
                System.out.println("le mois correspondant est Avril");
                break;
            case 5:
                System.out.println("le mois correspondant est Mai");
                break;
            case 6:
                System.out.println("le mois correspondant est Juin");
                break;
            case 7:
                System.out.println("le mois correspondant est Juillet");
                break;
            case 8:
                System.out.println("le mois correspondant est Aout");
                break;
            case 9:
                System.out.println("le mois correspondant est Septembre");
                break;
            case 10:
                System.out.println("le mois correspondant est Octobre");
                break;
            case 11:
                System.out.println("le mois correspondant est Novembre");
                break;
            case 12:
                System.out.println("le mois correspondant est Decembre");
                break;
            default:
                System.out.println("Mois inconnu");
        }
    }
}