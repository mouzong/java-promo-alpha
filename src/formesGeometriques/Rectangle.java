package formesGeometriques;

public class Rectangle extends Forme {
   private int longueur = 12;
    private int largeur = 20;

    @Override
    public double calculerSurface() {
        return longueur*largeur;
    }
}
