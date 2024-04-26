package exercices.Classes.VentesEnLigne;

public class Livre extends Produit{


    public Livre(int id, String nom, int prix) {
        super(id, nom, prix);
    }

    public Livre() {
    }

    @Override
    public void afficheDetail() {
        System.out.println("\tId: "+id+"\n\tNom: "+nom+"\n\tPrix: "+prix);
    }

    @Override
    public Double TVA() {
        return prix*(19.25/100);
    }
}
