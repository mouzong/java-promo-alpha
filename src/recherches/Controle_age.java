package recherches;

import java.util.Scanner;

public class Controle_age {
    public static void main(String[] args) {
        // Controle de l'age du vote

        System.out.println("\t\n=====Controle de l'âge du vote=====");

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Bien vouloir entrer votre âge : ");
        int age = inputReader.nextInt();
        System.out.println("l'âge entrée est: " + age);
        if (age < 18)
            System.out.println("Vous êtes mineur, vous n'êtes pas éligible au vote ");
        else
            System.out.println("Vous êtes adulte et éligible au vote");

    }
}
