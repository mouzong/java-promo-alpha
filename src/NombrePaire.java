import java.util.Scanner;

public class NombrePaire {
    public static final String ANSI_BLEU = "\u001B[34m";
    public static final String ANSI_ROUGE = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
                    // table de multiplication des nombres paires
            System.out.println("============TABLE DE MULTIPLICATION DES NOMBRES PAIRES===========");

            Scanner inputReader = new Scanner(System.in);
            System.out.println(ANSI_BLEU+"Bien vouloir entrer la valeur du nombre : "+ANSI_RESET);
            int valeur = inputReader.nextInt();
            System.out.println("la valaleur entrée est: " + valeur);
            int a = 2;
            int test = (valeur % a);
            //System.out.println( " La valeur test est: " +test);
            if (test > 0)
                System.out.println(ANSI_ROUGE+" Votre nombre est impaire je ne fais rien"+ANSI_RESET);
            else
                System.out.println("Votre nombre est paire sa table de multiplication est: " + "\n\t" +valeur+ " x 1 = "
                        + (valeur * 1)+"\n\t" +valeur+ " x 2 = " + (valeur * 2)+"\n\t" +valeur+ " x 3 = "
                        + (valeur * 3)+"\n\t" +valeur+ " x 4 = " + (valeur * 4)+"\n\t" +valeur+ " x 5 = "
                        + (valeur * 5)+"\n\t" +valeur+ " x 6 = " + (valeur * 6)+"\n\t" +valeur+ " x 7 = "
                        + (valeur * 7)+"\n\t" +valeur+ " x 8 = " + (valeur * 8)+"\n\t" +valeur+ " x 9 = "
                        + (valeur * 9)+"\n\t" +valeur+ " x 10 = " + (valeur * 10));
        }
    }

