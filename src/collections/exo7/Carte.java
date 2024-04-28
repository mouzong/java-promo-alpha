package collections.exo7;

import java.util.Collection;

public abstract class Carte {
    protected String valeur;
    protected String couleur;

    public Carte() {
    }

    public Carte(String valeur, String couleur) {
        this.valeur = valeur;
        this.couleur = couleur;
    }

    public abstract void afficherDetails();
    public abstract void afficherListe(Collection collection);
}
