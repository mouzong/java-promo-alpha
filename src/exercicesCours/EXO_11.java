package exercicesCours;

import java.util.Scanner;

public class EXO_11 {
    public static final String ANSI_ROUGE = "\u001B[31m";
    public static final String ANSI_VERT = "\u001B[32m";
    public static final String ANSI_JAUNE = "\u001B[33m";
    public static final String ANSI_BLEU = "\u001B[34m";
    public static final String ANSI_BVIOLET = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLANC = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        System.out.println(ANSI_BLEU+" [=======MENU CHOIX DE L'OPERATION ARITHMETIQUE A EFFECTUER=======]  " +ANSI_RESET+
                ANSI_VERT+"\n|\tADDITION----------------------------------------------[ 1 ] " +"|\t"+
                "\n|\tSOUSTRACTION------------------------------------------[ 2 ] " +"|\t"+
                "\n|\tMULTIPLICATION----------------------------------------[ 3 ] " +"|\t"+
                "\n|\tDIVISION----------------------------------------------[ 4 ] " +"|\t");
        System.out.println(ANSI_BLEU+"[================================================================]"+ANSI_RESET );
        System.out.println("veuillez entrer le numero correspondant à l'opération que vous souhaitez effectuer");

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Bien vouloir entrer votre choix : ");
        int choix  = inputReader.nextInt();

        if (choix == 1) {
            System.out.println("Vous avez choisi d'effectuer l'addition de deux nombres a et b");
            System.out.println("Bien vouloir entrer la valeur de a : ");
            int a = inputReader.nextInt();
            System.out.println("la valaleur de a entrée est: " + a);
            System.out.println("Bien vouloir entrer la valeur de b : ");
            int b = inputReader.nextInt();
            System.out.println("la valaleur de b entrée est: " +b);
            double operation = (a + b);
            System.out.println("\na + b = " + operation);
            //double racineCarree = Math.sqrt(operation);
            //System.out.println(ANSI_ROUGE+"Racine carée = " + racineCarree + ANSI_RESET);
        }

        else if (choix == 2) {
            System.out.println("Vous avez choisi d'effectuer la soustraction de deux nombres a et b");
            System.out.println("Bien vouloir entrer la valeur de a : ");
            int a = inputReader.nextInt();
            System.out.println("la valaleur de a entrée est: " + a);
            System.out.println("Bien vouloir entrer la valeur de b : ");
            int b = inputReader.nextInt();
            System.out.println("la valaleur de b entrée est: " +b);
            double operation = (a - b);
            System.out.println(ANSI_CYAN+"a - b = " + operation+ANSI_RESET);
        }
        else if ( choix == 3) {
            System.out.println("Vous avez choisi d'effectuer la multiplication de deux nombres a et b");
            System.out.println("Bien vouloir entrer la valeur de a : ");
            int a = inputReader.nextInt();
            System.out.println("la valaleur de a entrée est: " + a);
            System.out.println("Bien vouloir entrer la valeur de b : ");
            int b = inputReader.nextInt();
            System.out.println("la valaleur de b entrée est: " +b);
            double operation = (a * b);
            System.out.println(ANSI_CYAN+"a x b = " + operation+ANSI_RESET);
        }
        else if (choix == 4) {
            System.out.println("ous avez choisi d'effectuer la division de deux nombres a et b");
            System.out.println("Bien vouloir entrer la valeur de a : ");
            float a = inputReader.nextFloat();
            System.out.println("la valaleur de a entrée est: " + a);
            System.out.println("Bien vouloir entrer la valeur de b : ");
            float b = inputReader.nextFloat();
            System.out.println("la valaleur de b entrée est: " +b);
            double operation =  a / b ;
            System.out.println(ANSI_CYAN+"a / b = " + operation+ANSI_RESET);
        }
        else  {
            System.out.println(ANSI_ROUGE+"votre choix n'est pas valide, veuillez entrer un nombre compris entre 1 et 4 "+ANSI_RESET);
        }

    }
}
