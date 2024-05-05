package exercices.FunctionalProg.Exercice2;

import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("\tSaisir un nombre: ");
        try{
            int x=sc.nextInt();
            sc.nextLine();
            System.out.println("\tLe carré de "+x+" est de : "+calculCarre.apply(x));
            System.out.println("\tLe carré de "+x+" est de : "+calculAjoutDeuxCarre.apply(x));
        }catch(Exception e){
            System.out.println("\tSaisie incorrecte, Erreur interne: "+e.getMessage());
        }


    }

    static Function<Integer,Integer> calculCarre=(x)->x*x;
    static Function<Integer,Integer> calculAjoutDeux=(x)->x+2;
    static Function <Integer,Integer> calculAjoutDeuxCarre=calculCarre.andThen(calculAjoutDeux);
}
