package recherches;

import java.util.Arrays;
import java.util.Scanner;

public class Test_Tableau_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String tab[] = new String[4];
        System.out.println("Entrez les éléments du tableau (chaînes de caractères) : ");
        for (int i = 0; i < 4; i++) {
            tab[i] = sc.next();
        }
        System.out.println("Les éléments du tableau : " + Arrays.toString(tab));
    }
}
