package Methodes;

import java.util.Scanner;

public class ExoMethodsEnonce {
    /**
     * Exercice 1
     * Créez une méthode qui prend en paramètre un nombre entier et qui retourne le carré de ce nombre.
     */
    public static void main(String[] args) {
        System.out.println("Nombre carré :" +methodeCarree());

    }

    public static int methodeCarree() {
        System.out.print("Entrer un nombre entier: ");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        return x * x;
    }
}
