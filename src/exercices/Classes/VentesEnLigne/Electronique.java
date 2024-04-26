package exercices.Classes.VentesEnLigne;

public class Electronique extends  Produit{


    public Electronique(int id, String nom, int prix) {
        super(id, nom, prix);
    }


    @Override
    public void afficheDetail() {
        System.out.println("\tId: "+id+"\n\tNom: "+nom+"\n\tPrix: "+prix);
    }

    public Electronique() {
    }

    @Override
    public Double TVA() {
        return prix*(19.25/100);
    }


}
