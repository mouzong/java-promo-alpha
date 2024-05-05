package exercices.FunctionalProg.Exercice4;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("\tSaisir une chaine de caractère: ");
        String chaine=sc.nextLine();
        Optional<Integer> length=Optional.ofNullable(longueurChaine(chaine).get());
        length.ifPresentOrElse(
              longueur-> System.out.println("\tLa longueur de la chaine "+chaine+" est de: "+longueur),
              ()-> System.out.println("\tLa chaine est vide")
      );

        }
    static Optional<Integer> longueurChaine(String chaine) {
        return Optional.ofNullable(chaine.length());
    }
    }



