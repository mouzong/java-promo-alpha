package errors;

import enums.RoleEnum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RoleEnum role1 = RoleEnum.ENSEIGNANT;
        try {
            // Code à essayer
            System.out.println(args[3]);
        } catch (Exception error) {
            // Manipuler et traiter l'erreur
            System.out.println(error.getMessage());
        }


        System.out.println("\n\t Erreur traitee avec succes et le programme continue !");

        try {

        } catch (Exception e) {

        } finally {
            // d/**
        }

        ExceptionHandlerTest.direBonjour();
/***
 * throw : Lever une exception
 * throws : Declarer l'exception au niveau de la signature de la methode
 */
    }
}

class ExceptionHandlerTest {
    public static void direBonjour() throws RuntimeException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\t Entrez le prix de la voiture : ");
        int prix = scanner.nextInt();

        if (prix < 0){
            throw new RuntimeException("\n\t Erreur le prix ne peut etre negatif !!!");
        }

//        try{
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("\n\t Entrez le prix de la voiture : ");
//            int prix = scanner.nextInt();
//        }catch (Exception e){
//            System.out.println("\n\t Attention erreur de donnees verifiez vos entrees : "+e.getMessage());
//        }

    }
}
