public class Boucles {
    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            System.out.println("i = " + i);
//        }
        // index de jours    0        1         2          3         4          5          6
        String[] jours = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};

        System.out.println("Jours de la semaine : ");
        System.out.println("----------------------");
//        System.out.println(jours[0]);
//        System.out.println(jours[1]);
//        System.out.println(jours[2]);
//        System.out.println(jours[3]);
//        System.out.println(jours[4]);
//        System.out.println(jours[5]);
//        System.out.println(jours[6]);

//        for (int i = 0; i < jours.length; i++) {
//            System.out.print("Jour : "+jours[i]);
//            System.out.println(" - taille : "+jours[i].length());
//        }

//        for(String jour : jours) {
//            System.out.print("Jour : "+jour);
//            System.out.println(" - taille : "+jour.length());
//        }

        int[] tab = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for(int nombre : tab){
            System.out.println(nombre);

        }


    }
}
