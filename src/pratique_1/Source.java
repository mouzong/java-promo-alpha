package pratique_1;

import java.util.Arrays;
import java.util.Scanner;

public class Source {
    public static int AfficheMenu() {
        System.out.println("===================MENU PRINCIPAL================  " +
                "\n\t1.jus de raisin-----------------1000 FCFA  " +
                "\n\t2.jus d'orange------------------1200 FCFA  " +
                "\n\t3.jus de papaye-----------------1500 FCFA  " +
                "\n\t4.eau minérale-------------------500 FCFA  " +
                "\n\t5.jus de gingimbre--------------2000 FCFA  " +
                "\n\t6.sortir du programme  \n\t \n\tVotre choix ");
        return 0;
    }
    public static String filiation(String nom, String prenom, String filiere, int niveau) {
        Scanner sc = new Scanner(System.in);
        String tab[] = new String[4];
        System.out.println("Entrez vos données dans l'ordre suivant Nom, Prenom, Filiere et Niveau : ");
        for (int i = 0; i < 4; i++) {
            tab[i] = sc.next();
        }
        System.out.println("Les éléments entrées sont : " + Arrays.toString(tab));
        System.out.println("votre nom est : " + tab[0] + ", votre prenom est : " +tab[1] + ", votre filiere "+tab[2]+" et vous êtes au niveau "+tab[3]);

        return filiation(nom, prenom, filiere, niveau);

    //public static String filiation(String nom, String prenom, String filiere, int niveau) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println(" Bien vouloir entrer le nom");
        //nom = sc.nextLine();
        //System.out.println(" Bien vouloir entrer le prenom");
        //prenom = sc.nextLine();
        //System.out.println(" Bien vouloir entrer la filiere");
        //filiere = sc.nextLine();
        //System.out.println(" Bien vouloir entrer le niveau");
        //niveau = sc.nextInt();

        //return filiation(nom, prenom, filiere, niveau);
    }
}

