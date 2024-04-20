package methods;

import java.util.Scanner;

public class MenuMethod {
    public int addition(int a, int b) {
        return a + b;
    }

    public int soustraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public int modulo(int a, int b) {
        return a % b;
    }

    public String[] createUser(Scanner d) {
        String[] user = new String[4];

        System.out.print("\n\t Entrez votre nom : ");
        user[0] = d.nextLine();

        System.out.print("\n\t Entrez votre prenom : ");
        user[1] = d.nextLine();

        System.out.print("\n\t Entrez votre email : ");
        user[2] = d.nextLine();

        System.out.print("\n\t Entrez votre mot de passe : ");
        user[3] = d.nextLine();

        return user;
    }

    public void printUser(String[] user) {
        System.out.println("\n\t======== Informations Détaillées Sur l'Utilisateur ======");
        System.out.println("\n\t  Nom      : " + user[0]);
        System.out.println("\n\t  Prenom   : " + user[1]);
        System.out.println("\n\t  Email    : " + user[2]);
        System.out.println("\n\t  Password : " + user[3]);
    }

    /**
     * Ecire un java composer de ux classses:
     * - un point d'entree
     * - une boite à outils qui comporte les menu.
     * - creer un point dentre dans la classe principale
     * et appeler les methods depuis la boite a outils
     * Methods:
     * - Menu d'un restaurant
     * - Enregistrement d'un utilisateur (Nom, Prenom, Filiere, Niveau)
     *
     * le deuxieme methode retourne un tableau de chaine de caractere.
     */
}
