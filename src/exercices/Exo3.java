package exercices;

public class Exo3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = 6;

        int sum = a + b + c;
        float moyenne = sum / 3;

        // ctrl + alt + l : formater le code.
        System.out.println("Les nombres sont : " + a + ", " + b + " et " + c);
        System.out.println("La somme :  "+ a +" + "+ b +" + " + c +" = " + sum);
        System.out.println("La moyenne de "+ a + ", "+ b +" et "+ c +" est : " + moyenne);
    }
}
