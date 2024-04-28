package pratique_1;

import pratique_1.Source;
import recherches.Test_Methode;

import java.util.Scanner;

import static recherches.Test_Methode.calculCarre;

public class Pilote {
    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);
        //Source.AfficheMenu();
        //Source.filiation(" ALI", "MOHAMAN ","INFO ", 5);

        Test_Methode p1 = new Test_Methode();
        p1.affichePerso(p1.recPerso(saisie));
        System.out.println("la valeur du discriminant est " + p1.Delta(2,5,7));
        //Source.enregistrement( " ", " ", " ", 0);
    }
}
