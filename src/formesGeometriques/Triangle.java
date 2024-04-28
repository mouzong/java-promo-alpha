package formesGeometriques;

public class Triangle extends Forme {
   private int base = 4;
   private int hauteur = 8;

    @Override
    public double calculerSurface() {
        return (base * hauteur) / 2;
    }
}
