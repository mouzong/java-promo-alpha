import java.util.Scanner;

public class MultiplicationNbre {
    public static void main(String[] args) {
        Scanner clavier = new Scanner( System.in);
        System.out.println("Veuillez saisir le premier nombre");
        int PremierNbre =clavier.nextInt();
        System.out.println("Veuillez saisir le deuxieme nombre");
        int DeuxiemNbre= clavier.nextInt();

        int Multiplication=PremierNbre*DeuxiemNbre;
        System.out.println("la Multiplication de" + "\t"+ PremierNbre+ "\tpar\t" + DeuxiemNbre+ "\t,"+"\tdonne" + "=\t"+Multiplication);
    }

}
