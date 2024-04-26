package exercices.Classes.FormeGeometrique;

public class Cercle extends Forme{
    Double rayon;
    final Double pi=3.14;

    public Cercle(Double rayon) {
        this.rayon = rayon;
    }

    public Cercle() {
    }

    @Override
    public double calculSurface() {
        return pi*rayon;
    }

    public Double getRayon() {
        return rayon;
    }

    public void setRayon(Double rayon) {
        this.rayon = rayon;
    }

    public Double getPi() {
        return pi;
    }
}
