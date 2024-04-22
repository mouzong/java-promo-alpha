package exercices;

public class ExoString1 {
    public static void main(String[] args) {
        //Exercice 7 Ecrire un programme qui permet de compter le nombre de voyelles dans une chaine
        // de caractères.
        //-Entrée en argument de la ligne de commande

        //Exercice 10: Etendre l'exercice 7 de manière à afficher le nombre de voyelles de chaque mot
        // dans une chaine de caractère.
        //         *  Resultat attendu:
        //         *  chaine de depart : "Hello World"
        //         *  - "Hello => 2 voyelles"
        //         *  - "World" => "World => 1 voyelle"


        if (args.length == 1) {  //Vérifie le nombre d'argument passé dans la console
            //cas: Nombre d'argument=1

            String chaineChoisie = args[0].toLowerCase();                      // Affectation de l'argument à une variable interne

            String voyelle = "aeiouy";                                         //Création d'un tableau contenant les voyelles

            int compteurVoyelle = 0;                                           //Initialisation du compteur de voyelle.

            String[] compteurMot = chaineChoisie.split("['.,;:?\\s+]");  //choix des séparateurs et découpage de la chaine en mot

            for (String mot : compteurMot) {                                  //boucle sur le tableau des mots

                if (!mot.isEmpty()) {                                        //Vérifie si le mot est différent du vide

                    for (int i = 0; i < mot.length(); i++) {                 //boucle sur le mot en cours pour compter le nombre de voyelle

                        String v = String.valueOf(mot.charAt(i));

                        if (voyelle.contains(v)) {

                            compteurVoyelle += 1;
                        }
                    }

                }
                if (compteurVoyelle <= 1) {

                    System.out.println(mot + " => " + compteurVoyelle + " voyelle.");

                } else {

                    System.out.println(mot + " => " + compteurVoyelle + " voyelles.");

                }

                compteurVoyelle = 0;

            }

        } else if (args.length > 1) { //cas: Nombre d'argument>1

            for (int x = 0; x < args.length; x++) {

                String chaineChoisie = args[x].toLowerCase();

                String voyelle = "aeiouy";

                int compteurVoyelle = 0;

                String[] compteurMot = chaineChoisie.split("['.,;:?\\s+]");


                for (String mot : compteurMot) {

                    if (!mot.isEmpty()) {

                        for (int i = 0; i < mot.length(); i++) {

                            String v = String.valueOf(mot.charAt(i));

                            if (voyelle.contains(v)) {

                                compteurVoyelle += 1;

                            }

                        }

                    }

                    if (compteurVoyelle <= 1) {

                        System.out.println(mot + " => " + compteurVoyelle + " voyelle.");

                    } else {

                        System.out.println(mot + " => " + compteurVoyelle + " voyelles.");
                    }

                    compteurVoyelle = 0;

                }

            }

        } else {

            //cas: Nombre d'argument<=0

            System.out.println("Le nombre d'argument passé n'est pas correct");
        }

    }
}
