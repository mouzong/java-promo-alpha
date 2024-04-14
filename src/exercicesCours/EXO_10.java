package exercicesCours;

import java.util.Scanner;

public class EXO_10 {
    public static final String ANSI_VERT = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        System.out.println(ANSI_VERT + "\t===============LA TABLE DE MULTIPLICATION ==============  " + ANSI_RESET);
        int[] tableau = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        Scanner inputReader = new Scanner(System.in);
        System.out.println(ANSI_CYAN + "Vous êtes sur le point d'afficher la table de multiplication d'un nombre de votre choix");
        System.out.println("Bien vouloir entrer la valeur de ce nombre : " + ANSI_RESET);
        int a = inputReader.nextInt();
        System.out.println("\tla table de multiplication de " + a + " sous forme de tableau est: ");
        //for (int j = 0; j < tableau.length; j++) {
        System.out.println("\t\t\t\t\t\t----------------- ");
        for (int i = 0; i < 9; i++)
            System.out.println("\t\t\t\t\t\t" + "|" + tableau[i] + "|\t" + " x " + "|" + a + "|" + " = " + "|" + (tableau[i] * a + "|" + "\n\t\t\t\t\t\t----------------- "));
        //System.out.println("\t\t\t\t\t\t----------------- ");
        for (int i = 9; i < tableau.length; i++)
            System.out.println("\t\t\t\t\t\t" + "|" + tableau[i] + "|" + " x " + "|" + a + "|" + " = " + "|" + (tableau[i] * a + "|" + "\n\t\t\t\t\t\t----------------- "));
    }
}

