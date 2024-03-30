public class Exercices1_3 {

    public static void main(String[] args) {

        //Vérifie si le nombre d'argument est différent de 1;

        int nbreChoisi = 6; //choix fait
        //Exercice 1: Multiplication d'un nombre de notre choix

        System.out.println("Exercice 1\n==========Table de multiplication de " + nbreChoisi + "==========\n");
        for (int j = 1; j <= 12; j++) {
            System.out.println("\t\t\t" + nbreChoisi + "x" + j + "=" + nbreChoisi * j + "\n");
        }


        //Exercice 2 Multiplication des nombres de 1 à 9

        final int nbreDepart = 1; //Affectation du nombre de départ (constante)
        System.out.println("Exercice 2\n==========Table de multiplication de 1 à 9==========\n");
        //bloc 1 à 3
        System.out.println("-------------------------------------------------");
        for (int j = 1; j <= 12; j++) {
            System.out.println("|\t" + nbreDepart + "x" + j + "=" + nbreDepart * j + "\t|\t" + (nbreDepart + 1) + "x" + j + "=" + (nbreDepart + 1) * j + "\t|\t" + (nbreDepart + 2) + "x" + j + "=" + (nbreDepart + 2) * j + "\t|");
        }
        System.out.println("-------------------------------------------------");


        //bloc 4 à 6
        for (int j = 1; j <= 12; j++) {
            System.out.println(
                    "|\t" + (nbreDepart + 3) + "x" + j + "=" + (nbreDepart + 3) * j + "\t|\t" + (nbreDepart + 4) + "x" + j + "=" + (nbreDepart + 4) * j + "\t|\t" + (nbreDepart + 5) + "x" + j + "=" + (nbreDepart + 5) * j + "\t|");
        }
        System.out.println("-------------------------------------------------");


        //bloc 7 à 9
        for (int j = 1; j <= 12; j++) {
            System.out.println("|\t" + (nbreDepart + 6) + "x" + j + "=" + (nbreDepart + 6) * j + "\t|\t" + (nbreDepart + 7) + "x" + j + "=" + (nbreDepart + 7) * j + "\t|\t" + (nbreDepart + 8) + "x" + j + "=" + (nbreDepart + 8) * j + "\t|");
        }
        System.out.println("-------------------------------------------------");


        //Exercice 3 Ecrire un programme java qui calcule et affiche la moyenne de trois nombre entier au hasard
        int nbre1= (int) (Math.random()*1001);
        int nbre2=(int)(Math.random()*1001);
        int nbre3=(int)(Math.random()*1001);
        System.out.println("La moyenne entre "+nbre1+","+nbre2+","+nbre3+" est de "+(nbre1+nbre2+nbre3)/3);

    }
}


