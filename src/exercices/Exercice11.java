package exercices;

import java.util.*;

public class Exercice11 {
    public static void main(String[] args) {
        // Ecrire un programme java qui demande à un utilisateur de choisir parmis les entrées de menu
        // d'une calculatrice puis demande deux nombres et éffectue une opération arithmétique
        // sur la base du choix de l'utilisateur.


        System.out.println("cours.Menu de la calculatrice");
        System.out.println("-----------------");
        System.out.println("1) Addition");
        System.out.println("2) Soustraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.println("5) Modulo");
        System.out.println("-----------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quelle opération souhaitez-vous effectuer?");
        int signe = scanner.nextInt();


        if (signe==1) {
            System.out.println("Vous avez choisi de faire une addition, bien vouloir renseigner 2 nombres");
            double nbreChoisi1 = scanner.nextDouble();
            double nbreChoisi2 = scanner.nextDouble();
            System.out.println("Le resultat de l'addition entre "+nbreChoisi1+" et "+nbreChoisi2+" est "+(nbreChoisi1+nbreChoisi2));


        }else if(signe==2){
            System.out.println("Vous avez choisi de faire une soustraction, bien vouloir renseigner 2 nombres");
            double nbreChoisi1 = scanner.nextDouble();
            double nbreChoisi2 = scanner.nextDouble();
            System.out.println("Le resultat de la soustraction entre "+nbreChoisi1+" et "+nbreChoisi2+" est "+(nbreChoisi1-nbreChoisi2));

        }else if(signe==3){
            System.out.println("Vous avez choisi de faire une multiplication bien vouloir renseigner 2 nombres");
            double nbreChoisi1 = scanner.nextDouble();
            double nbreChoisi2 = scanner.nextDouble();
            System.out.println("Le resultat de la multiplication entre "+nbreChoisi1+" et "+nbreChoisi2+" est "+(nbreChoisi1*nbreChoisi2));

        }else if(signe==4){
            System.out.println("Vous avez choisi de faire une division bien vouloir renseigner 2 nombres");
            double nbreChoisi1 = scanner.nextDouble();
            double nbreChoisi2 = scanner.nextDouble();
            if(nbreChoisi2!=0){
                System.out.println("Le resultat de la division entre "+nbreChoisi1+" et "+nbreChoisi2+" est "+(nbreChoisi1/nbreChoisi2));
            }else{
                System.out.println("Impossible de diviser un nombre par 0");
            }


        }else if(signe==5) {
            System.out.println("Vous avez choisi de faire un modulo bien vouloir renseigner 2 nombres");
            double nbreChoisi1 = scanner.nextDouble();
            double nbreChoisi2 = scanner.nextDouble();
            System.out.println("Le resultat de la modulo entre " + nbreChoisi1 + " et " + nbreChoisi2 + " est " + (nbreChoisi1 % nbreChoisi2));
        }else{
            System.out.println("Aucun choix n'a été fait");
        }


            scanner.close();
    }
}
