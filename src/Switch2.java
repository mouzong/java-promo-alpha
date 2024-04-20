import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un jour de la semaine : ");
        String jourDeLaSemaine = sc.nextLine();

        switch (jourDeLaSemaine) {
            case "Lundi":
                System.out.println("Lundi - 5 lettres");
                break;
            case "Mardi":
                System.out.println("Mardi - 5 lettres");
                break;
            case "Mercredi":
                System.out.println("Mercredi - 8 lettres");
                break;
            case "Jeudi":
                System.out.println("Jeudi - 5 lettres");
                break;
            case "Vendredi":
                System.out.println("Vendredi - 8 lettres");
                break;
            case "Samedi":
                System.out.println("Samedi - 6 lettres");
                break;
            case "Dimanche":
                System.out.println("Dimanche - 8 lettres");
                break;
            default:
                System.out.println("Jour inconnu");
        }


        int taille = switch (jourDeLaSemaine) {
            case "Lundi", "Mardi", "Jeudi" -> 5;
            case "Mercredi", "Vendredi", "Dimanche" -> 8;
            case "Samedi" -> 6;
            default -> 0;
        };

        if (taille != 0) {
            System.out.println("Le jour " + jourDeLaSemaine + " contient " + taille + " lettres.");
        } else {
            System.out.println("Jour inconnu");
        }
    }
}
