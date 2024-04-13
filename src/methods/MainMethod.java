package methods;

import java.util.Scanner;

public class MainMethod {
    /**
     * - nom: main
     * - paramètres: String[] args, int a ...
     * - type de retour: void, int, String, float, double, boolean, ...
     * - visibilité: public, private, protected, package-private
     * - static: obligatoire, dans le cas d'une méthode main
     */

    public static void main(String[] args) {
        System.out.println("Hello World !");
        MenuMethod menu = new MenuMethod();
        int resultat = menu.addition(5,2);

        System.out.println("Le resultat de l'addition est : "+resultat);
        System.out.println("Le resultat de la soustraction est : "+ menu.soustraction(5,2));
    }



}
