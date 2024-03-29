import java.util.Scanner;

public class Paire_table {

    public static void main(String[] args) {
        int a;
        int i = 0;
        // Créer un objet Scanner pour lire l'entrée
        Scanner console = new Scanner(System.in);

        System.out.println("Entrez un nombre : ");

        a = console.nextInt();

        // On verifie si le nombre est paire
        if (a % 2 == 0) {
            System.out.println(a + " est un nombre paire sa table de multiplication est :\n" +
                    "\t \t" + a * ++i + " \n" +
                    "\t \t" + a * ++i + " \n" +
                    "\t \t" + a * ++i + " \n" +
                    "\t \t" + a * ++i + " \n" +
                    "\t \t" + a * ++i + " \n" +
                    "\t \t" + a * ++i + " \n" +
                    "\t \t" + a * ++i + " \n" +
                    "\t \t" + a * ++i + " \n" +
                    "\t \t" + a * ++i + " \n" +
                    "\t \t" + a * ++i + " \n" +
                    "\t \t" + a * ++i + " \n" +
                    "\t \t" + a * ++i + " \n");
        } else System.out.println(a + " n\'est pas un nombre paire");
    }

}
