package exercicesCours;

import java.util.Scanner;

public class DecompteSemaine {
    public static void main(String[] args) {
        System.out.print("Veuillez enter le numero correspondant au jour de la semaine: ");
        Scanner inputReader = new Scanner(System.in);
        int ref = inputReader.nextInt();
        String semaine;

        switch (ref) {
            case 1:
                semaine = "lundi";
                break;
            case 2:
                semaine = "Mardi";
                break;
            case 3:
                semaine = "Mercredi";
                break;
            case 4:
                semaine = "Jeudi";
                break;
            case 5:
                semaine = "Vendredi";
                break;
            case 6:
                semaine = "Samedi";
                break;
            case 7:
                semaine = "Dimanche";
                break;
            default:
                semaine = "jour inconnu";
                break;
        }

        System.out.println("Le jour de la semaine est " + semaine + " il contient " + semaine.length() + " lettres");
    }
}


