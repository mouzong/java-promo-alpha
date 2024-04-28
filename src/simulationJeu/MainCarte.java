package simulationJeu;

public class MainCarte {
    public static void main(String[] args) {
        Carte Cn = new CarteNormale();
        Carte Cs = new CarteSpeciale();

        System.out.println(" ====== Detail de la carte normale ======");
        Cn.afficherDetails();

        System.out.println("-----------------------------------------------------------");
        System.out.println(" ====== Detail de la carte spéciale ======");
        Cs.afficherDetails();

    }
}
