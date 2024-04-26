package exercices.Classes.Animaux_cris;

import java.util.Scanner;

public class Main_animaux {
    public static void main(String[] args) {

        int exit = 0;

        while (exit == 0) {


            Chien chien1 = new Chien();
            Chat chat1 = new Chat();
            Oiseau oiseau1 = new Oiseau();


            System.out.println("\t-------------Cris des animaux--------------");
            System.out.println("\t1. Chien\n\t2. Chat\n\t3. Oiseau");
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("\tChoississez un animal: ");
                int choixAnimal = sc.nextInt();
                sc.nextLine();
                while (choixAnimal < 1 || choixAnimal > 3) {
                    System.out.print("\tChoississez à nouveau un animal: ");
                    choixAnimal = sc.nextInt();
                    sc.nextLine();
                }
                switch (choixAnimal) {
                    case 1:
                        chien1.cris();
                        break;
                    case 2:
                        chat1.cris();
                        break;
                    case 3:
                        oiseau1.cris();
                        break;
                    default:

                        System.out.println("\tNon configuré");
                }
            } catch (Exception e) {
                System.out.println("\tChoix pas correct, Erreur interne: \t" + e.getMessage());
                exit=1;
            }

        }
    }
}
