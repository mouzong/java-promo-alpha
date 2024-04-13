package Exercice13042024;


public class PointEntree {
    public static void main(String[] args) {


        BoiteOutils util = new BoiteOutils();
        util.afficheMenu();
        util.choix();
        if (util.choix() == 1) {
            System.out.println("\t" + util.enregUtil());
        } else {
            System.out.println("\tChoix non configuré");
        }


    }

}
