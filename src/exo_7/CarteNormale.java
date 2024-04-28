package exo_7;

import simulationJeu.Carte;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class CarteNormale extends Carte {
    private String valeur ;
    private String couleur ;

    public CarteNormale(String valeur, String couleur) {
        this.valeur = valeur;
        this.couleur = couleur;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarteNormale that = (CarteNormale) o;
        return Objects.equals(valeur, that.valeur) && Objects.equals(couleur, that.couleur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valeur, couleur);
    }

    @Override
    public String toString() {
        return "CarteNormale{" +
                "valeur='" + valeur + '\'' +
                ", couleur='" + couleur + '\'' +
                '}';
    }

    @Override
    public void afficherDetails() {
        Set<String> stringSet = new HashSet<>();

        stringSet.add(getValeur());
        stringSet.add(getCouleur());

        Iterator iterator = stringSet.iterator();

        System.out.println("\t\tLes details de la carte normale sont: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
