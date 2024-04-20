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
        Scanner sc = new Scanner(System.in);
        MenuMethod m1 = new MenuMethod();
        m1.printUser(m1.createUser(sc));
    }




}
