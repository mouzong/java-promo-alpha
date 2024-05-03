package exercices.Collections;


import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public abstract class Carte {
    protected String couleur;
    protected String valeur;
    public abstract void afficheDetail(Collection collection);

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public Carte() {
    }
}
