package exercices.FunctionalProg.Exercice6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Concatenate string=new Concatenate();
        Scanner sc=new Scanner(System.in);
        System.out.println("\t---------Concatenation-----------");
        System.out.print("\tSaisir le 1er mot");
       String mot1=sc.nextLine();
        System.out.print("\tSaisir le 2eme mot");
        String mot2=sc.nextLine();
        System.out.println("\t"+string.concatenate(mot1,mot2));
    }
}
