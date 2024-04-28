package venteEnLigne;

public class Electronique extends Produit{
    private String nom = "ORDINATEUR";
    private int prix = 250000;

    @Override
   public double calculTVA() {
        return prix*19.25/100;
    }

    @Override
   public void afficheDetails() {
        System.out.println("\t\tNom du produit: " +nom);
        System.out.println("\t\tPrix du produit: " +prix);
    }
}
