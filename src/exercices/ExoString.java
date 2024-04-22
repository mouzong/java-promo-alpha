package exercices;

public class ExoString {
    public static void main(String[] args) {

        /**
         * Exercice 1
         * Créez une variable de type String et initialisez-la avec la valeur "Hello World".
         * Affichez la valeur de la variable dans la console.
         *
         * Exercice 2
         * Etendre lexercice 1 de manière à afficher la longueur de la chaine de caractere.
         *
         * Exercice 3
         * Etendre l'exercice 2 de maniere à recuperer la valeur de la chaine en
         * argument de la ligne commande:
         *
         *  ex: java exercices.ExoString "Une autre chaines de caractères"
         *
         *  Exercice 4
         *  Etendre l'exercice 3 de manière à afficher la chaine de caractères en majuscule.
         *  Puis en minuscule.
         *
         *  Exercice 5
         *  Etendre l'exercice 4 de manière à recuperer deux chaine de caracteres
         *  en argument de la ligne de commande. et on verifie si les deux chaines sont identiques.
         *  puis on affiche un message adéquat.
         *
         *  Exercice 6
         *  Etendre l'exercice 5 de manière à verifier
         *  si la deuxieme chaine est contenue dans la premiere.
         *
         *  Exercice 7
         *  Ecrire un programme qui permet de compter le nombre de voyelles dans une chaine de caractères.
         *  entrée en argument de la ligne de comande
         *
         *  Exercice 8
         *  Ecrire un programme qui permet de compter le nombre de consonnes dans une chaine de caractères.
         *
         *  Exercice 9
         *  Ecrire un programme qui permet de compter le nombre de mots dans une chaine de caractères.
         *
         *  Exercice 10
         *  Etendre l'exercice 7 de manière à afficher le nombre de voyelles de chaque mot dans une chaine
         *  de caractere.
         *
         *  resultat attendu:
         *  chaine de depart : "Hello World"
         *  - "Hello => 2 voyelles"
         *  - "World" => "World => 1 voyelle"
         */

        //Exercice 1 & 2 & 3 & 4 & 5 & 6
        String hWorld = args[0];
        String hWorld1 = args[1];
        //Affichage programme et de sa taille
        //1ère chaine
        System.out.println("\n\tLa chaine de caractère est '" + hWorld + "'," + "\n\tet sa taille est de : " + hWorld.length() + " caractères.");

        //2ième chaine
        System.out.println("\tLa chaine de caractère est '" + hWorld1 + "'," + "\n\tet sa taille est de : " + hWorld1.length() + " caractères.");

        //Affichage de la majuscule et de la miniscule

        //1ère chaine
        System.out.println("\tla chaine '" + hWorld.toUpperCase() + "' est en majuscule" + "\n\tLa chaine " + hWorld.toLowerCase() + "' est en minuscule");

        //2ème chaine
        System.out.println("\tla chaine '" + hWorld1.toUpperCase() + "' est en majuscule" + "\n\tLa chaine '" + hWorld1.toLowerCase() + "' est en minuscule");


        //Comparaison entre 2 chaines
        int result = hWorld.compareToIgnoreCase(hWorld1);
        if (result == 0) {
            System.out.println("\tCes chaines de caractères sont identiques");
        } else {
            System.out.println("\tCes chaines de caractères ne sont pas identiques");
        }

        //Contenu des chaines
        boolean vraiFaux = hWorld1.contains(hWorld);
        if (vraiFaux) {
            System.out.println("\tLa chaine '" + hWorld1 + "' est contenue dans '" + hWorld + "'");
        } else {
            System.out.println("\tLa chaine '" + hWorld1 + "' n'est pas contenue dans '" + hWorld + "'");
        }


    }
}
