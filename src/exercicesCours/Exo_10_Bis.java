package exercicesCours;

import java.util.Scanner;

public class Exo_10_Bis {
    public static void main(String[] args) {
        int voyelles = 0;
        System.out.println("Ce programme permet de decomposer une chaine de caractere en mots : ");
        String str = "bonjour le monde";
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word + "\t" + "contient " + word.length() + " lettres.");
        }
    }
}

