package poo.abstraction;

public class Triangle extends Figure{
    private double hauteur;
    private double base;

    public Triangle(double hauteur, double base) {
        this.hauteur = hauteur;
        this.base = base;
    }

    @Override
    double calculerSurface() {
        return (base * hauteur) / 2;
    }
}
