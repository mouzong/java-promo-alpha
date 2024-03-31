import java.util.Scanner;
import javax.swing.*;
public class Test_equation {

        public static final String ANSI_ROUGE = "\u001B[31m";
        public static final String ANSI_VERT = "\u001B[32m";
        public static final String ANSI_JAUNE = "\u001B[33m";
        public static final String ANSI_BLEU = "\u001B[34m";
        public static final String ANSI_BVIOLET = "\u001B[35m";
        public static final String ANSI_CYAN = "\u001B[36m";
        public static final String ANSI_BLANC = "\u001B[37m";
        public static final String ANSI_RESET = "\u001B[0m";
        //creation d'une méthode avec le mot 'affichetext' pour afficher du texte
        public static void affichetext(String s) {
        System.out.println(s);
        }
        //*******************************
        public static void main(String[] args) {
            //Appel de la methode pour afficher "Bonjour"
            affichetext("Bonjour");
            //******************
            // Resolution d'une equation de second degré
            System.out.println("Résolution d'une équation de second dégré dans z");
            System.out.println("une équation de second dégré est une équation de la forme ax2+bx+c=0 ");
            Scanner inputReader = new Scanner(System.in);
            System.out.println("Bien vouloir entrer la valeur de a de votre équation: ");
            int a = inputReader.nextInt();
            System.out.println("la valaleur entrée est: " + a);
            System.out.println("Bien vouloir entrer la valeur de b de votre équation: ");
            int b = inputReader.nextInt();
            System.out.println("la valaleur entrée est: " + b);
            System.out.println("Bien vouloir entrer la valeur de c de votre équation: ");
            int c = inputReader.nextInt();
            System.out.println("la valaleur entrée est: " + c);
            System.out.println("votre équation est de la forme: " + a +"x2+" +b +"x+" +c +"=0");

            double delta = b*b-4*a*c;
            System.out.println("la valaleur de Delta est: " + delta);
            // double racineCarree = Math.sqrt(delta);
            //System.out.println("la racine carrée de Delta est: " + racineCarree);

            if (delta==0) {
                System.out.println(ANSI_ROUGE + "X1=X2= " + (0-b)/2*a + ANSI_RESET );
            } else if (delta>0) {
                double racineCarree = Math.sqrt(delta);
                System.out.println(ANSI_VERT + "X1=" + (0-b-racineCarree)/2*a + " et X2="+(b-racineCarree)/2*a + ANSI_RESET);
            } else {
                double racineCarree = Math.sqrt(-delta);
                System.out.println("la racine carrée de Delta est: " + racineCarree);
                System.out.println(ANSI_BLEU + "X1= " + (-b/2*a) + "+i"+(racineCarree)/2*a + " et X2= " + (-b/2*a) + "-i" + (racineCarree)/2*a + ANSI_RESET);

            }
            //System.out.println("La racine carrée de " + nombre + " est : " + racineCarree);
            //----------------------------------------------------------------------------------------------
           /* JFrame frame = new JFrame("Equation de Second dégré");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 250);
            frame.setVisible(true);
            JLabel label = new JLabel("Bonjour, monde !");
            frame.add(label);
            label.setVisible(true);
            //JButton bouton = new JButton("OK");
            //frame.add(bouton);
            //bouton.setVisible(true);

            //---JButton, JTable, JMenu, etc.*/
        }

    }

