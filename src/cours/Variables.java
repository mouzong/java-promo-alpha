package cours;

public class Variables {
    public static void main(String[] args) {
        // Déclaration de variables
        // <type-de-la-variable> <nom-de-la-variable> = <valeur-de-la-variable>;

        int x;
        int age = 15;
        int Age = 15;
        double taille = 1.75;
        String prenom = "Andreas";
        String nom = new String("KOUAME");
        char sexe = 'M';
        boolean estEtudiant = true;
        boolean est_etudiant = true;

        // underscore literal
        int million = 1_000_000;
        System.out.println("\n\t Million : "+ million+"\n");
        int mil = 1000000;

        final double PI = 3.14159265358979323846;

//        PI = 2.45;


        // Affichage des variables
        System.out.println("Age : " + age);
        System.out.println("Taille : " + taille);
        System.out.println("Prénom : " + prenom);
        System.out.println("Nom : " + nom);
        System.out.println("Sexe : " + sexe);
        System.out.println("Est étudiant : " + estEtudiant);
    }

}
