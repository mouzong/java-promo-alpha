package exercices.FunctionalProg.Exercice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t---------------Tableaux de calcul-----------------");
        System.out.println("\t1. Addition\n\t2. Soustraction\n\t3. Multiplication\n\t4. Division");
        System.out.print("\tQuelle opération souhaitez-vous effectuer? ");
        try {
            int numChoisi = sc.nextInt();
            sc.nextLine();
            while (numChoisi < 1 || numChoisi > 4) {
                try {
                    numChoisi = sc.nextInt();
                    sc.nextLine();
                } catch (Exception e) {
                    System.out.println("\tSaisie incorrecte, Erreur interne: " + e.getMessage());
                }
            }

            System.out.print("\tSaisir le 1er nombre: ");
            int a = sc.nextInt();
            sc.nextLine();
            System.out.print("\tSaisir le 2ème nombre: ");
            int b = sc.nextInt();
            sc.nextLine();

            switch (numChoisi) {
                case 1:
                    Addition addition=new Addition();
                    System.out.println("\tL'addition de "+a+" et "+b+" est égale à "+addition.operate(a,b));
                    break;
                case 2:
                    Soustraction soustraction=new Soustraction();
                    System.out.println("\tLa soustraction de "+a+" et "+b+" est égale à "+soustraction.operate(a,b));
                    break;
                case 3:
                    Multiplication multiplication=new Multiplication();
                    System.out.println("\tLa multiplication de "+a+" et "+b+" est égale à "+multiplication.operate(a,b));
                    break;
                case 4:
                    Division division=new Division();
                    System.out.println("\tLa division de "+a+" et "+b+" est égale à "+division.operate(a,b));
                    break;
            }
        } catch (Exception e) {
            System.out.println("\tSaisie incorrecte, Erreur interne: " + e.getMessage());
        }


    }
}
