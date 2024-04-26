package exercices.Classes.VentesEnLigne;

public abstract class Produit {
    int id;
    String nom;
    int prix;

    public Produit(int id, String nom, int prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    protected Produit() {
    }

    public abstract void afficheDetail();
    public abstract Double TVA();
}
