package recherches;

import java.util.Arrays;
import java.util.Scanner;

public class Test_Tableau {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la taille du tableau : ");
        int size = sc.nextInt();
        String tab[] = new String[size];
        System.out.println("Entrez les éléments du tableau (chaînes de caractères) : ");
        for (int i = 0; i < size; i++) {
            tab[i] = sc.next();
        }
        System.out.println("Les éléments du tableau : " + Arrays.toString(tab));
    }
}


