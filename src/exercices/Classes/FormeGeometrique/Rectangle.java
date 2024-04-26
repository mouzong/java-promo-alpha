package exercices.Classes.FormeGeometrique;

public class Rectangle extends Forme{
    Double longueur;
    Double largeur;

    public Rectangle(){
    }

    public Rectangle(Double longueur, Double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double calculSurface() {
    return longueur*largeur;
    }

    public Double getLongueur() {
        return longueur;
    }

    public void setLongueur(Double longueur) {
        this.longueur = longueur;
    }

    public Double getLargeur() {
        return largeur;
    }

    public void setLargeur(Double largeur) {
        this.largeur = largeur;
    }
}
