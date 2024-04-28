package gestionEcole;

public class MainPersonne {
    public static void main(String[] args) {
        Personne P1 = new Personne();
        Etudiant E1 = new Etudiant();
        Professeur P2 = new Professeur();

        System.out.println("\n\t==== Détails sur la Personne ====");
         P1.afficherDetails();
        System.out.println("\n\t==== Détails sur l'Etudiant ====");
         E1.afficherDetails();
        System.out.println("\n\t==== Détails sur le Professeur ====");
         P2.afficherDetails();
    }
}
