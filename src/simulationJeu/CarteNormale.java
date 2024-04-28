package simulationJeu;

public class CarteNormale extends Carte{
    private String valeur = " Dix de trefle ";
    private String couleur = " Rouge ";
    @Override
    public void afficherDetails() {
        System.out.println("\t\tLa valeur de la carte normale est: " + valeur);
        System.out.println("\t\tLa couleur de la carte normale est: " + couleur);
    }
}
