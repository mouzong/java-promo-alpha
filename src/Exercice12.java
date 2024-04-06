public class Exercice12 {
    public static void main(String[] args) {
        //Exercice 12
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
