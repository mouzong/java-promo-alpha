package recherches;

import java.util.Scanner;

public class Decoupe_Chaine {
    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);
        System.out.println("Ce programme permet de decomposer une chaine de caractere en mots : ");
        System.out.println("veuillez entrer votre chaine de caractere : ");
        String str = saisie.nextLine().toLowerCase();
        //String str = "J'aime le Java";
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}


