package formesGeometriques;

public class Carre extends Forme {
    private int cote = 15;

    @Override
    public double calculerSurface() {

        return cote*cote;
    }
}
