package recherches;

import java.util.Scanner;

    public class SaisieChaine {
        public static void main(String[] args) {
            Scanner clavier = new Scanner(System.in);

            System.out.print("Saisissez votre nom : ");
            String nom = clavier.nextLine();

            System.out.print("Saisissez votre âge : ");
            int age = clavier.nextInt();

            System.out.print("Saisissez votre salaire : ");
            double salaire = clavier.nextDouble();

            System.out.println("Informations saisies :");
            System.out.println("Nom : " + nom);
            System.out.println("Âge : " + age+ " ans");
            System.out.println("Salaire : " + salaire + "F CFA");

            // Fermer les ressources
            clavier.close();
        }
    }


