public class Exercices8 {
    public static void main(String[] args) {

        //Exercice 8 Ecrire un programme java qui affiche la table de multiplication d'un nombre pair.
        // Le programme doit controler et afficher uniquement les multiples differents du nombre considéré.

        if (args.length == 1) {
            int nbreChoisi = Integer.parseInt(args[0]);
            if (nbreChoisi % 2 == 0) {
                System.out.println("Exercice 8\n ==========Table de multiplication de " + nbreChoisi + "==========\n");
                for (int j = 1; j <= 12; j++) {
                    if (nbreChoisi != (nbreChoisi * j) ) {
                        System.out.println("\t\t\t" + nbreChoisi + "x" + j + "=" + nbreChoisi * j + "\n");
                    } else {

                    }

                }

            } else {
                System.out.println("Bien vouloir renseigner un nombre pair");
            }

        } else {
            System.out.println("Un seul paramètre est requis");
        }
    }
}
