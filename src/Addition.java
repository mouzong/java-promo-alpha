import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
            int a, b;
            // Créer un objet Scanner pour lire l'entrée
            Scanner console = new Scanner(System.in);

            System.out.println("Entrez 2 Nombres entiers : ");

            a= console.nextInt();
            b= console.nextInt();


            System.out.println("La Somme est = "+(a+b));



        }
    }
