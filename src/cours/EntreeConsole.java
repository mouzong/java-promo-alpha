package cours;

import java.util.Scanner;

public class EntreeConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\t Veuillez saisir votre prenom : ");
        String prenomUtilisateur = sc.nextLine();

        System.out.println("\n\t Bonjour M. " + prenomUtilisateur + " !");
    }
}
