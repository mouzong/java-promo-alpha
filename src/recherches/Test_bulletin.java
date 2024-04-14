package recherches;

import java.util.Scanner;

public class Test_bulletin {
    public static void main(String[] args) {
        /**
         * Cette méthode attend un argument entier - la note du devoir -
         * et retourne une mention, I, P, A, B, T ou E, en fonction de sa valeur.
         */
        //public char convertirNiveaux(int noteDevoir) {
        System.out.println("Appreciation du travail des eleves");

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Bien vouloir entrer la valeur note de l'enfant : ");
        double noteDevoir = inputReader.nextDouble();
        System.out.println("la valaleur entrée est: " + noteDevoir);
            char niveau;
            if (noteDevoir >= 18) {
                System.out.println("votre travail est excellent");
            }
            else if (noteDevoir >= 16 && noteDevoir < 18) {
                System.out.println("votre travail est tres bien");
            }
            else if (noteDevoir >= 14 && noteDevoir < 16) {
                System.out.println("votre travail est bien");
            }
            else if (noteDevoir >= 12 && noteDevoir < 14) {
                System.out.println("votre travail est Assez-Bien");
            }
            else if (noteDevoir >= 10 && noteDevoir < 12) {
                System.out.println("votre travail est Passable");
            }
            else {
                System.out.println("votre travail est Insuffisant");
            }
            //return niveau;

        }
    }





