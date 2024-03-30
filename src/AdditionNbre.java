import java.util.Scanner;

public class AdditionNbre {
    public static void main(String[] args) {
        Scanner clavier = new Scanner( System.in);
        System.out.println("Veuillez saisir le premier nombre");
        int PremierNbre =clavier.nextInt();
        System.out.println("Veuillez saisir le deuxieme nombre");
        int DeuxiemNbre= clavier.nextInt();

        int Addition=PremierNbre+DeuxiemNbre;
        System.out.println("l'Addition de" + "\t"+ PremierNbre+ "\t," + DeuxiemNbre+ "\t,"+"\tdonne" + "=\t"+Addition);
    }
}
