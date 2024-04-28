package formesGeometriques;

import static java.lang.Math.PI;

public class Cercle extends Forme{
     private int rayon = 5 ;

    @Override
    public double calculerSurface() {

        return rayon*rayon*PI;
    }
}
