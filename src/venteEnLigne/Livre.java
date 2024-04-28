package venteEnLigne;

public class Livre extends Produit {
    private String nom = " 'Comment se faire des amis' ";
    private int prix = 15000;

    @Override
    public double calculTVA() {
        return (double) prix * 19.25 / 100;
    }

    @Override
    public void afficheDetails() {

        System.out.println("\t\tNom du produit: " + nom);
        System.out.println("\t\tPrix du produit: " + prix);
    }
}
