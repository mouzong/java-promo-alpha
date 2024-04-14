package exercicesCours;

public class TableDeMultiplication_2 {
    public static void main(String[] args) {

        System.out.println("\t=============LA TABLE DE MULTIPLICATION DE 1 à 9 ==========  ");
        int tableau[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int j = 0; j < tableau.length; j++) {
            for (int i = 1; i <= 12; i++)
                System.out.println("\t\t\t\t\t\t" + tableau[j] + " x " + i + " = " + (tableau[j] * i));
        }
    }
}
