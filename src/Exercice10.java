
import java.util.*;

public class Exercice10 {
    public static void main(String[] args) {
        //Exercice 10: Ecrire un programme java qui calcule et
        // affiche la table de multiplication d'un nombre entré au clavier
        // par un utilisateur.
        // Le programme doit afficher le resultat de votre table sous forme de tableau et
        // stocker toutes les operations dans un tableau a deux dimensions.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre choisi: ");
        int nbreChoisi = scanner.nextInt();
        scanner.nextLine();
        String[][] tab_multiplication = {{nbreChoisi + "x1=" + nbreChoisi,       //Affectation du 1er élément [0][0] .
                nbreChoisi + "x2=" + nbreChoisi * 2,                             //Affectation du 2ième élément [0][1].
                nbreChoisi + "x3=" + nbreChoisi * 3,                             //Affectation du 3ième élément [0][2].
                nbreChoisi + "x4=" + nbreChoisi * 4,                             //Affectation du 4ième élément [0][3].
                nbreChoisi + "x5=" + nbreChoisi * 5,                             //Affectation du 5ième élément [0][4].
                nbreChoisi + "x6=" + nbreChoisi * 6,                             //Affectation du 6ième élément [0][5].
                nbreChoisi + "x7=" + nbreChoisi * 7,                             //Affectation du 7ième élément [0][6].
                nbreChoisi + "x8=" + nbreChoisi * 8,                             //Affectation du 8ième élément [0][7].
                nbreChoisi + "x9=" + nbreChoisi * 9,                             //Affectation du 9ième élément [0][8].
                nbreChoisi + "x10=" + nbreChoisi * 10,                           //Affectation du 10ième élément [0][9].
                nbreChoisi + "x11=" + nbreChoisi * 11,                           //Affectation du 11ième élément [0][10].
                nbreChoisi + "x12=" + nbreChoisi * 12}};                         //Affectation du 12ième élément [0][11].

        System.out.println("---Table de multiplication de " + nbreChoisi + "---");
        System.out.println("\t\t_______________");
        System.out.println(
                "\t\t|\t" + tab_multiplication[0][0] + //nbreChoisi*1
                        "\t\t|\n\t\t|\t" + tab_multiplication[0][1] +   //nbreChoisi*2
                        "\t\t|\n\t\t|\t" + tab_multiplication[0][2] +   //nbreChoisi*3
                        "\t\t|\n\t\t|\t" + tab_multiplication[0][3] +   //nbreChoisi*4
                        "\t\t|\n\t\t|\t" + tab_multiplication[0][4] +   //nbreChoisi*5
                        "\t\t|\n\t\t|\t" + tab_multiplication[0][5] +   //nbreChoisi*6
                        "\t\t|\n\t\t|\t" + tab_multiplication[0][6] +   //nbreChoisi*7
                        "\t\t|\n\t\t|\t" + tab_multiplication[0][7] +   //nbreChoisi*8
                        "\t\t|\n\t\t|\t" + tab_multiplication[0][8] +   //nbreChoisi*9
                        "\t\t|\n\t\t|\t" + tab_multiplication[0][9] +   //nbreChoisi*10
                        "\t\t|\n\t\t|\t" + tab_multiplication[0][10] +    //nbreChoisi*11
                        "\t\t|\n\t\t|\t" + tab_multiplication[0][11] + "\t\t|"); //nbreChoisi*12
        System.out.println("\t\t--------------");
    }
}
