import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\n\t Entrez un nombre representant un jour de la semaine : ");
        int jour = sc.nextInt();

        switch (jour) {
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            default:
                System.out.println("Jour inconnu");
        }

        /**
         * Exercice :
         * Ecrire un programme qui demande à l'utilisateur de saisir un nombre compris entre 1 er 12
         * puis le programme affiche le mois correspondant.
         * Le programme affiche "Mois inconnu" si le nombre saisi n'est pas compris entre 1 et 12.
         * Utiliser la structure switch.
         *
         * Exercice 2 :
         * Utilisez la structure switch pour afficher en fonction du jour de la semaine,
         * le nombre de lettre que contient le nom du jour.
         */
    }
}
