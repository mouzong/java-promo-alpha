package exo_7;

import simulationJeu.Carte;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainCarte {
    public static void main(String[] args) {


     Carte Cn = new CarteNormale("treffle", "Rouge");
     Carte Cs = new CarteSpeciale("Dame", "Noir");

     Cn.afficherDetails();
     Cs.afficherDetails();


//
//        System.out.println(" ====== Detail de la carte normale ======");
//        Cn.afficherDetails();
//
//        System.out.println("-----------------------------------------------------------");
//        System.out.println(" ====== Detail de la carte spéciale ======");
//        Cs.afficherDetails();

    }
}
