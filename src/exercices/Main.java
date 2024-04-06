package exercices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("\n\t Entrez une chaine de caractere : ");
        Scanner sc = new Scanner(System.in);
        String maChaine = sc.nextLine().toLowerCase();

//        String maChaine = args[0].toLowerCase();
        int nbVoyelles = 0;

        for(char car : maChaine.toCharArray()){
            if(car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u' || car == 'y'){
                nbVoyelles++;
            }
        }
        System.out.println("\n\t Le nombre de voyelles dans la chaine est de : " + nbVoyelles);
    }


}
