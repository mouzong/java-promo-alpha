package poo.abstraction;

public class Carre  extends  Figure{
    private double longueur;
    private double largeur;

    public Carre(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    double calculerSurface() {
        return longueur * largeur;
    }
}
