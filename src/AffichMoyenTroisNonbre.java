import java.util.Scanner;

public class AffichMoyenTroisNonbre {
    public static void main(String[] args) {
        Scanner clavier = new Scanner( System.in);
        System.out.println("Veuillez saisir le premier nombre");
        int PremierNbre =clavier.nextInt();
        System.out.println("Veuillez saisir le deuxieme nombre");
        int DeuxiemNbre= clavier.nextInt();
        System.out.println("Veuillez saisir le troisieme nombre");
        int TroisiemNbre= clavier.nextInt();
        int Moyenne;
        double Resultat;
        Moyenne=PremierNbre+DeuxiemNbre+TroisiemNbre;
        Resultat=Moyenne/3;

        System.out.println("la moyenne de \t"+ PremierNbre+ "\t," + DeuxiemNbre+ "\t,"+TroisiemNbre + "\tdonne" + "=\t"+Resultat);


    }

}
