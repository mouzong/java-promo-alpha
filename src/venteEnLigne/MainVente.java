package venteEnLigne;

public class MainVente {

    public static void main(String[] args) {

        Livre L1 = new Livre();
        Electronique E1 = new Electronique();

        System.out.println(" ====== Detail concernaant le livre ======");
        L1.afficheDetails();
        System.out.println(" ====== La TVA du livre ======"+"\n\t" +L1.calculTVA());
        System.out.println("-----------------------------------------------------------");
        System.out.println(" ====== Detail concernaant l'Electronique ======");
        E1.afficheDetails();
        System.out.println(" ====== La TVA de l'Electronique ======"+"\n\t" +E1.calculTVA());
    }
}
