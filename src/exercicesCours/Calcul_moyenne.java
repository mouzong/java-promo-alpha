package exercicesCours;

import java.util.Scanner;

public class Calcul_moyenne {
    public static void main(String[] args) {
        // Moyenne de trois nombres
        System.out.println("Calcul de la moyenne de trois nombres entiers à entrer au hasard");

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Bien vouloir entrer la valeur de a : ");
        float a = inputReader.nextFloat();
        System.out.println("la valaleur entrée est: " + a);
        System.out.println("Bien vouloir entrer la valeur de b : ");
        float b = inputReader.nextFloat();
        System.out.println("la valaleur entrée est: " + b);
        System.out.println("Bien vouloir entrer la valeur de c : ");
        float c = inputReader.nextFloat();
        System.out.println("la valaleur entrée est: " +c);

        System.out.println("Les valeurs entrée sont: a = " + a +" ; " +"  b = " +b +" ; "+ "  c = " +c);

        double operation = (a + b + c)/3;
        System.out.println("la moyenne de a, b et c est: " + operation);

    }
}
