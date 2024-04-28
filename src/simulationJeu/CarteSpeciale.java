package simulationJeu;

public class CarteSpeciale extends Carte{
    private String valeur = " Dame de coeur";
    private String couleur = " Noire ";
    @Override
    public void afficherDetails() {
        System.out.println("\t\tLa valeur de la carte spéciale est: " + valeur);
        System.out.println("\t\tLa couleur de la carte spéciale est: " + couleur);
    }
}
