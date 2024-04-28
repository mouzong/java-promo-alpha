package recherches;

import java.util.Scanner;

public class Test_Methode {
    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre à calculer");
        int a = saisie.nextInt();
        int calcul = calculCarre(a);
        System.out.print("Le carré de " + a + " = " + calcul);

    }

    public static int calculCarre(int x) {
        int carre = x * x;
        return carre;
    }

    public String[] recPerso(Scanner saisie) {
        String[] perso = new String[4];
        System.out.print("\n\t Veuillez entrer votre nom: ");
        perso[0] = saisie.nextLine().toUpperCase();
        System.out.print("\n\t Veuillez entrer votre prenom: ");
        perso[1] = saisie.nextLine().toUpperCase();
        System.out.print("\n\t Veuillez entrer votre filiere: ");
        perso[2] = saisie.nextLine().toUpperCase();
        System.out.print("\n\t Veuillez entrer votre lieu de residence: ");
        perso[3] = saisie.nextLine().toUpperCase();
        return perso;
    }

    public void affichePerso(String[] perso) {
        System.out.println(" =======Information détaillée sur l'utilisation========");
        System.out.println("\t\t Votre nom est: " + perso[0]);
        System.out.println("\t\t Votre prenom est: " + perso[1]);
        System.out.println("\t\t Votre filière est: " + perso[2]);
        System.out.println("\t\t Votre residence est: " + perso[3]);
    }
    public double Delta(double a, double b, double c){
        double valeur = b*b - 4*a*c;
        return valeur;
    }

}
