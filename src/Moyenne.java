import java.util.Scanner;

public class Moyenne {
    public static void main(String[] args) {
        int a, b, c;
        // Créer un objet Scanner pour lire l'entrée
        Scanner console = new Scanner(System.in);

        System.out.println("Entrez 3 chiffres : ");

        a= console.nextInt();
        b= console.nextInt();
        c= console.nextInt();

        System.out.println("La moyenne est = "+(a+b+c)/3);

    }
}
