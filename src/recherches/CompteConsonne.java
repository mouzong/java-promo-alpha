package recherches;

import java.util.Scanner;

public class CompteConsonne {
    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);
        System.out.print("Ce programme permet de compter les consonnes dans une chaine de caractere : ");
        System.out.print("veuillez entrer votre chaine de caractere : ");
        String chaine = saisie.nextLine().toLowerCase();
        int voyelles = 0;
        int consonnes = 0;

        for (int i = 0; i < chaine.length(); i++) {
            char c = chaine.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                voyelles++;
            } else if (c > 'a' && c <= 'z') {
                consonnes++;
            }
        }
        System.out.println("\til y'a " + consonnes + " consonnes dans la chaine");
    }
}


